package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MmallcartandprodectDAO;

@Service
public class MmallcartandprodectService implements IMmallcartandprodect {
	@Autowired
	MmallcartandprodectDAO capDAO;		
	public void setCapDAO(MmallcartandprodectDAO capDAO) {
		this.capDAO = capDAO;
	}



	@Override
	public int addcart(int prodectid, int cartquantity, int cartid) {
		
		return capDAO.addcart(prodectid, cartquantity, cartid);
	}

}
