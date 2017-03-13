package org.kangnam.service;

import java.util.List;

import org.kangnam.domain.CouponVO;
import org.kangnam.domain.Criteria;
import org.kangnam.domain.SearchCriteria;

public interface CouponService {

	public void regist(CouponVO coupon) throws Exception;

	public CouponVO read(int cpn_sq) throws Exception;

	public void modify(CouponVO coupon) throws Exception;

	public void remove(int cpn_sq) throws Exception;

	public List<CouponVO> listAll() throws Exception;

	public List<CouponVO> listCriteria(Criteria cri) throws Exception;

	public int listCountCriteria(Criteria cri) throws Exception;

	public List<CouponVO> listSearchCriteria(SearchCriteria cri) 
			throws Exception;

	public int listSearchCount(SearchCriteria cri) throws Exception;

}
