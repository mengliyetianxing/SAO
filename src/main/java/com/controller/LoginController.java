package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	//前往登陆页面
	@RequestMapping("/login")
	public String toLogin() {
		return "login";
	}
	//前往首页
	@RequestMapping("/index")
	public String toIndex(HttpServletRequest req) {
		return "index";
	}
}
