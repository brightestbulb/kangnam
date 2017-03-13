package org.kangnam.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.kangnam.domain.Criteria;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.domain.SellTotalVO;
import org.springframework.stereotype.Repository;

@Repository
public class SellTotalDAOImpl implements SellTotalDAO
{
	@Inject
	private SqlSession session;

	// Mappers 패키지의 위치를 나타낸듯 하다.
	private static String namespace = "org.kangnam.mapper.sellTotalMapper";

	// 아래는 페이징 관련 처리 메소드
	@Override
	public List<SellTotalVO> listPage(int page) throws Exception
	{
		if (page <= 0)
		{
			page = 1;
		}

		page = (page - 1) * 10;

		return session.selectList(namespace + ".listPage", page);
	}

	@Override
	public List<SellTotalVO> listCriteria(Criteria cri) throws Exception
	{
		return session.selectList(namespace + ".listCriteria", cri);
	}

	@Override
	public int countPaging(Criteria cri) throws Exception
	{
		return session.selectOne(namespace + ".countPaging", cri);
	}

	@Override
	public List<SellTotalVO> listSearch(SearchCriteria cri) throws Exception
	{
		return session.selectList(namespace + ".listSearch", cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception
	{
		return session.selectOne(namespace + ".listSearchCount", cri);
	}

	@Override
	public SellTotalVO totallist(SearchCriteria cri) throws Exception
	{
		return session.selectOne(namespace + ".total", cri);
	}




}
