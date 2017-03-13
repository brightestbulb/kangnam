package org.kangnam.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.kangnam.domain.Criteria;
import org.kangnam.domain.OnedayVO;
import org.kangnam.domain.SearchCriteria;
import org.springframework.stereotype.Repository;

@Repository
public class OnedayDAOImpl implements OnedayDAO {

	@Inject
	private SqlSession session;

	private static String namespace = "org.kangnam.mapper.OnedayMapper";

	@Override
	public void create(OnedayVO vo) throws Exception {
		session.insert(namespace + ".create", vo);
	}

	@Override
	public OnedayVO read(int mem_sq) throws Exception {
		return session.selectOne(namespace + ".read", mem_sq);
	}

	@Override
	public void update(OnedayVO vo) throws Exception {
		session.update(namespace + ".update", vo);
	}

	@Override
	public void delete(int mem_sq) throws Exception {
		session.delete(namespace + ".delete", mem_sq);
	}

	@Override
	public List<OnedayVO> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
	}

	@Override
	public List<OnedayVO> listPage(int page) throws Exception {

		if (page <= 0) {
			page = 1;
		}

		page = (page - 1) * 10;

		return session.selectList(namespace + ".listPage", page);
	}

	@Override
	public List<OnedayVO> listCriteria(Criteria cri) throws Exception {

		return session.selectList(namespace + ".listCriteria", cri);
	}

	@Override
	public int countPaging(Criteria cri) throws Exception {

		return session.selectOne(namespace + ".countPaging", cri);
	}

	@Override
	public List<OnedayVO> listSearch(SearchCriteria cri) throws Exception {

		return session.selectList(namespace + ".listSearch", cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {

		return session.selectOne(namespace + ".listSearchCount", cri);
	}

	@Override
	public int maxMemSq() throws Exception {
		return session.selectOne(namespace + ".maxMemSq");
	}

}
