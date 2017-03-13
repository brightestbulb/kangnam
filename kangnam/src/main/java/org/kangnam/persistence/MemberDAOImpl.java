package org.kangnam.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.kangnam.domain.Criteria;
import org.kangnam.domain.MemberVO;
import org.kangnam.domain.SearchCriteria;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession session;

	private static String namespace = "org.kangnam.mapper.MemberMapper";

	@Override
	public void create(MemberVO vo) throws Exception {
		session.insert(namespace + ".create", vo);
	}
	@Override
	public void create1(MemberVO vo) throws Exception {
		session.insert(namespace + ".create1", vo);
	}
	@Override
	public void create2(MemberVO vo) throws Exception {
		session.insert(namespace + ".create2", vo);
	}

	@Override
	public MemberVO read(int mem_sq) throws Exception {
		return session.selectOne(namespace + ".read", mem_sq);
	}
	@Override
	public MemberVO read1(int mem_sq) throws Exception {
		return session.selectOne(namespace + ".read1", mem_sq);
	}

	@Override
	public MemberVO read2(int mon_mem_rgstrt_sq) throws Exception {
		return session.selectOne(namespace + ".read2", mon_mem_rgstrt_sq);
	}

	@Override
	public MemberVO read3(int mem_sq) throws Exception {
		return session.selectOne(namespace + ".read3", mem_sq);
	}

	@Override
	public void update1(MemberVO vo) throws Exception {
		session.update(namespace + ".update1", vo);
	}
	@Override
	public void update2(MemberVO vo) throws Exception {
		session.update(namespace + ".update2", vo);
	}

	@Override
	public void delete(int mem_sq) throws Exception {
		session.delete(namespace + ".delete", mem_sq);
	}

	@Override
	public List<MemberVO> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
	}

	@Override
	public List<MemberVO> listPage(int page) throws Exception {

		if (page <= 0) {
			page = 1;
		}

		page = (page - 1) * 10;

		return session.selectList(namespace + ".listPage", page);
	}

	@Override
	public List<MemberVO> listCriteria(Criteria cri) throws Exception {

		return session.selectList(namespace + ".listCriteria", cri);
	}

	@Override
	public int countPaging(Criteria cri) throws Exception {

		return session.selectOne(namespace + ".countPaging", cri);
	}

	@Override
	public List<MemberVO> listSearch(SearchCriteria cri) throws Exception {

		return session.selectList(namespace + ".listSearch", cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {

		return session.selectOne(namespace + ".listSearchCount", cri);
	}
	@Override
	public List<MemberVO> locList() throws Exception
	{
		return session.selectList(namespace + ".locList");
	}

	@Override
	public List<MemberVO> memList() throws Exception
	{
		return session.selectList(namespace + ".memList");
	}
	@Override
	public List<MemberVO> seatList() throws Exception
	{
		return session.selectList(namespace + ".seatList");
	}

	@Override
	public List<MemberVO> mdvsList() throws Exception
	{
		return session.selectList(namespace + ".mdvsList");
	}

	@Override
	public int maxMemSq() throws Exception {
		return session.selectOne(namespace + ".maxMemSq");
	}
	@Override
	public int maxRgsSq(int mem_sq) throws Exception {
		return session.selectOne(namespace + ".maxRgsSq", mem_sq);
	}
}
