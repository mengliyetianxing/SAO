package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aliyuncs.exceptions.ClientException;
import com.pojo.Mmalluser;
import com.service.IMmalluserService;
import com.util.Common;
import com.util.EmailText;
import com.util.SendCode;

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
			req.getSession().setAttribute("user", mu);
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
	
	
}
