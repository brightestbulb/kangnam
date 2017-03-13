package org.kangnam.service;

import java.util.List;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.LockifmVO;
import org.kangnam.domain.SearchCriteria;

public interface LockifmService {


	// 모든 사물함 리스트 출력과 함께 사용중인 유저 현황 출력
	public List<LockifmVO> listAll() throws Exception;

	// 월 회원 유저 중 선택한 유저 정보 출력 메소드
	public LockifmVO read(int mem_sq) throws Exception;

	// 월 회원 유저 중 선택한 유저 정보 출력 메소드
	public List<String> nullLockifm() throws Exception;

	// 월 회원의 사물함 정보를 수정해봅시다.
	public void update(LockifmVO vo) throws Exception;



	// 페이지 처리 관련 
	// 현재 페이지인듯 하다
	public List<LockifmVO> listCriteria(Criteria cri) throws Exception;
	public int listCountCriteria(Criteria cri) throws Exception;
	public List<LockifmVO> listSearchCriteria(SearchCriteria cri) throws Exception;
	public int listSearchCount(SearchCriteria cri) throws Exception;

}
