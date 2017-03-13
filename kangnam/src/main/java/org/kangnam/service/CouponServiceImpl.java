package org.kangnam.service;

import java.util.List;

import javax.inject.Inject;

import org.kangnam.domain.CouponVO;
import org.kangnam.domain.Criteria;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.persistence.CouponDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CouponServiceImpl implements CouponService {

	@Inject
	private CouponDAO dao;

	@Override
	public void regist(CouponVO coupon) throws Exception {
		dao.create(coupon);
	}

	//  @Override
	//  public BoardVO read(Integer bno) throws Exception {
	//    return dao.read(bno);
	//  }


	@Transactional(isolation=Isolation.READ_COMMITTED)
	@Override
	public CouponVO read(int cpn_sq) throws Exception {

		return dao.read(cpn_sq);
	}


	@Override
	public void modify(CouponVO coupon) throws Exception {
		dao.update(coupon);
	}

	@Override
	public void remove(int cpn_sq) throws Exception {
		dao.delete(cpn_sq);
	}

	@Override
	public List<CouponVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public List<CouponVO> listCriteria(Criteria cri) throws Exception {

		return dao.listCriteria(cri);
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception {

		return dao.countPaging(cri);
	}

	@Override
	public List<CouponVO> listSearchCriteria(SearchCriteria cri) throws Exception {

		return dao.listSearch(cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {

		return dao.listSearchCount(cri);
	}

}
