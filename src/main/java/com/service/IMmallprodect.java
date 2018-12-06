package com.service;

import java.util.List;

import com.pojo.Mmallprodect;

public interface IMmallprodect {
	
	public List<Mmallprodect> getAllProdect();
	
	public Mmallprodect getMmallprodectById(int id);

}
