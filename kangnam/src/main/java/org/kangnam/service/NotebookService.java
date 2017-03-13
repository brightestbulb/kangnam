package org.kangnam.service;

import java.util.List;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.NotebookVO;
import org.kangnam.domain.SearchCriteria;

public interface NotebookService {

	public void regist(NotebookVO notebook) throws Exception;

	public NotebookVO read(int ntbk_rnt_sq) throws Exception;

	public void modify(NotebookVO notebook) throws Exception;

	public void remove(int ntbk_rnt_sq) throws Exception;

	public List<NotebookVO> listAll() throws Exception;

	public List<NotebookVO> listCriteria(Criteria cri)throws Exception;

	public int listCountCriteria(Criteria cri)throws Exception;

	public List<NotebookVO> listSearchCriteria(SearchCriteria cri) 
			throws Exception;

	public int listSearchCount(SearchCriteria cri) throws Exception;

	public List<NotebookVO> ntbkList() throws Exception;

	public List<NotebookVO> ntbk() throws Exception;
}
