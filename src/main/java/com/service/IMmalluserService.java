package com.service;

import com.pojo.Mmalluser;

public interface IMmalluserService {

	public Mmalluser checkUser(String role, String user, String password);
	
	public Mmalluser getUserByEmail(String useremail);
	
	public Mmalluser getUserByPhone(String userphone);
	
	public int updatePwd(int userid,String userpassword);

	public int addUser(Mmalluser mu);
	
	public String user(String username,  String userrole);
}