package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.Mmallcategory;
import com.pojo.Mmallprodect;
import com.service.IMmallcategory;
import com.service.IMmallprodect;

@Controller
public class LoginController {
	
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
	
	//前往登陆页面
	@RequestMapping("/login")
	public String toLogin() {
		return "login";
	}
	//前往首页
	@RequestMapping("/index")
	public String toIndex(HttpServletRequest req) {
		List<Mmallprodect> prolist = proSer.getAllProdect();
		req.setAttribute("prolist", prolist);
		List<Mmallcategory> list0 = catSer.getMmallcategoryByFatherid(0);
		List<Mmallcategory> list1 = catSer.getMmallcategoryByFatherid(1);
		List<Mmallcategory> list2 = catSer.getMmallcategoryByFatherid(2);
		req.setAttribute("list0", list0);
		req.setAttribute("list1", list1);
		req.setAttribute("list2", list2);
		return "index";
	}
	
	
}
