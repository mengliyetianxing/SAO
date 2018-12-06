package com.service;

import java.util.List;

import com.pojo.Cartandprodect;
import com.pojo.Mmallprodect;

public interface ImmallcartService {
	
	
	public int delprodect(int prodoctid,int cartid);
	
	public List<Cartandprodect> selprodect(int cartid);
}