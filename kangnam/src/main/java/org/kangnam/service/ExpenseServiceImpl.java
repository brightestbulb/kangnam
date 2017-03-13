package org.kangnam.service;

import java.util.List;

import javax.inject.Inject;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.ExpenseVO;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.persistence.ExpenseDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Inject
	private ExpenseDAO dao;

	@Override
	public void regist(ExpenseVO expense) throws Exception {
		dao.create(expense);
	}

	@Transactional(isolation=Isolation.READ_COMMITTED)
	@Override
	public ExpenseVO read(int exps_sq) throws Exception {
		return dao.read(exps_sq);
	}


	@Override
	public void modify(ExpenseVO expense) throws Exception {
		dao.update(expense);
	}

	@Override
	public void remove(int exps_sq) throws Exception {
		dao.delete(exps_sq);
	}

	@Override
	public List<ExpenseVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public List<ExpenseVO> listCriteria(Criteria cri)throws Exception{
		return dao.listCriteria(cri);
	}

	@Override
	public int listCountCriteria(Criteria cri)throws Exception{
		return dao.countPaging(cri);
	}

	@Override
	public List<ExpenseVO> listSearchCriteria(SearchCriteria cri) throws Exception {

		return dao.listSearch(cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {

		return dao.listSearchCount(cri);
	}

	@Override
	public List<ExpenseVO> exlist() throws Exception
	{
		return dao.exlist();
	}

	@Override
	public List<ExpenseVO> dvslist() throws Exception
	{
		return dao.dvslist();
	}

}
