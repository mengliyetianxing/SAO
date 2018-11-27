package com.dao;

import org.apache.ibatis.annotations.Select;

import com.pojo.Mmalluser;

public interface MmalluserDAO {
	//登陆验证
	@Select("select * from mmalluser where username=#{username} and userpassword=#{userpassword} and userrole=#{userrole}")
	public Mmalluser checkUser(Mmalluser mu);
}
