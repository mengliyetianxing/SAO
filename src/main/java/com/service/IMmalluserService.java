package com.service;

import com.pojo.Mmalluser;

public interface IMmalluserService {

	public Mmalluser checkUser(String role, String user, String password);

}