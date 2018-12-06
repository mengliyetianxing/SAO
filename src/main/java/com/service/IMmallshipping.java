package com.service;

import java.util.List;

import com.pojo.Mmallshipping;
import com.pojo.Mmalluser;

public interface IMmallshipping {

	public int addaddress(Mmalluser u, Mmallshipping s);
	
	public List<Mmallshipping> getMmallshippingByUid(int uid);

	public int delMmallshippingById(int id);
	
	public Mmallshipping getMmallshippingById(int id);
	
	public int updateAddress(Mmallshipping m);
	
	public Mmallshipping getLastOne();
}