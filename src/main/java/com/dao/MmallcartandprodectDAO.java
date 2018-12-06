package com.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface MmallcartandprodectDAO {
	
	//新增到中间表--添加商品到购物车
	@Insert("insert into cartandprodect values(#{cartid,jdbcType=NUMERIC},#{prodectid,jdbcType=NUMERIC},#{cartquantity,jdbcType=NUMERIC})")
	public int addcart(@Param("prodectid")int prodectid,@Param("cartquantity")int cartquantity,@Param("cartid")int cartid);

}
