package com.pojo;
import java.math.BigDecimal;import java.util.Date;


public class Mmallorderitem{
	private int orderitemid;
	private Mmalluser userid;
	private String payorderno;
	private Mmallprodect prodectid;
	private String prodectname;
	private String prodectmainimage;
	private BigDecimal currentunitprice;
	private int quantity;
	private BigDecimal totalprice;
	private Date orderitemcreatetime;
	private Date orderitemupdatetime;
	public void setOrderitemid(int orderitemid){
		this.orderitemid=orderitemid;
	}
	public int getOrderitemid(){
		return orderitemid;
	}
	public void setUserid(Mmalluser userid){
		this.userid=userid;
	}
	public Mmalluser getUserid(){
		return userid;
	}
	public void setPayorderno(String payorderno){
		this.payorderno=payorderno;
	}
	public String getPayorderno(){
		return payorderno;
	}
	public void setProdectid(Mmallprodect prodectid){
		this.prodectid=prodectid;
	}
	public Mmallprodect getProdectid(){
		return prodectid;
	}
	public void setProdectname(String prodectname){
		this.prodectname=prodectname;
	}
	public String getProdectname(){
		return prodectname;
	}
	public void setProdectmainimage(String prodectmainimage){
		this.prodectmainimage=prodectmainimage;
	}
	public String getProdectmainimage(){
		return prodectmainimage;
	}
	public void setCurrentunitprice(BigDecimal currentunitprice){
		this.currentunitprice=currentunitprice;
	}
	public BigDecimal getCurrentunitprice(){
		return currentunitprice;
	}
	public void setQuantity(int quantity){
		this.quantity=quantity;
	}
	public int getQuantity(){
		return quantity;
	}
	public void setTotalprice(BigDecimal totalprice){
		this.totalprice=totalprice;
	}
	public BigDecimal getTotalprice(){
		return totalprice;
	}
	public void setOrderitemcreatetime(Date orderitemcreatetime){
		this.orderitemcreatetime=orderitemcreatetime;
	}
	public Date getOrderitemcreatetime(){
		return orderitemcreatetime;
	}
	public void setOrderitemupdatetime(Date orderitemupdatetime){
		this.orderitemupdatetime=orderitemupdatetime;
	}
	public Date getOrderitemupdatetime(){
		return orderitemupdatetime;
	}	public Mmallorderitem(int orderitemid, Mmalluser userid, String payorderno, Mmallprodect prodectid,			String prodectname, String prodectmainimage, BigDecimal currentunitprice, int quantity,			BigDecimal totalprice, Date orderitemcreatetime, Date orderitemupdatetime) {		super();		this.orderitemid = orderitemid;		this.userid = userid;		this.payorderno = payorderno;		this.prodectid = prodectid;		this.prodectname = prodectname;		this.prodectmainimage = prodectmainimage;		this.currentunitprice = currentunitprice;		this.quantity = quantity;		this.totalprice = totalprice;		this.orderitemcreatetime = orderitemcreatetime;		this.orderitemupdatetime = orderitemupdatetime;	}	public Mmallorderitem() {	}	@Override	public String toString() {		return "Mmallorderitem [orderitemid=" + orderitemid + ", userid=" + userid + ", payorderno=" + payorderno				+ ", prodectid=" + prodectid + ", prodectname=" + prodectname + ", prodectmainimage=" + prodectmainimage				+ ", currentunitprice=" + currentunitprice + ", quantity=" + quantity + ", totalprice=" + totalprice				+ ", orderitemcreatetime=" + orderitemcreatetime + ", orderitemupdatetime=" + orderitemupdatetime + "]";	}	
}