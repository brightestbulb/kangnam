package org.kangnam.service;

import java.util.List;

import javax.inject.Inject;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.LockifmVO;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.persistence.LockifmDAO;
import org.springframework.stereotype.Service;

@Service
public class LockifmServiceImpl implements LockifmService 
{
	/* 사물함 서비스
	 * 이곳에선 DAO를 불러오는 일이 전부인듯 하다.
	 * */


	@Inject
	private LockifmDAO dao;


	// listAll DAO를 실행하라
	@Override
	public List<LockifmVO> listAll() throws Exception 
	{
		return dao.listAll();
	}


	// 유저 목록 중 한명의 정보만을 출력함.
	@Override
	public LockifmVO read(int mem_sq) throws Exception
	{
		return dao.read(mem_sq);
	}



	// 월 회원 중 선택한 유저의 정보를 봅시다.
	@Override
	public List<String> nullLockifm() throws Exception
	{
		return dao.nullLockifm();
	}


	// 월 회원의 사물함 정보를 수정해 봅시다.
	@Override
	public void update(LockifmVO vo) throws Exception
	{
		dao.update(vo);
	}


	// 페이징 처리 관련 메소드 아래모음.
	@Override
	public List<LockifmVO> listCriteria(Criteria cri) throws Exception
	{
		return dao.listCriteria(cri);
	}


	@Override
	public int listCountCriteria(Criteria cri) throws Exception
	{
		return dao.countPaging(cri);
	}


	@Override
	public List<LockifmVO> listSearchCriteria(SearchCriteria cri) throws Exception
	{
		return dao.listSearch(cri);
	}


	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception
	{
		return dao.listSearchCount(cri);
	}







}
