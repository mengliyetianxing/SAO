package com.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.pojo.Mmalluser;

public interface MmalluserDAO {
	//登陆验证
	@Select("select * from mmalluser where username=#{username} and userpassword=#{userpassword} and userrole=#{userrole}")
	public Mmalluser checkUser(Mmalluser mu);
	
	//用户注册
	@Insert("insert into Mmalluser values(seq_mmalluser.nextval,#{username,jdbcType=VARCHAR},#{userpassword,jdbcType=VARCHAR},#{useremail,jdbcType=VARCHAR},#{userphone,jdbcType=VARCHAR},#{userquestion,jdbcType=VARCHAR},#{useranswer,jdbcType=VARCHAR},"
			+ "#{userrole,jdbcType=VARCHAR},#{usercreatetime,jdbcType=DATE},#{userupdatetime,jdbcType=DATE})")
	public int addUser(Mmalluser mu);
	
	
	//账号注册验证 避免重复账号
	@Select("select * from mmalluser where username=#{a1} and userrole=#{a2}")
	public String username(@Param("a1")String username,@Param("a2")String userrole);
	
}
