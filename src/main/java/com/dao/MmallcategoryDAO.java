package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.pojo.Mmallcategory;

public interface MmallcategoryDAO {
	//通过id获取分类
	@Select("select * from Mmallcategory where categoryid = #{id}")
	public Mmallcategory getMmallcategoryById(int id);
	
	
	//通过父类别id获取分类
	@Select("select * from mmallcategory where categoryfatherid = #{id}")
	public List<Mmallcategory> getMmallcategoryByFatherid(int fatherid);
}
