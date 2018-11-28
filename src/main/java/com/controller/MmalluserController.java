package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.List;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.Cartandprodect;
import com.pojo.Mmallprodect;
import com.pojo.Mmalluser;
import com.service.IMmalluserService;
import com.util.Common;
import com.util.Email;

@Controller
@RequestMapping("/mmalluser")
public class MmalluserController {

	@Autowired
	IMmalluserService is;
	
	public void setIs(IMmalluserService is) {
		this.is = is;
	}

	//登陆验证
	@RequestMapping("/userlogin")
	public String userlogin(String role,String user,String password,HttpServletRequest req) {
		
		if(role==null||user==null||password==null||role.equals("")||user.equals("")||password.equals("")) {
			return "login";
		}
		Mmalluser mu = is.checkUser(role, user, password);
		if(mu!=null) {
			HttpSession s = req.getSession();
			s.setAttribute("user", mu);
			List<Cartandprodect> list = mu.getMmac().getProdectid();
			s.setAttribute("prodectsize", list.size());
			BigDecimal money = new BigDecimal("0.00");
			for (Cartandprodect c : list) {
				money.add(c.getProdectid().getProdectprice().multiply(new BigDecimal(c.getCartquantity())));
			}
			s.setAttribute("money", money);
			if("1".equals(role)) {
				return "index";
			}else if("2".equals(role)) {
				return "Storezone";
			}else {
				return "login";
			}
		}else {
			return "login";
		}
	}
	//退出登录
	@RequestMapping("/Introduction")
	public String Introduction(HttpServletRequest req) {
		req.getSession().removeAttribute("user");
		return "index";
	}
	
	//用户管理跳转
	@RequestMapping("/AcountManage")
	public String toAcountManage() {
		return "usercenter-accountmanagement";
	}
	
	//用户注册跳转
	@RequestMapping("/registration")
	public String user(){
		return "User-registration";	 
	}
	
	//判定注册验证账号是否重复
		@RequestMapping("/listusername")
		public void username(HttpServletRequest req,HttpServletResponse resp,String username,String userrole) throws IOException{
			
			 PrintWriter pw=resp.getWriter();
			  String i=is.user(username, userrole);
			  	if(i!=null){
			  		i="1";
			  	}else{
			  		i="0";		  		
			  	}			  	
			  pw.write(i);
			  pw.flush();
			  pw.close();		 	
		}
		

		//用户注册
		@RequestMapping("/regtt")
		public ModelAndView userregistration(HttpServletRequest req,Mmalluser user, String youxiang){
			ModelAndView m=new ModelAndView();
			String res="验证码输入有误";
			String yzm=(String) req.getSession().getAttribute("yzm");
			if(youxiang.toUpperCase().equals(yzm.toUpperCase())){
				int i= is.addUser(user);
				 if(i>0){
					 req.getSession().setAttribute("user", user);
					 m.addObject("res", "<script>alert('注册成功')</script>");
					 
					 m.setViewName("login");
				 }else{
					 
					 m.addObject("res", "<script>alert('注册失败')</script>");
					 
					 m.setViewName("login");
				 }
				
			}else{						
					m.addObject("res","<script>alert('验证码输入有误')</script>" );
				 m.setViewName("User-registration");
			}						 
			return m;						
		}
			
		//邮箱验证
		@RequestMapping("/emailvalidation")
		public void emailvalidation(String useremail,HttpServletRequest req,HttpServletResponse resp,String youxiang) throws IOException{
				String yzm= Common.getCode();
				System.out.println(useremail);			
			req.getSession().setAttribute("yzm",yzm);		
			try {
				Email.sendEmail(useremail, yzm);
			} catch (MessagingException e) {			
				e.printStackTrace();			
			}				
		}	
}
