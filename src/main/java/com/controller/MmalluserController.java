package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.Mmalluser;
import com.service.IMmalluserService;

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
}
