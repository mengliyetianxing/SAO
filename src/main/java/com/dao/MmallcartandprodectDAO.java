package com.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface MmallcartandprodectDAO {
	
	//新增到中间表--添加商品到购物车
	@Insert("insert into cartandprodect values(#{cartid,jdbcType=NUMERIC},#{prodectid,jdbcType=NUMERIC},#{cartquantity,jdbcType=NUMERIC})")
	public int addcart(@Param("prodectid")int prodectid,@Param("cartquantity")int cartquantity,@Param("cartid")int cartid);
	//如果该购物车已有该商品则只加数量不加记录
	@Select("select cartquantity from cartandprodect where cartid=#{cartid} and prodectid = #{prodectid}")
	public int sel(@Param("cartid")int cartid,@Param("prodectid")int prodectid);
	@Update("update cartandprodect set cartquantity=#{cartquantity} where cartid=#{cartid} and prodectid=#{prodectid}")
	public int updateCartquantity(@Param("prodectid")int prodectid,@Param("cartquantity")int cartquantity,@Param("cartid")int cartid);
}
