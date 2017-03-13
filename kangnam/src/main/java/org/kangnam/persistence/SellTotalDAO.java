package org.kangnam.persistence;

import java.util.List;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.domain.SellTotalVO;

public interface SellTotalDAO
{
	// 페이지 처리 관련
	// 현재 페이지인듯 하다
	public List<SellTotalVO> listPage(int page) throws Exception;

	public List<SellTotalVO> listCriteria(Criteria cri) throws Exception;

	public int countPaging(Criteria cri) throws Exception;

	public List<SellTotalVO> listSearch(SearchCriteria cri) throws Exception;

	public int listSearchCount(SearchCriteria cri) throws Exception;
	
	public SellTotalVO totallist(SearchCriteria cri) throws Exception;
}
