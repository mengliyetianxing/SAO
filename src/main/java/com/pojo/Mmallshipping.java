package com.pojo;
import java.util.Date;


public class Mmallshipping{
	private int shippingid;
	private Mmalluser userid;
	private String receivename;
	private String receivephone;
	private String receivemobile;
	private String receiveprovince;
	private String receivecity;
	private String receivedistrict;
	private String receiveaddress;
	private String receivezip;
	private Date shippingcreatetime;
	private Date shippingupdatetime;
	public void setShippingid(int shippingid){
		this.shippingid=shippingid;
	}
	public int getShippingid(){
		return shippingid;
	}
	public void setUserid(Mmalluser userid){
		this.userid=userid;
	}
	public Mmalluser getUserid(){
		return userid;
	}
	public void setReceivename(String receivename){
		this.receivename=receivename;
	}
	public String getReceivename(){
		return receivename;
	}
	public void setReceivephone(String receivephone){
		this.receivephone=receivephone;
	}
	public String getReceivephone(){
		return receivephone;
	}
	public void setReceivemobile(String receivemobile){
		this.receivemobile=receivemobile;
	}
	public String getReceivemobile(){
		return receivemobile;
	}
	public void setReceiveprovince(String receiveprovince){
		this.receiveprovince=receiveprovince;
	}
	public String getReceiveprovince(){
		return receiveprovince;
	}
	public void setReceivecity(String receivecity){
		this.receivecity=receivecity;
	}
	public String getReceivecity(){
		return receivecity;
	}
	public void setReceivedistrict(String receivedistrict){
		this.receivedistrict=receivedistrict;
	}
	public String getReceivedistrict(){
		return receivedistrict;
	}
	public void setReceiveaddress(String receiveaddress){
		this.receiveaddress=receiveaddress;
	}
	public String getReceiveaddress(){
		return receiveaddress;
	}
	public void setReceivezip(String receivezip){
		this.receivezip=receivezip;
	}
	public String getReceivezip(){
		return receivezip;
	}
	public void setShippingcreatetime(Date shippingcreatetime){
		this.shippingcreatetime=shippingcreatetime;
	}
	public Date getShippingcreatetime(){
		return shippingcreatetime;
	}
	public void setShippingupdatetime(Date shippingupdatetime){
		this.shippingupdatetime=shippingupdatetime;
	}
	public Date getShippingupdatetime(){
		return shippingupdatetime;
	}	public Mmallshipping(int shippingid, Mmalluser userid, String receivename, String receivephone,			String receivemobile, String receiveprovince, String receivecity, String receivedistrict,			String receiveaddress, String receivezip, Date shippingcreatetime, Date shippingupdatetime) {		super();		this.shippingid = shippingid;		this.userid = userid;		this.receivename = receivename;		this.receivephone = receivephone;		this.receivemobile = receivemobile;		this.receiveprovince = receiveprovince;		this.receivecity = receivecity;		this.receivedistrict = receivedistrict;		this.receiveaddress = receiveaddress;		this.receivezip = receivezip;		this.shippingcreatetime = shippingcreatetime;		this.shippingupdatetime = shippingupdatetime;	}	public Mmallshipping() {	}	@Override	public String toString() {		return "Mmallshipping [shippingid=" + shippingid + ", userid=" + userid + ", receivename=" + receivename				+ ", receivephone=" + receivephone + ", receivemobile=" + receivemobile + ", receiveprovince="				+ receiveprovince + ", receivecity=" + receivecity + ", receivedistrict=" + receivedistrict				+ ", receiveaddress=" + receiveaddress + ", receivezip=" + receivezip + ", shippingcreatetime="				+ shippingcreatetime + ", shippingupdatetime=" + shippingupdatetime + "]";	}	
}