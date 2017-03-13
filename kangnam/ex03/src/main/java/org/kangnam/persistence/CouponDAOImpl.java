package org.kangnam.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.kangnam.domain.CouponVO;
import org.kangnam.domain.Criteria;
import org.kangnam.domain.SearchCriteria;
import org.springframework.stereotype.Repository;

@Repository
public class CouponDAOImpl implements CouponDAO {

	@Inject
	private SqlSession session;

	private static String namespace = "org.kangnam.mapper.CouponMapper";

	@Override
	public void create(CouponVO vo) throws Exception {
		session.insert(namespace + ".create", vo);
	}

	@Override
	public CouponVO read(int cpn_sq) throws Exception {
		return session.selectOne(namespace + ".read", cpn_sq);
	}

	@Override
	public void update(CouponVO vo) throws Exception {
		session.update(namespace + ".update", vo);
	}

	@Override
	public void delete(int cpn_sq) throws Exception {
		session.delete(namespace + ".delete", cpn_sq);
	}

	@Override
	public List<CouponVO> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
	}

	@Override
	public List<CouponVO> listPage(int page) throws Exception {

		if (page <= 0) {
			page = 1;
		}

		page = (page - 1) * 10;

		return session.selectList(namespace + ".listPage", page);
	}

	@Override
	public List<CouponVO> listCriteria(Criteria cri) throws Exception {

		return session.selectList(namespace + ".listCriteria", cri);
	}

	@Override
	public int countPaging(Criteria cri) throws Exception {

		return session.selectOne(namespace + ".countPaging", cri);
	}

	@Override
	public List<CouponVO> listSearch(SearchCriteria cri) throws Exception {

		return session.selectList(namespace + ".listSearch", cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {

		return session.selectOne(namespace + ".listSearchCount", cri);
	}


}
