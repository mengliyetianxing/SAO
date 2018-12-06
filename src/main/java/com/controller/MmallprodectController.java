package com.controller;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.Mmallprodect;
import com.pojo.Mmalluser;
import com.service.IMmallcartandprodect;
import com.service.IMmallprodect;
import com.service.IMmallshipping;

@Controller
@RequestMapping("/mmallprodect")
public class MmallprodectController {
	@Autowired
	IMmallprodect proSer;
	public void setProSer(IMmallprodect proSer) {
		this.proSer = proSer;
	}
	@Autowired
	IMmallcartandprodect capSer;		
	public void setCapSer(IMmallcartandprodect capSer) {
		this.capSer = capSer;
	}
	@Autowired
	IMmallshipping shiSer;
	
	public void setShiSer(IMmallshipping shiSer) {
		this.shiSer = shiSer;
	}

	//去到商品详情页
	@RequestMapping("/toprodectdetail")
	public String toprodectdetail(String prodectid,HttpServletRequest req){
		Mmallprodect pro = proSer.getMmallprodectById(Integer.valueOf(prodectid));
		req.setAttribute("pro", pro);
		
		return "Productdetails";
	}
	
	//加入购物车
	@RequestMapping("/addcart")
	public String addcart(String prodectid,String shuliang,HttpServletRequest req){
		Mmallprodect pro = proSer.getMmallprodectById(Integer.valueOf(prodectid));
		Mmalluser user = (Mmalluser) req.getSession().getAttribute("user");						
		int num = capSer.addcart(Integer.valueOf(prodectid), Integer.valueOf(shuliang), user.getMmac().getCartid());
		req.setAttribute("pro", pro);
		return "Productdetails";
	}
	
	//去到订单页--点击立即购买
	@RequestMapping("/toorder")
	public String toorder(String prodectname,int shuliang,String prodectprice,HttpServletRequest req){
		req.setAttribute("prodectname", prodectname);
		req.setAttribute("shuliang", shuliang);
		req.setAttribute("prodectprice", new BigDecimal(prodectprice));
		Mmalluser u = (Mmalluser) req.getSession().getAttribute("user");
		if(u!=null) {
			int uid = u.getUserid();
			req.setAttribute("shi", shiSer.getLastOne());
		}
		return "Ordersconfirm";
	}

}
