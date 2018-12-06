package com.pojo;

import java.math.BigDecimal;

public class Cartandprodect {
	private Mmallprodect pro;
	private int cartquantity;
	private BigDecimal totalprice;
	public BigDecimal getTotalprice() {
		BigDecimal bg=new BigDecimal(cartquantity);
		return bg.multiply(pro.getProdectprice());
	}
	
	public void setTotalprice(BigDecimal totalprice) {
		this.totalprice = totalprice;
	}

	public Mmallprodect getPro() {
		return pro;
	}
	public void setPro(Mmallprodect prodectid) {
		this.pro = prodectid;
	}
	public int getCartquantity() {
		return cartquantity;
	}
	public void setCartquantity(int cartquantity) {
		this.cartquantity = cartquantity;
	}
	public Cartandprodect(Mmallprodect pro, int cartquantity) {
		super();
		this.pro = pro;
		this.cartquantity = cartquantity;
	}
	public Cartandprodect() {

	}
	@Override
	public String toString() {
		return "Cartandprodect [prodectid=" + pro + ", cartquantity=" + cartquantity + "]";
	}
		
}
