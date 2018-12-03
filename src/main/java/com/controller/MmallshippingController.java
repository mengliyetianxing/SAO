package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.Mmallshipping;
import com.pojo.Mmalluser;
import com.service.IMmallshipping;

@Controller
@RequestMapping("/mmallshipping")
public class MmallshippingController {
		@Autowired
		IMmallshipping is;
		
		public void setIs(IMmallshipping is) {
			this.is = is;
		}

		//前往收货地址
		@RequestMapping("/address")
		public String toaddress(HttpServletRequest req) {
			List<Mmallshipping> list = is.getMmallshippingByUid(((Mmalluser)req.getSession().getAttribute("user")).getUserid());
			req.setAttribute("list", list);
			req.setAttribute("size", list.size());
			return "usercenter-Shippingaddress";
		}
		
		//添加地址
		@RequestMapping("/addaddress")
		public String addaddress(String name,String address,String jiedao,String youbian,String shouji,String qu,String zuoji,String fenji,HttpServletRequest req) {
			Mmalluser u = new Mmalluser();
			u.setUserid(((Mmalluser)req.getSession().getAttribute("user")).getUserid());
			u.setUsername(name);
			Mmallshipping s = new Mmallshipping();
			s.setReceivename(name);
			s.setReceiveaddress(jiedao);
			s.setReceivephone(qu+zuoji);
			s.setReceivemobile(shouji);
			s.setReceivezip(youbian);
			String[] arr = address.split("-");
			s.setReceiveprovince(arr[0]);
			s.setReceivecity(arr[1]);
			s.setReceivedistrict(arr[2]);
			is.addaddress(u, s);
			return "redirect:address";
		}
		
		//删除地址
		@RequestMapping("/del")
		public String del(int id) {
			is.delMmallshippingById(id);
			return "redirect:address";
		}
		//修改地址
		@RequestMapping("/update")
		public ModelAndView update(int id) {
			ModelAndView m = new ModelAndView();
			m.addObject("shi", is.getMmallshippingById(id));
			m.setViewName("usercenter-UpdateShippingaddress");
			return m;
		}
		@RequestMapping("/updateaddress")
		public String updateaddress(int id, String name,String address,String jiedao,String youbian,String shouji,String qu,String zuoji,String fenji,HttpServletRequest req) {
			Mmallshipping s = new Mmallshipping();
			s.setReceivename(name);
			s.setReceiveaddress(jiedao);
			s.setReceivephone(qu+zuoji);
			s.setReceivemobile(shouji);
			s.setReceivezip(youbian);
			String[] arr = address.split("-");
			s.setReceiveprovince(arr[0]);
			s.setReceivecity(arr[1]);
			s.setReceivedistrict(arr[2]);
			s.setShippingid(id);
			Mmalluser u = new Mmalluser();
			u.setUserid(((Mmalluser)req.getSession().getAttribute("user")).getUserid());
			s.setUserid(u);
			is.updateAddress(s);
			return "redirect:address";
		}
}
