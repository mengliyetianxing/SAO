package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MmallshippingDAO;
import com.pojo.Mmallshipping;
import com.pojo.Mmalluser;

@Service
public class MmallshippingService implements IMmallshipping {
	@Autowired
	MmallshippingDAO ms;
	
	public void setMs(MmallshippingDAO ms) {
		this.ms = ms;
	}

	/* (non-Javadoc)
	 * @see com.service.IMmallshipping#addaddress(com.pojo.Mmalluser, com.pojo.Mmallshipping)
	 */
	@Override
	public int addaddress(Mmalluser u,Mmallshipping s) {
		return ms.addaddress(u, s);
	}

	@Override
	public List<Mmallshipping> getMmallshippingByUid(int uid) {
		if(uid!=0)
			return ms.getMmallshippingByUid(uid);
		else
			return null;
	}

	@Override
	public int delMmallshippingById(int id) {
		return ms.delMmallshippingById(id);
	}

	@Override
	public Mmallshipping getMmallshippingById(int id) {
		return ms.getMmallshippingById(id);
	}

	@Override
	public int updateAddress(Mmallshipping m) {
		return ms.updateAddress(m);
	}
	
}
