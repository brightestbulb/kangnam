package org.kangnam.persistence;

import java.util.List;

import org.kangnam.domain.CouponVO;
import org.kangnam.domain.Criteria;
import org.kangnam.domain.SearchCriteria;

public interface CouponDAO {

	public void create(CouponVO vo) throws Exception;

	public CouponVO read(int cpn_sq) throws Exception;

	public void update(CouponVO vo) throws Exception;

	public void delete(int cpn_sq) throws Exception;

	public List<CouponVO> listAll() throws Exception;

	public List<CouponVO> listPage(int page) throws Exception;

	public List<CouponVO> listCriteria(Criteria cri) throws Exception;

	public int countPaging(Criteria cri) throws Exception;

	//use for dynamic sql

	public List<CouponVO> listSearch(SearchCriteria cri)throws Exception;

	public int listSearchCount(SearchCriteria cri)throws Exception;



}
