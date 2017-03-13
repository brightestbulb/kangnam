package org.kangnam.persistence;

import java.util.List;
import org.kangnam.domain.Criteria;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.domain.SeatVO;
import org.kangnam.domain.SellVO;

public interface SeatDAO {

	// 일회원 현재 사용가능한 좌석 출력 쿼리
	public List<SellVO> day_seat_list() throws Exception;

	public void create(SeatVO vo) throws Exception;

	public SeatVO read(int seat_aloc_sq) throws Exception;

	public void update(SeatVO vo) throws Exception;

	public void delete(int seat_aloc_sq) throws Exception;

	public List<SeatVO> listAll() throws Exception;

	public List<SeatVO> listPage(int page) throws Exception;

	public List<SeatVO> listCriteria(Criteria cri) throws Exception;

	public int countPaging(Criteria cri) throws Exception;

	public List<SeatVO> listSearch(SearchCriteria cri) throws Exception;

	public int listSearchCount(SearchCriteria cri) throws Exception;

}
