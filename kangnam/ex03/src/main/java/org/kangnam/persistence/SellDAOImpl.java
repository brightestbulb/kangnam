package org.kangnam.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.kangnam.domain.Criteria;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.domain.SellVO;
import org.springframework.stereotype.Repository;

@Repository
public class SellDAOImpl implements SellDAO
{

	@Inject
	private SqlSession session;

	private static String namespace = "org.kangnam.mapper.SellMapper";

	// 판매물품 리스트 쿼리 (월/일/쿠폰)
	@Override
	public List<SellVO> sl_prod_list() throws Exception
	{
		return session.selectList(namespace + ".sl_prod_list");
	}

	// 구매방법 리스트 쿼리 (현금/카드)
	@Override
	public List<SellVO> by_list() throws Exception
	{
		return session.selectList(namespace + ".by_list");
	}


	// SL_TB INSERT (일/월/쿠폰회원 상관없이)
	@Override
	public void sl_insert(SellVO vo) throws Exception
	{
		session.insert(namespace + ".sl_insert", vo);
	}

	// 좌석 관련 쿼리 (고정석/자유석)
	@Override
	public List<SellVO> seat_dvs_list() throws Exception
	{
		return session.selectList(namespace + ".seat_dvs_list");
	}

	// 월회원 고정석 현재 사용가능한 좌석 출력 쿼리
	@Override
	public List<SellVO> mon_seat_list() throws Exception
	{
		return session.selectList(namespace + ".mon_seat_list");
	}

	// 월회원 고정석 현재 사용가능한 좌석 출력 쿼리
	@Override
	public List<SellVO> day_seat_list() throws Exception
	{
		return session.selectList(namespace + ".day_seat_list");
	}

	// 현재 사용가능한 사물함 출력 쿼리
	@Override
	public List<SellVO> lc_list() throws Exception
	{
		return session.selectList(namespace + ".lc_list");
	}

	// 판매물품에 따른 insert문 (일)
	@Override
	public void mem_insert(SellVO vo) throws Exception
	{
		session.selectList(namespace + ".mem_insert", vo);
	}

	// 판매물품에 따른 insert문1 (월)
	@Override
	public void mon_mem_insert(SellVO vo) throws Exception
	{
		session.selectList(namespace + ".mon_mem_insert", vo);
	}

	// 판매물품에 따른 insert문2 (월)
	@Override
	public void mon_mem_rgstrt_Insert(SellVO vo) throws Exception
	{
		session.selectList(namespace + ".mon_mem_rgstrt_Insert", vo);
	}

	// 판매물품에 따른 insert문 (쿠폰)
	@Override
	public void cpn_insert(SellVO vo) throws Exception
	{
		session.selectList(namespace + ".cpn_insert", vo);
	}

	// 좌석배정 테이블 insert(월, 쿠폰, 일)
	@Override
	public void seat_aloc_insert(SellVO vo) throws Exception
	{
		session.selectList(namespace + ".seat_aloc_insert", vo);
	}

	// 월 회원으로 등록 되어있는지 확인함.
	@Override
	public String mon_mem_list(String mem_sq) throws Exception
	{
		return session.selectOne(namespace + ".mon_mem_list", mem_sq);
	}

	// 월 회원으로 등록 되어 있다면 수정함
	@Override
	public void mon_mem_update(SellVO vo) throws Exception
	{
		session.update(namespace + ".mon_mem_update", vo);
	}

	// 현재 월 회원인지 판단함	
	@Override
	public String mon_mem_rgstrt_list(String mem_sq) throws Exception
	{
		return session.selectOne(namespace + ".mon_mem_rgstrt_list", mem_sq);
	}

	// 현재 월 회원이면 업데이트를 함
	@Override
	public void mon_mem_rgstrt_update(SellVO vo) throws Exception
	{
		session.update(namespace + ".mon_mem_rgstrt_update", vo);
	}

	@Override
	public SellVO read(int sl_sq) throws Exception
	{
		return session.selectOne(namespace + ".read", sl_sq);
	}



	@Override
	public void update(SellVO vo) throws Exception
	{
		session.update(namespace + ".update", vo);
	}

	@Override
	public void delete(int sl_sq) throws Exception
	{
		session.delete(namespace + ".delete", sl_sq);
	}

	@Override
	public List<SellVO> listAll() throws Exception
	{
		return session.selectList(namespace + ".listAll");
	}

	@Override
	public List<SellVO> listPage(int page) throws Exception
	{

		if (page <= 0)
		{
			page = 1;
		}

		page = (page - 1) * 10;

		return session.selectList(namespace + ".listPage", page);
	}

	@Override
	public List<SellVO> listCriteria(Criteria cri) throws Exception
	{
		return session.selectList(namespace + ".listCriteria", cri);
	}

	@Override
	public void updateViewCnt(int sl_sq) throws Exception
	{

		session.update(namespace + ".updateViewCnt", sl_sq);

	}

	public int countPaging(Criteria cri) throws Exception
	{
		return session.selectOne(namespace + ".countPaging", cri);
	}

	@Override
	public List<SellVO> listSearch(SearchCriteria cri) throws Exception
	{
		return session.selectList(namespace + ".listSearch", cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception
	{
		return session.selectOne(namespace + ".listSearchCount", cri);
	}
}
