package org.kangnam.persistence;

import java.util.List;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.NotebookVO;
import org.kangnam.domain.SearchCriteria;

public interface NotebookDAO {

	public void create(NotebookVO vo) throws Exception;

	public NotebookVO read(int ntbk_rnt_sq) throws Exception;

	public void update(NotebookVO vo) throws Exception;

	public void delete(int ntbk_rnt_sq) throws Exception;

	public List<NotebookVO> listAll() throws Exception;

	public List<NotebookVO> listPage(int page) throws Exception;

	public List<NotebookVO> listCriteria(Criteria cri) throws Exception;

	public int countPaging(Criteria cri) throws Exception;

	//use for dynamic sql

	public List<NotebookVO> listSearch(SearchCriteria cri)throws Exception;

	public int listSearchCount(SearchCriteria cri)throws Exception;

	public List<NotebookVO> ntbkList() throws Exception;

	public List<NotebookVO> ntbk() throws Exception;

}
