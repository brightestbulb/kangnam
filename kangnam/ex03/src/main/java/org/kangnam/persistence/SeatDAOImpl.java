package org.kangnam.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.kangnam.domain.Criteria;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.domain.SeatVO;
import org.kangnam.domain.SellVO;
import org.springframework.stereotype.Repository;

@Repository
public class SeatDAOImpl implements SeatDAO {

	@Inject
	private SqlSession session;

	private static String namespace = "org.kangnam.mapper.SeatMapper";

	@Override
	public void create(SeatVO vo) throws Exception {
		session.insert(namespace + ".create", vo);
	}

	@Override
	public SeatVO read(int seat_aloc_sq) throws Exception {
		return session.selectOne(namespace + ".read", seat_aloc_sq);
	}

	@Override
	public void update(SeatVO vo) throws Exception {
		session.update(namespace + ".update", vo);
	}

	@Override
	public void delete(int seat_aloc_sq) throws Exception {
		session.delete(namespace + ".delete", seat_aloc_sq);
	}

	@Override
	public List<SeatVO> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
	}

	@Override
	public List<SeatVO> listPage(int page) throws Exception {

		if (page <= 0) {
			page = 1;
		}

		page = (page - 1) * 10;

		return session.selectList(namespace + ".listPage", page);
	}

	@Override
	public List<SeatVO> listCriteria(Criteria cri) throws Exception {
		return session.selectList(namespace + ".listCriteria", cri);
	}

	public int countPaging(Criteria cri) throws Exception {
		return session.selectOne(namespace + ".countPaging", cri);
	}

	@Override
	public List<SeatVO> listSearch(SearchCriteria cri) throws Exception {
		return session.selectList(namespace + ".listSearch", cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		return session.selectOne(namespace + ".listSearchCount", cri);
	}

	// 월회원 고정석 현재 사용가능한 좌석 출력 쿼리
	@Override
	public List<SellVO> day_seat_list() throws Exception {
		return session.selectList(namespace + ".day_seat_list");
	}
}
