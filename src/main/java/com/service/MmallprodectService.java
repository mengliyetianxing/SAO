package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MmallprodectDAO;
import com.pojo.Mmallprodect;

@Service
public class MmallprodectService implements IMmallprodect{
	@Autowired
	MmallprodectDAO proDAO;		
	public void setProDAO(MmallprodectDAO proDAO) {
		this.proDAO = proDAO;
	}


	//查询所有商品集合
	@Override
	public List<Mmallprodect> getAllProdect() {
		
		return proDAO.getAllProdect();
	}


	@Override
	public Mmallprodect getMmallprodectById(int id) {
		
		return proDAO.getMmallprodectById(id);
	}

}
