package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MmallcartDAO;
import com.pojo.Cartandprodect;

@Service
public class MmallcartService implements ImmallcartService {
		
		@Autowired
		MmallcartDAO mcart;
				
	public void setMcart(MmallcartDAO mcart) {
			this.mcart = mcart;
		}



	@Override
	public int delprodect(int prodectid, int cartid) {
		
		return mcart.delprodect(prodectid, cartid);
	}



	@Override
	public List<Cartandprodect> selprodect(int cartid) {
		
		return mcart.getCartandprodectBycartid(cartid);
	}

	
	
}
