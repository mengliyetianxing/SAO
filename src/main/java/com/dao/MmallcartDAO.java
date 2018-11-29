package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.pojo.Cartandprodect;
import com.pojo.Mmallcart;
import com.pojo.Mmallprodect;

public interface MmallcartDAO {
	//根据用户id找到购物车
	@Select("select * from mmallcart where userid = #{id}")
	@Results({
		@Result(column="cartid",property="prodectid",many=@Many(select="com.dao.MmallcartDAO.getCartandprodectBycartid"))
	})
	public Mmallcart getMmallcartByUserId(int id);
	
	//根据购物车id获取中间对象集合
	@Select("select * from cartandprodect where cartid=#{id}")
	@Results({
		@Result(property="pro",column="prodectid",one=@One(select="com.dao.MmallprodectDAO.getMmallprodectById"))
	})
	public List<Cartandprodect> getCartandprodectBycartid(int id);
	
}
