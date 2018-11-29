package com.pojo;
import java.util.Date;import java.util.List;


public class Mmallcart{
	private int cartid;
	private Mmalluser userid;
	private List<Cartandprodect> prodectid;
	private int cartquantity;
	private String cartchecked;
	private Date cartcreatetime;
	private Date cartupdatetime;		public void setCartid(int cartid){
		this.cartid=cartid;
	}
	public int getCartid(){
		return cartid;
	}
	public void setUserid(Mmalluser userid){
		this.userid=userid;
	}
	public Mmalluser getUserid(){
		return userid;
	}
	public void setProdectid(List<Cartandprodect> prodectid){
		this.prodectid=prodectid;
	}
	public List<Cartandprodect> getProdectid(){
		return prodectid;
	}
	public void setCartquantity(int cartquantity){
		this.cartquantity=cartquantity;
	}
	public int getCartquantity(){
		return cartquantity;
	}
	public void setCartchecked(String cartchecked){
		this.cartchecked=cartchecked;
	}
	public String getCartchecked(){
		return cartchecked;
	}
	public void setCartcreatetime(Date cartcreatetime){
		this.cartcreatetime=cartcreatetime;
	}
	public Date getCartcreatetime(){
		return cartcreatetime;
	}
	public void setCartupdatetime(Date cartupdatetime){
		this.cartupdatetime=cartupdatetime;
	}
	public Date getCartupdatetime(){
		return cartupdatetime;
	}	public Mmallcart(int cartid, Mmalluser userid, List<Cartandprodect> prodectid, int cartquantity, String cartchecked,			Date cartcreatetime, Date cartupdatetime) {		super();		this.cartid = cartid;		this.userid = userid;		this.prodectid = prodectid;		this.cartquantity = cartquantity;		this.cartchecked = cartchecked;		this.cartcreatetime = cartcreatetime;		this.cartupdatetime = cartupdatetime;	}	public Mmallcart() {	}	@Override	public String toString() {		return "Mmallcart [cartid=" + cartid + ", userid=" + userid + ", prodectid=" + prodectid + ", cartquantity="				+ cartquantity + ", cartchecked=" + cartchecked + ", cartcreatetime=" + cartcreatetime				+ ", cartupdatetime=" + cartupdatetime + "]";	}	
}