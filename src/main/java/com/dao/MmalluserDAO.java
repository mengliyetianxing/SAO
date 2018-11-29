package com.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.pojo.Mmalluser;

public interface MmalluserDAO {
	//登陆验证
	@Select("select * from mmalluser where username=#{username} and userpassword=#{userpassword} and userrole=#{userrole}")
	@Results({
		@Result(column="userid",property="mmac",one=@One(select="com.dao.MmallcartDAO.getMmallcartByUserId"))
	})
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
	
	
	
	//用户注册
	@Insert("insert into Mmalluser values(seq_mmalluser.nextval,#{username,jdbcType=VARCHAR},#{userpassword,jdbcType=VARCHAR},#{useremail,jdbcType=VARCHAR},#{userphone,jdbcType=VARCHAR},#{userquestion,jdbcType=VARCHAR},#{useranswer,jdbcType=VARCHAR},"
			+ "#{userrole,jdbcType=VARCHAR},#{usercreatetime,jdbcType=DATE},#{userupdatetime,jdbcType=DATE})")
	public int addUser(Mmalluser mu);
	
	
	//账号注册验证 避免重复账号
	@Select("select * from mmalluser where username=#{a1} and userrole=#{a2}")
	public String username(@Param("a1")String username,@Param("a2")String userrole);
	
}
