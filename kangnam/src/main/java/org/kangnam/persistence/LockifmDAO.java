package org.kangnam.persistence;

import java.util.List;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.LockifmVO;
import org.kangnam.domain.MemberVO;
import org.kangnam.domain.SearchCriteria;

public interface LockifmDAO {

	/* 사물함 DAO 인터페이스 */

	// 현재 월 회원인 유저 출력 메소드
	public List<LockifmVO> listAll() throws Exception;

	// 월 회원 유저 중 선택한 유저 정보 출력 메소드
	public LockifmVO read(int mem_sq) throws Exception;

	// 월 회원 유저 중 선택한 유저 정보 출력 메소드
	public List<String> nullLockifm() throws Exception;

	// 월 회원의 사물함 정보를 수정해봅시다.
	public void update(LockifmVO vo) throws Exception;



	// 페이지 처리 관련 
	// 현재 페이지인듯 하다
	public List<LockifmVO> listPage(int page) throws Exception;
	public List<LockifmVO> listCriteria(Criteria cri) throws Exception;
	public int countPaging(Criteria cri) throws Exception;
	public List<LockifmVO> listSearch(SearchCriteria cri)throws Exception;
	public int listSearchCount(SearchCriteria cri)throws Exception;

}