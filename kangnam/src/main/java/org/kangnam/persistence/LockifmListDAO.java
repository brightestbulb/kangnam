package org.kangnam.persistence;

import java.util.List;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.LockifmListVO;
import org.kangnam.domain.SearchCriteria;

public interface LockifmListDAO {

	/* div3 사물함 DAO 인터페이스 */

	// 모든 사물함 리스트 출력과 함께 사용중인 유저 현황 출력
	public List<LockifmListVO> lockList() throws Exception;

	// 현재 사용중인 각각 회원 수
	public List<LockifmListVO> cntList() throws Exception;

	// 현재 사용중인 모든 회원 수
	public List<LockifmListVO> totList() throws Exception;

	public void create(LockifmListVO vo) throws Exception;

	public List<LockifmListVO> listAll() throws Exception;

	public List<LockifmListVO> listPage(int page) throws Exception;

	public List<LockifmListVO> listCriteria(Criteria cri) throws Exception;

	public int countPaging(Criteria cri) throws Exception;

	public List<LockifmListVO> listSearch(SearchCriteria cri)throws Exception;

	public int listSearchCount(SearchCriteria cri)throws Exception;
}