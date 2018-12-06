package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.Cartandprodect;
import com.pojo.Mmallprodect;
import com.pojo.Mmalluser;
import com.service.IMmallprodect;
import com.service.ImmallcartService;

@Controller
@RequestMapping("/mmallorder")
public class MmallorderController {
	@Autowired
	IMmallprodect is;
	
	public void setIs(IMmallprodect is) {
		this.is = is;
	}

		//前往订单页面
		@RequestMapping("/Myorder")
		public String toMyorder(HttpServletRequest req,Mmallprodect[] xuanzekuang) {
			
			for (Mmallprodect cart : xuanzekuang) {
				System.out.println(cart);
			}
			
			req.setAttribute("gta5", "");
			return "Ordersconfirm";
		}


}
