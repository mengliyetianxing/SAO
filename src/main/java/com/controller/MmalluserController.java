package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mmalluser")
public class MmalluserController {
		
@RequestMapping("/registration")
 public String user(){
	return "User-registration";	 
	 
 }	
	
	
}
