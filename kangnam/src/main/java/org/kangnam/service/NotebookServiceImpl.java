package org.kangnam.service;

import java.util.List;

import javax.inject.Inject;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.NotebookVO;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.persistence.NotebookDAO;
import org.springframework.stereotype.Service;

@Service
public class NotebookServiceImpl implements NotebookService {

	@Inject
	private NotebookDAO dao;

	@Override
	public void regist(NotebookVO notebook) throws Exception {
		dao.create(notebook);
	}

	@Override
	public NotebookVO read(int ntbk_rnt_sq) throws Exception {
		return dao.read(ntbk_rnt_sq);
	}

	@Override
	public void modify(NotebookVO notebook) throws Exception {
		dao.update(notebook);
	}

	@Override
	public void remove(int ntbk_rnt_sq) throws Exception {
		dao.delete(ntbk_rnt_sq);
	}

	@Override
	public List<NotebookVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public List<NotebookVO> listCriteria(Criteria cri) throws Exception {

		return dao.listCriteria(cri);
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception {

		return dao.countPaging(cri);
	}

	@Override
	public List<NotebookVO> listSearchCriteria(SearchCriteria cri) throws Exception {

		return dao.listSearch(cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {

		return dao.listSearchCount(cri);
	}

	@Override
	public List<NotebookVO> ntbkList() throws Exception
	{
		return dao.ntbkList();
	}
	@Override
	public List<NotebookVO> ntbk() throws Exception
	{
		return dao.ntbk();
	}


}
