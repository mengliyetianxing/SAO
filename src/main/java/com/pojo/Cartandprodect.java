package com.pojo;

public class Cartandprodect {
	private Mmallprodect pro;
	private int cartquantity;
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
