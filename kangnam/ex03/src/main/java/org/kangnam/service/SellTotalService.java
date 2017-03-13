package org.kangnam.service;

import java.util.List;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.domain.SellTotalVO;

public interface SellTotalService
{
	// 페이지 처리 관련
	// 현재 페이지인듯 하다
	public List<SellTotalVO> listCriteria(Criteria cri) throws Exception;

	public int listCountCriteria(Criteria cri) throws Exception;

	public List<SellTotalVO> listSearchCriteria(SearchCriteria cri) throws Exception;

	public int listSearchCount(SearchCriteria cri) throws Exception;
	
	public SellTotalVO totallist(SearchCriteria cri) throws Exception;
}
