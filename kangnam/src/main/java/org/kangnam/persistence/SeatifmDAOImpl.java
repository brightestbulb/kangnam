package org.kangnam.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.kangnam.domain.Criteria;
import org.kangnam.domain.LockifmVO;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.domain.SeatifmVO;
import org.springframework.stereotype.Repository;

@Repository
public class SeatifmDAOImpl implements SeatifmDAO
{
	@Inject
	private SqlSession session;

	private static String namespace = "org.kangnam.mapper.SeatifmMapper";

	@Override
	public List<SeatifmVO> list() throws Exception
	{
		return session.selectList(namespace + ".list");
	}

	@Override
	public void update(String seat_aloc_sq) throws Exception
	{
		session.update(namespace + ".update", seat_aloc_sq);
	}

	@Override
	public List<SeatifmVO> monList() throws Exception
	{
		return session.selectList(namespace + ".monList");
	}


}
