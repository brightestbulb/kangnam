package org.kangnam.persistence;

import java.util.List;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.ExpenseVO;
import org.kangnam.domain.SearchCriteria;

public interface ExpenseDAO {

	public void create(ExpenseVO vo) throws Exception;

	public ExpenseVO read(int exps_sq) throws Exception;

	public void update(ExpenseVO vo) throws Exception;

	public void delete(int exps_sq) throws Exception;

	public List<ExpenseVO> listAll() throws Exception;

	public List<ExpenseVO> listPage(int page) throws Exception;

	public List<ExpenseVO> listCriteria(Criteria cri) throws Exception;

	public void updateViewCnt(int exps_sq)throws Exception;

	public int countPaging(Criteria cri)throws Exception;

	public List<ExpenseVO> listSearch(SearchCriteria cri)throws Exception;

	public int listSearchCount(SearchCriteria cri)throws Exception;

	public List<ExpenseVO> exlist() throws Exception;

	public List<ExpenseVO> dvslist() throws Exception;
}
