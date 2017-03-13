package org.kangnam.service;

import java.util.List;

import javax.inject.Inject;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.domain.SellTotalVO;
import org.kangnam.persistence.SellTotalDAO;
import org.springframework.stereotype.Service;

@Service
public class SellTotalServiceImpl implements SellTotalService
{
	@Inject
	private SellTotalDAO dao;

	// 페이징 처리 관련 메소드 아래모음.
	@Override
	public List<SellTotalVO> listCriteria(Criteria cri) throws Exception
	{
		return dao.listCriteria(cri);
	}


	@Override
	public int listCountCriteria(Criteria cri) throws Exception
	{
		return dao.countPaging(cri);
	}


	@Override
	public List<SellTotalVO> listSearchCriteria(SearchCriteria cri) throws Exception
	{
		return dao.listSearch(cri);
	}


	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception
	{
		return dao.listSearchCount(cri);
	}


	@Override
	public SellTotalVO totallist(SearchCriteria cri) throws Exception
	{
		return dao.totallist(cri);
	}

	
	
}
