package com.dao;

import org.apache.ibatis.annotations.Select;

import com.pojo.Mmallcategory;

public interface MmallcategoryDAO {
	//通过id获取分类
	@Select("select * from Mmallcategory where categoryid = #{id}")
	public Mmallcategory getMmallcategoryById(int id);
}
