package org.kangnam.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.kangnam.domain.Criteria;
import org.kangnam.domain.LockifmListVO;
import org.kangnam.domain.SearchCriteria;
import org.springframework.stereotype.Repository;

@Repository
public class LockifmListDAOImpl implements LockifmListDAO
{

	@Inject
	private SqlSession session;

	// Mappers 패키지의 위치를 나타낸듯 하다.
	private static String namespace = "org.kangnam.mapper.lockifmListMapper";

	// lockifmMapper.xml에 id값을 넣어준다.
	// 현재 월 회원 리스트 출력한다.
	@Override
	public List<LockifmListVO> lockList() throws Exception
	{
		return session.selectList(namespace + ".lockList");
	}

	// 각각 회원수
	@Override
	public List<LockifmListVO> cntList() throws Exception
	{
		return session.selectList(namespace + ".cntList");
	}

	// 모든 회원수
	@Override
	public List<LockifmListVO> totList() throws Exception
	{
		return session.selectList(namespace + ".totList");
	}

	@Override
	public void create(LockifmListVO vo) throws Exception {
		session.insert(namespace + ".create", vo);
	}

	@Override
	public List<LockifmListVO> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
	}

	@Override
	public List<LockifmListVO> listPage(int page) throws Exception {

		if (page <= 0) {
			page = 1;
		}

		page = (page - 1) * 10;

		return session.selectList(namespace + ".listPage", page);
	}

	@Override
	public List<LockifmListVO> listCriteria(Criteria cri) throws Exception {

		return session.selectList(namespace + ".listCriteria", cri);
	}

	@Override
	public int countPaging(Criteria cri) throws Exception {

		return session.selectOne(namespace + ".countPaging", cri);
	}

	@Override
	public List<LockifmListVO> listSearch(SearchCriteria cri) throws Exception {

		return session.selectList(namespace + ".listSearch", cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {

		return session.selectOne(namespace + ".listSearchCount", cri);
	}




}
