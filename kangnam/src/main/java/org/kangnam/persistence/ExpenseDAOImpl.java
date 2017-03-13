package org.kangnam.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.kangnam.domain.Criteria;
import org.kangnam.domain.ExpenseVO;
import org.kangnam.domain.SearchCriteria;
import org.springframework.stereotype.Repository;

@Repository
public class ExpenseDAOImpl implements ExpenseDAO {

	@Inject
	private SqlSession session;

	private static String namespace = "org.kangnam.mapper.ExpenseMapper";

	@Override
	public void create(ExpenseVO vo) throws Exception {
		session.insert(namespace + ".create", vo);
	}

	@Override
	public ExpenseVO read(int exps_sq) throws Exception {

		return session.selectOne(namespace + ".read", exps_sq);
	}

	@Override
	public void update(ExpenseVO vo) throws Exception {
		session.update(namespace + ".update", vo);
	}

	@Override
	public void delete(int exps_sq) throws Exception {
		session.delete(namespace + ".delete", exps_sq);
	}

	@Override
	public List<ExpenseVO> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
	}
	@Override
	public void updateViewCnt(int exps_sq) throws Exception {

		session.update(namespace+".updateViewCnt", exps_sq);

	}
	@Override
	public List<ExpenseVO> listPage(int page) throws Exception {

		if (page <= 0) {
			page = 1;
		}

		page = (page - 1) * 10;

		return session.selectList(namespace + ".listPage", page);
	}

	@Override
	public List<ExpenseVO> listCriteria(Criteria cri) throws Exception {
		return session.selectList(namespace+".listCriteria", cri);
	}



	public int countPaging(Criteria cri)throws Exception{
		return session.selectOne(namespace+".countPaging", cri);
	}

	@Override
	public List<ExpenseVO> listSearch(SearchCriteria cri)throws Exception{
		return session.selectList(namespace+ ".listSearch", cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri)throws Exception{
		return session.selectOne(namespace + ".listSearchCount", cri);
	}
	@Override
	public List<ExpenseVO> exlist() throws Exception
	{
		return session.selectList(namespace + ".exlist");
	}

	@Override
	public List<ExpenseVO> dvslist() throws Exception
	{
		return session.selectList(namespace + ".dvslist");
	}

}
