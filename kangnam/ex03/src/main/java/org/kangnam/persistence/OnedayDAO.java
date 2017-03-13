package org.kangnam.persistence;

import java.util.List;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.OnedayVO;
import org.kangnam.domain.SearchCriteria;

public interface OnedayDAO {

	public void create(OnedayVO vo) throws Exception;

	public OnedayVO read(int mem_sq) throws Exception;

	public void update(OnedayVO vo) throws Exception;

	public void delete(int mem_sq) throws Exception;

	public List<OnedayVO> listAll() throws Exception;

	public List<OnedayVO> listPage(int page) throws Exception;

	public List<OnedayVO> listCriteria(Criteria cri) throws Exception;

	public int countPaging(Criteria cri) throws Exception;

	//use for dynamic sql

	public List<OnedayVO> listSearch(SearchCriteria cri)throws Exception;

	public int listSearchCount(SearchCriteria cri)throws Exception;

	public int maxMemSq() throws Exception;

}
