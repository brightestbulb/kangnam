package org.kangnam.persistence;

import java.sql.SQLException;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.kangnam.domain.LoginVO;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAOImpl implements LoginDAO
{
	@Inject
	private SqlSession session;

	private static String namespace = "org.kangnam.mapper.loginMapper";

	// 해당 계정이 있는지 조회하라
	@Override
	public String cnt(LoginVO vo) throws SQLException
	{
		return session.selectOne(namespace + ".cnt", vo);
	}

	// 계정이 존재한다면 그 정보를 불러와라
	@Override
	public LoginVO read(LoginVO vo) throws SQLException
	{
		return session.selectOne(namespace + ".read", vo);
	}
	
	
}
