package org.kangnam.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.kangnam.domain.Criteria;
import org.kangnam.domain.NotebookVO;
import org.kangnam.domain.SearchCriteria;
import org.springframework.stereotype.Repository;

@Repository
public class NotebookDAOImpl implements NotebookDAO {

	@Inject
	private SqlSession session;

	private static String namespace = "org.kangnam.mapper.NotebookMapper";

	@Override
	public void create(NotebookVO vo) throws Exception {
		session.insert(namespace + ".create", vo);
	}

	@Override
	public NotebookVO read(int ntbk_rnt_sq) throws Exception {
		return session.selectOne(namespace + ".read", ntbk_rnt_sq);
	}

	@Override
	public void update(NotebookVO vo) throws Exception {
		session.update(namespace + ".update", vo);
	}

	@Override
	public void delete(int ntbk_rnt_sq) throws Exception {
		session.delete(namespace + ".delete", ntbk_rnt_sq);
	}

	@Override
	public List<NotebookVO> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
	}

	@Override
	public List<NotebookVO> listPage(int page) throws Exception {

		if (page <= 0) {
			page = 1;
		}

		page = (page - 1) * 10;

		return session.selectList(namespace + ".listPage", page);
	}

	@Override
	public List<NotebookVO> listCriteria(Criteria cri) throws Exception {

		return session.selectList(namespace + ".listCriteria", cri);
	}

	@Override
	public int countPaging(Criteria cri) throws Exception {

		return session.selectOne(namespace + ".countPaging", cri);
	}

	@Override
	public List<NotebookVO> listSearch(SearchCriteria cri) throws Exception {

		return session.selectList(namespace + ".listSearch", cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {

		return session.selectOne(namespace + ".listSearchCount", cri);
	}

	@Override
	public List<NotebookVO> ntbkList() throws Exception
	{
		return session.selectList(namespace + ".ntbkList");
	}
	@Override
	public List<NotebookVO> ntbk() throws Exception
	{
		return session.selectList(namespace + ".List");
	}


}
