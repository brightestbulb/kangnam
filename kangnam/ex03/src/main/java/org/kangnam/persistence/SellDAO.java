package org.kangnam.persistence;

import java.util.List;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.domain.SellVO;

public interface SellDAO
{

	// 판매물품 리스트 쿼리 (월/일/쿠폰)
	public List<SellVO> sl_prod_list() throws Exception;

	// 구매방법 리스트 쿼리 (현금/카드)
	public List<SellVO> by_list() throws Exception;

	// SL_TB INSERT (일/월/쿠폰회원 상관없이)
	public void sl_insert(SellVO vo) throws Exception;

	// 좌석 관련 쿼리 (고정석/자유석)
	public List<SellVO> seat_dvs_list() throws Exception;

	// 월회원 고정석 현재 사용가능한 좌석 출력 쿼리
	public List<SellVO> mon_seat_list() throws Exception;

	// 일회원  현재 사용가능한 좌석 출력 쿼리
	public List<SellVO> day_seat_list() throws Exception;

	// 현재 사용가능한 사물함 출력 쿼리
	public List<SellVO> lc_list() throws Exception;

	// 판매물품에 따른 insert문 (일)
	public void mem_insert(SellVO vo) throws Exception;

	// 판매물품에 따른 insert문1 (월)
	public void mon_mem_insert(SellVO vo) throws Exception;

	// 판매물품에 따른 insert문2 (월)
	public void mon_mem_rgstrt_Insert(SellVO vo) throws Exception;

	// 판매물품에 따른 insert문 (쿠폰)
	public void cpn_insert(SellVO vo) throws Exception;

	// 좌석배정 테이블 insert(월, 쿠폰, 일)
	public void seat_aloc_insert(SellVO vo) throws Exception;

	// 월 회원으로 등록 되어있는지 확인함.
	public String mon_mem_list(String mem_sq) throws Exception;

	// 월 회원으로 등록 되어 있다면 수정함
	public void mon_mem_update(SellVO vo) throws Exception;

	// 현재 월 회원인지 판단함
	public String mon_mem_rgstrt_list(String mem_sq) throws Exception;

	// 월 회원으로 등록 되어 있다면 수정함
	public void mon_mem_rgstrt_update(SellVO vo) throws Exception;



	public SellVO read(int sl_sq) throws Exception;

	public void update(SellVO vo) throws Exception;

	public void delete(int sl_sq) throws Exception;

	public List<SellVO> listAll() throws Exception;

	public List<SellVO> listPage(int page) throws Exception;

	public void updateViewCnt(int sl_sq) throws Exception;

	public List<SellVO> listCriteria(Criteria cri) throws Exception;

	public int countPaging(Criteria cri) throws Exception;

	public List<SellVO> listSearch(SearchCriteria cri) throws Exception;

	public int listSearchCount(SearchCriteria cri) throws Exception;

}
