package org.kangnam.service;

import java.util.List;

import javax.inject.Inject;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.OnedayVO;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.persistence.OnedayDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OnedayServiceImpl implements OnedayService {

	@Inject
	private OnedayDAO dao;


	@Override
	public void regist(OnedayVO oneday) throws Exception {
		dao.create(oneday);
	}


	@Transactional(isolation=Isolation.READ_COMMITTED)
	@Override
	public OnedayVO read(int mem_sq) throws Exception {
		return dao.read(mem_sq);
	}


	@Override
	public void modify(OnedayVO oneday) throws Exception {
		dao.update(oneday);
	}

	@Override
	public void remove(int mem_sq) throws Exception {
		dao.delete(mem_sq);
	}

	@Override
	public List<OnedayVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public List<OnedayVO> listCriteria(Criteria cri) throws Exception {

		return dao.listCriteria(cri);
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception {

		return dao.countPaging(cri);
	}

	@Override
	public List<OnedayVO> listSearchCriteria(SearchCriteria cri) throws Exception {

		return dao.listSearch(cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {

		return dao.listSearchCount(cri);
	}


	@Override
	public int maxMemSq() throws Exception {
		return dao.maxMemSq();
	}


}
