package com.dao;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.pojo.Mmallprodect;

public interface MmallprodectDAO {
	//根据id获取商品
	@Select("select * from mmallprodect where prodectid=#{id}")
	@Results({
		@Result(column="categoryid",property="categoryid",one=@One(select="com.dao.MmallcategoryDAO.getMmallcategoryById"))
	})
	public Mmallprodect getMmallprodectById(int id);
}
