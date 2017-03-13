package org.kangnam.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.kangnam.domain.Criteria;
import org.kangnam.domain.LockifmVO;
import org.kangnam.domain.SearchCriteria;
import org.springframework.stereotype.Repository;

@Repository
public class LockifmDAOImpl implements LockifmDAO
{

	@Inject
	private SqlSession session;

	// Mappers 패키지의 위치를 나타낸듯 하다.
	private static String namespace = "org.kangnam.mapper.LockifmMapper";

	// lockifmMapper.xml에 id값을 넣어준다.
	// 현재 월 회원 리스트 출력한다.
	@Override
	public List<LockifmVO> listAll() throws Exception
	{
		// 매개변수 값을 넣어주지 않을 때는 selectList 를 사용하는 듯하다.
		return session.selectList(namespace + ".listAll");
	}



	// 월 회원 리스트 중 선택한 유저의 정보를 출력한다.
	@Override
	public LockifmVO read(int mem_sq) throws Exception
	{
		// 매개변수 값을 1개 보유할 경우에는 selectOne메소드를 사용하는 듯 하다.
		return session.selectOne(namespace + ".read", mem_sq);
	}


	// 비어있는 사물함만 출력하기 위한 메소드입니다.
	@Override
	public List<String> nullLockifm() throws Exception
	{
		return session.selectList(namespace + ".nullLockifm");
	}


	// 월 회원의 사물함 정보를 수정해 봅시다.
	@Override
	public void update(LockifmVO vo) throws Exception
	{
		session.update(namespace + ".update", vo);
	}



	// 아래는 페이징 관련 처리 메소드
	@Override
	public List<LockifmVO> listPage(int page) throws Exception
	{
		if (page <= 0)
		{
			page = 1;
		}

		page = (page - 1) * 10;

		return session.selectList(namespace + ".listPage", page);
	}

	@Override
	public List<LockifmVO> listCriteria(Criteria cri) throws Exception
	{
		return session.selectList(namespace + ".listCriteria", cri);
	}

	@Override
	public int countPaging(Criteria cri) throws Exception
	{
		return session.selectOne(namespace + ".countPaging", cri);
	}

	@Override
	public List<LockifmVO> listSearch(SearchCriteria cri) throws Exception
	{
		return session.selectList(namespace + ".listSearch", cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception
	{
		return session.selectOne(namespace + ".listSearchCount", cri);
	}

}
