package com.pojo;
import java.util.Date;


public class Mmallcategory{
	private int categoryid;
	private Mmallcategory categoryfatherid;
	private String categoryname;
	private String categorystatus;
	private int categorysortorder;
	private Date categorycreatetime;
	private Date categoryupdatetime;
	public void setCategoryid(int categoryid){
		this.categoryid=categoryid;
	}
	public int getCategoryid(){
		return categoryid;
	}
	public void setCategoryfatherid(Mmallcategory categoryfatherid){
		this.categoryfatherid=categoryfatherid;
	}
	public Mmallcategory getCategoryfatherid(){
		return categoryfatherid;
	}
	public void setCategoryname(String categoryname){
		this.categoryname=categoryname;
	}
	public String getCategoryname(){
		return categoryname;
	}
	public void setCategorystatus(String categorystatus){
		this.categorystatus=categorystatus;
	}
	public String getCategorystatus(){
		return categorystatus;
	}
	public void setCategorysortorder(int categorysortorder){
		this.categorysortorder=categorysortorder;
	}
	public int getCategorysortorder(){
		return categorysortorder;
	}
	public void setCategorycreatetime(Date categorycreatetime){
		this.categorycreatetime=categorycreatetime;
	}
	public Date getCategorycreatetime(){
		return categorycreatetime;
	}
	public void setCategoryupdatetime(Date categoryupdatetime){
		this.categoryupdatetime=categoryupdatetime;
	}
	public Date getCategoryupdatetime(){
		return categoryupdatetime;
	}	public Mmallcategory(int categoryid, Mmallcategory categoryfatherid, String categoryname, String categorystatus,			int categorysortorder, Date categorycreatetime, Date categoryupdatetime) {		super();		this.categoryid = categoryid;		this.categoryfatherid = categoryfatherid;		this.categoryname = categoryname;		this.categorystatus = categorystatus;		this.categorysortorder = categorysortorder;		this.categorycreatetime = categorycreatetime;		this.categoryupdatetime = categoryupdatetime;	}	public Mmallcategory() {	}	@Override	public String toString() {		return "Mmallcategory [categoryid=" + categoryid + ", categoryfatherid=" + categoryfatherid + ", categoryname="				+ categoryname + ", categorystatus=" + categorystatus + ", categorysortorder=" + categorysortorder				+ ", categorycreatetime=" + categorycreatetime + ", categoryupdatetime=" + categoryupdatetime + "]";	}	
}