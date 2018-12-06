package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.pojo.Mmallshipping;
import com.pojo.Mmalluser;

public interface MmallshippingDAO {
	@Insert("insert into mmallshipping values(seq_mmallshipping.nextval,#{u.userid},#{u.username},#{s.receivephone,jdbcType=VARCHAR},#{s.receivemobile,jdbcType=VARCHAR},#{s.receiveprovince},#{s.receivecity},#{s.receivedistrict},#{s.receiveaddress},#{s.receivezip},sysdate,sysdate)")
	public int addaddress(@Param("u")Mmalluser u,@Param("s")Mmallshipping s);
	@Select("select * from mmallshipping where userid = #{uid}")
	public List<Mmallshipping> getMmallshippingByUid(int uid);
	@Delete("delete from mmallshipping where shippingid=#{id}")
	public int delMmallshippingById(int id);
	@Select("select * from mmallshipping where shippingid = #{id}")
	public Mmallshipping getMmallshippingById(int id);
	@Update("update mmallshipping set userid=#{userid.userid},receivename=#{receivename},receivephone=#{receivephone,jdbcType=VARCHAR},receivemobile=#{receivemobile},receiveprovince=#{receiveprovince},receivecity=#{receivecity},receivedistrict=#{receivedistrict},receiveaddress=#{receiveaddress},receivezip=#{receivezip},shippingcreatetime=sysdate,shippingupdatetime=sysdate where shippingid=#{shippingid}")
	public int updateAddress(Mmallshipping m);
	@Select("select * from mmallshipping where shippingupdatetime = (select max(shippingupdatetime) from mmallshipping)")
	public Mmallshipping getLastOne();
}
