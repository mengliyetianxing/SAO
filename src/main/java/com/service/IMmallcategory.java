package com.service;

import java.util.List;

import com.pojo.Mmallcategory;

public interface IMmallcategory {
	
	public List<Mmallcategory> getMmallcategoryByFatherid(int fatherid);

}
