package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.Cartandprodect;
import com.pojo.Mmalluser;
import com.service.ImmallcartService;

@Controller
@RequestMapping("/mmallcart")
public class MmallcartController {
	@Autowired
	ImmallcartService Imcart;
	
	
	public void setImcart(ImmallcartService imcart) {
		Imcart = imcart;
	}
	//进入购物车
	@RequestMapping("/selcart")
	public ModelAndView selcart(HttpServletRequest req){
			ModelAndView m=new ModelAndView();
			Mmalluser user=(Mmalluser) req.getSession().getAttribute("user");
			
			List<Cartandprodect> cart=Imcart.selprodect(user.getMmac().getCartid());
			
			m.addObject("cart", cart);
			m.setViewName("My-Cart");
			
			return m;
		
	}
	//删除购物车里面的商品
	@RequestMapping("/delete")
	public String delpro(HttpServletRequest req,String prodectid){			
				int	proid = Integer.valueOf(prodectid);
			Mmalluser user=(Mmalluser) req.getSession().getAttribute("user");
			user.getMmac().getCartid();
			Imcart.delprodect(proid, user.getMmac().getCartid());						
			return "redirect:selcart";		
	}
		@RequestMapping("/search")
		public ModelAndView search(){
			ModelAndView m=new ModelAndView();
						
			return m;
									
		} 
	
	
}


