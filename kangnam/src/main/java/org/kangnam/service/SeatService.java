package org.kangnam.service;

import java.util.List;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.domain.SeatVO;
import org.kangnam.domain.SellVO;

public interface SeatService {

	public void regist(SeatVO Seat) throws Exception;

	public SeatVO read(int seat_aloc_sq) throws Exception;

	public void modify(SeatVO Seat) throws Exception;

	public void remove(int seat_aloc_sq) throws Exception;

	public List<SeatVO> listAll() throws Exception;

	public List<SeatVO> listCriteria(Criteria cri) throws Exception;

	public int listCountCriteria(Criteria cri) throws Exception;

	public List<SeatVO> listSearchCriteria(SearchCriteria cri) throws Exception;

	public int listSearchCount(SearchCriteria cri) throws Exception;

	// 일회원 고정석 현재 사용가능한 좌석 출력 쿼리
	public List<SellVO> day_seat_list() throws Exception;

}
