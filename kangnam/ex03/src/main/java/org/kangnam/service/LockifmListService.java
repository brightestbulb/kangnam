package org.kangnam.service;

import java.util.List;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.LockifmListVO;
import org.kangnam.domain.SearchCriteria;

public interface LockifmListService {


	// 모든 사물함 리스트 출력과 함께 사용중인 유저 현황 출력
	public List<LockifmListVO> lockList() throws Exception;

	// 현재 사용중인 각각 회원 수
	public List<LockifmListVO> cntList() throws Exception;

	// 현재 사용중인 모든 회원 수
	public List<LockifmListVO> totList() throws Exception;

	public void regist(LockifmListVO LockifmList) throws Exception;

	public List<LockifmListVO> listAll() throws Exception;

	public List<LockifmListVO> listCriteria(Criteria cri)throws Exception;

	public int listCountCriteria(Criteria cri)throws Exception;

	public List<LockifmListVO> listSearchCriteria(SearchCriteria cri) 
			throws Exception;

	public int listSearchCount(SearchCriteria cri) throws Exception;
}
