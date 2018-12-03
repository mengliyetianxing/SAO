package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mmallorder")
public class MmallorderController {
	//前往订单页面
		@RequestMapping("/Myorder")
		public String toMyorder() {
			return "usercenter-Myorder";
		}

}
