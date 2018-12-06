package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MmallcategoryDAO;
import com.pojo.Mmallcategory;

@Service
public class MmallcategoryService implements IMmallcategory{
	@Autowired
	MmallcategoryDAO catDAO;	
	public void setCatDAO(MmallcategoryDAO catDAO) {
		this.catDAO = catDAO;
	}


	@Override
	public List<Mmallcategory> getMmallcategoryByFatherid(int fatherid) {
		
		return catDAO.getMmallcategoryByFatherid(fatherid);
	}

}
