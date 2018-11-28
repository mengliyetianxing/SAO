package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MmalluserDAO;
import com.pojo.Mmalluser;
import com.util.MD5;

@Service
public class MmalluserService implements IMmalluserService {
	@Autowired
	MmalluserDAO md;
		
	public void setMd(MmalluserDAO md) {
		this.md = md;
	}


	//登陆验证
	/* (non-Javadoc)
	 * @see com.service.IMmalluserService#checkUser(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public Mmalluser checkUser(String role,String user,String password) {
		Mmalluser mu = new Mmalluser();
		mu.setUsername(user);
		mu.setUserpassword(MD5.md5(password));
		mu.setUserrole(role);
		Mmalluser mmalluser = md.checkUser(mu);
		return mmalluser;
	}
	
	@Override
	public int addUser(Mmalluser mu) {
		
		mu.setUserpassword(MD5.md5(mu.getUserpassword()));
		
		return md.addUser(mu);
	}



	@Override
	public String user(String username,String userrole) {
		
		return md.username(username, userrole);
	}
	
}








