package com.pojo;

public class Cartandprodect {
	private Mmallprodect pro;
	private int cartquantity;
	public Mmallprodect getProdectid() {
		return pro;
	}
	public void setProdectid(Mmallprodect prodectid) {
		this.pro = prodectid;
	}
	public int getCartquantity() {
		return cartquantity;
	}
	public void setCartquantity(int cartquantity) {
		this.cartquantity = cartquantity;
	}
	public Cartandprodect(Mmallprodect prodectid, int cartquantity) {
		super();
		this.pro = prodectid;
		this.cartquantity = cartquantity;
	}
	public Cartandprodect() {

	}
	@Override
	public String toString() {
		return "Cartandprodect [prodectid=" + pro + ", cartquantity=" + cartquantity + "]";
	}
		
}
