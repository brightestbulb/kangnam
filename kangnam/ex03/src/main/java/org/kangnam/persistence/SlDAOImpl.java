package org.kangnam.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.kangnam.domain.SlVO;
import org.springframework.stereotype.Repository;

@Repository
public class SlDAOImpl implements SlDAO
{
	@Inject
	private SqlSession session;

	// Mappers 패키지의 위치를 나타낸듯 하다.
	private static String namespace = "org.kangnam.mapper.slMapper";

	@Override
	public List<SlVO> today_sell() throws Exception
	{
		return session.selectList(namespace + ".today_sell");
	}

	
}
