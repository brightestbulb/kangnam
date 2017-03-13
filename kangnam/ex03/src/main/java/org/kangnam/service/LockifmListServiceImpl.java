package org.kangnam.service;

import java.util.List;

import javax.inject.Inject;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.LockifmListVO;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.persistence.LockifmListDAO;
import org.springframework.stereotype.Service;

@Service
public class LockifmListServiceImpl implements LockifmListService 
{
	/* 사물함 서비스
	 * 이곳에선 DAO를 불러오는 일이 전부인듯 하다.
	 * */


	@Inject
	private LockifmListDAO dao;


	// 모든 사물함 리스트 출력과 함께 사용중인 유저 현황 출력
	@Override
	public List<LockifmListVO> lockList() throws Exception 
	{
		return dao.lockList();
	}


	// 현재 사용중인 각각 회원 수
	@Override
	public List<LockifmListVO> cntList() throws Exception
	{
		return dao.cntList();
	}

	// 현재 사용중인 모든 회원 수
	@Override
	public List<LockifmListVO> totList() throws Exception
	{
		return dao.totList();
	}

	@Override
	public void regist(LockifmListVO LockifmList) throws Exception {
		dao.create(LockifmList);
	}

	@Override
	public List<LockifmListVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public List<LockifmListVO> listCriteria(Criteria cri) throws Exception {

		return dao.listCriteria(cri);
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception {

		return dao.countPaging(cri);
	}

	@Override
	public List<LockifmListVO> listSearchCriteria(SearchCriteria cri) throws Exception {

		return dao.listSearch(cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {

		return dao.listSearchCount(cri);
	}

}
