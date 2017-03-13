package org.kangnam.service;

import java.util.List;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.ExpenseVO;
import org.kangnam.domain.SearchCriteria;

public interface ExpenseService {

	public void regist(ExpenseVO expense) throws Exception;

	public ExpenseVO read(int exps_sq) throws Exception;

	public void modify(ExpenseVO expense) throws Exception;

	public void remove(int exps_sq) throws Exception;

	public List<ExpenseVO> listAll() throws Exception;

	public List<ExpenseVO> listCriteria(Criteria cri)throws Exception;

	public int listCountCriteria(Criteria cri)throws Exception;

	public List<ExpenseVO> listSearchCriteria(SearchCriteria cri) 
			throws Exception;

	public int listSearchCount(SearchCriteria cri) throws Exception;

	public List<ExpenseVO> exlist() throws Exception;

	public List<ExpenseVO> dvslist() throws Exception;
}
