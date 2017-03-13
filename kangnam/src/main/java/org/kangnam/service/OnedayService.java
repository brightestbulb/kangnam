package org.kangnam.service;

import java.util.List;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.OnedayVO;
import org.kangnam.domain.SearchCriteria;

public interface OnedayService {

	public void regist(OnedayVO oneday) throws Exception;

	public OnedayVO read(int mem_sq) throws Exception;

	public void modify(OnedayVO oneday) throws Exception;

	public void remove(int mem_sq) throws Exception;

	public List<OnedayVO> listAll() throws Exception;

	public List<OnedayVO> listCriteria(Criteria cri) throws Exception;

	public int listCountCriteria(Criteria cri) throws Exception;

	public List<OnedayVO> listSearchCriteria(SearchCriteria cri) throws Exception;

	public int listSearchCount(SearchCriteria cri) throws Exception;

	public int maxMemSq() throws Exception;
}
