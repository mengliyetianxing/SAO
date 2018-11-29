package com.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.pojo.Mmalluser;

public interface MmalluserDAO {
	//登陆验证
	@Select("select * from mmalluser where username=#{username} and userpassword=#{userpassword} and userrole=#{userrole}")
	public Mmalluser checkUser(Mmalluser mu);
	
	//邮箱找回密码
	@Select("select * from mmalluser where useremail=#{useremail}")
	public Mmalluser getUserByEmail(String useremail);
	//手机找回密码
	@Select("select * from mmalluser where userphone=#{userphone}")
	public Mmalluser getUserByPhone(String userphone);
	//重置密码
	@Update("update mmalluser set userpassword=#{a2,jdbcType=VARCHAR} where userid=#{a1, jdbcType=NUMERIC}" )
	public int updatePwd(@Param("a1")int userid,@Param("a2")String userpassword);
	
	
	
	
}
