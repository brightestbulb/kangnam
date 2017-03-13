package org.kangnam.service;

import java.util.List;

import javax.inject.Inject;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.domain.SeatVO;
import org.kangnam.domain.SellVO;
import org.kangnam.persistence.SeatDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SeatServiceImpl implements SeatService {

	@Inject
	private SeatDAO dao;

	@Override
	public void regist(SeatVO seat) throws Exception {
		dao.create(seat);
	}

	@Transactional(isolation = Isolation.READ_COMMITTED)
	@Override
	public SeatVO read(int seat_aloc_sq) throws Exception {
		return dao.read(seat_aloc_sq);
	}

	@Override
	public void modify(SeatVO seat) throws Exception {
		dao.update(seat);
	}

	@Override
	public void remove(int seat_aloc_sq) throws Exception {
		dao.delete(seat_aloc_sq);
	}

	@Override
	public List<SeatVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public List<SeatVO> listCriteria(Criteria cri) throws Exception {
		return dao.listCriteria(cri);
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		return dao.countPaging(cri);
	}

	@Override
	public List<SeatVO> listSearchCriteria(SearchCriteria cri) throws Exception {

		return dao.listSearch(cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {

		return dao.listSearchCount(cri);
	}

	// 일회원 고정석 현재 사용가능한 좌석 출력 쿼리
	@Override
	public List<SellVO> day_seat_list() throws Exception
	{
		return dao.day_seat_list();
	}

}
