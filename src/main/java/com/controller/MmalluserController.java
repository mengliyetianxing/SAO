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
import com.aliyuncs.exceptions.ClientException;
import com.pojo.Cartandprodect;
import com.pojo.Mmallcategory;
import com.pojo.Mmallprodect;
import com.pojo.Mmalluser;
import com.service.IMmallcategory;
import com.service.IMmallprodect;
import com.service.IMmalluserService;
import com.util.Common;
import com.util.EmailText;
import com.util.SendCode;
import com.util.Email;

@Controller
@RequestMapping("/mmalluser")
public class MmalluserController {

	@Autowired
	IMmalluserService is;
	@Autowired
	IMmallprodect proSer;			
	public void setProSer(IMmallprodect proSer) {
		this.proSer = proSer;
	}
	@Autowired
	IMmallcategory catSer;			
	public void setCatSer(IMmallcategory catSer) {
		this.catSer = catSer;
	}

	
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
			if(mu.getMmac()!=null) {
			List<Cartandprodect> list = mu.getMmac().getProdectid();
			s.setAttribute("prodectsize", list.size());
			BigDecimal money = new BigDecimal("0.00");
			for (Cartandprodect c : list) {
				money.add(c.getPro().getProdectprice().multiply(new BigDecimal(c.getCartquantity())));
			}
			s.setAttribute("money", money);
			}
			if("1".equals(role)) {
				List<Mmallprodect> prolist = proSer.getAllProdect();
				req.setAttribute("prolist", prolist);
				List<Mmallcategory> list0 = catSer.getMmallcategoryByFatherid(0);
				List<Mmallcategory> list1 = catSer.getMmallcategoryByFatherid(1);
				List<Mmallcategory> list2 = catSer.getMmallcategoryByFatherid(2);
				req.setAttribute("list0", list0);
				req.setAttribute("list1", list1);
				req.setAttribute("list2", list2);
				
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
	
	//中转到找回密码界面
	@RequestMapping("/tofindpwd")
	public String tofindpwd(){
		return "RetrievePWD";
	}
	
	//找回密码
	@RequestMapping("findpwd")
	public String findpwd(String useremail,String userphone,HttpServletRequest req) throws ClientException{
		String yzm = Common.getCode();
		if(useremail!=null&&!useremail.equals("")){
			Mmalluser user = is.getUserByEmail(useremail);
			if(user!=null){				
				String userid = user.getUserid()+"";
				EmailText.sendEmail(useremail,yzm);
				req.getSession().setAttribute("yzm", yzm);
				req.getSession().setAttribute("userid", userid);
				req.setAttribute("mess1", "验证码已发送,请输入验证码");
				req.setAttribute("useremail", useremail);
				System.err.println(yzm);
			}else{
				req.setAttribute("useremail", useremail);
				req.setAttribute("mess1", "输入错误,找不到此用户");
			}
			
		}else if(userphone!=null&&!userphone.equals("")){
			Mmalluser user = is.getUserByPhone(userphone);
			if(user!=null){
				String userid = user.getUserid()+"";
				SendCode.sendSms(userphone,yzm);
				req.getSession().setAttribute("yzm", yzm);
				req.getSession().setAttribute("userid", userid);
				req.setAttribute("mess2", "验证码已发送,请输入验证码");
				req.setAttribute("userphone", userphone);
				System.err.println(yzm);
			}else{
				req.setAttribute("userphone", userphone);
				req.setAttribute("mess2", "输入错误,找不到此用户");
			}
			
		}
		return "RetrievePWD";
	}
	
	@RequestMapping("/code")//验证码---Ajax后台代码
	public void sel(HttpServletRequest req,HttpServletResponse resp) throws IOException{		
		PrintWriter p=resp.getWriter();
		String yzm = (String) req.getSession().getAttribute("yzm");
		String userid = (String) req.getSession().getAttribute("userid");
		p.write(yzm+","+userid);
		System.err.println(yzm);
		p.flush();
		p.close();
		
	}
	
	//重置密码中转
	@RequestMapping("/toresetpwd")
	public String toresetpwd(String userid,HttpServletRequest req){
		req.getSession().setAttribute("uuu", userid);
		System.err.println("userid==========="+userid);
		return "resetpwd";
	}
	
	//重置密码
	@RequestMapping("/resetpwd")
	public String resetpwd(String userpassword,HttpServletRequest req){
		String userid = (String) req.getSession().getAttribute("uuu");
		int userid2 = Integer.valueOf(userid);
		int num = is.updatePwd(userid2, userpassword);
		if(num==0){
			req.setAttribute("mess", "重置密码失败");
		}else{
			req.setAttribute("mess", "重置密码成功,请重新登录");
		}
		
		return "resetpwd";
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
				System.err.println(yzm);			
			req.getSession().setAttribute("yzm",yzm);		
			try {
				Email.sendEmail(useremail, yzm);
			} catch (MessagingException e) {			
				e.printStackTrace();			
			}				
		}	
}
