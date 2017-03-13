package org.kangnam.persistence;

import java.util.List;

import org.kangnam.domain.BoardVO;
import org.kangnam.domain.Criteria;
import org.kangnam.domain.SearchCriteria;

public interface BoardDAO {

	public void create(BoardVO vo) throws Exception;

	public BoardVO read(int ntc_sq) throws Exception;

	public void update(BoardVO vo) throws Exception;

	public void delete(int ntc_sq) throws Exception;

	public List<BoardVO> listAll() throws Exception;

	public List<BoardVO> listPage(int page) throws Exception;

	public List<BoardVO> listCriteria(Criteria cri) throws Exception;

	public int countPaging(Criteria cri) throws Exception;

	//use for dynamic sql

	public List<BoardVO> listSearch(SearchCriteria cri)throws Exception;

	public int listSearchCount(SearchCriteria cri)throws Exception;

	public void updateViewCnt(int ntc_sq)throws Exception;
}
