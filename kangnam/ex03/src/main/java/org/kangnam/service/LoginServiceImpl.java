package org.kangnam.service;

import java.sql.SQLException;

import javax.inject.Inject;

import org.kangnam.domain.LoginVO;
import org.kangnam.persistence.LoginDAO;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService
{
	@Inject
	private LoginDAO dao;

	// 해당 계정이 있는지 조회하라
	@Override
	public String cnt(LoginVO vo) throws SQLException
	{
		return dao.cnt(vo);
	}

	// 계정이 존재한다면 그 정보를 불러와라
	@Override
	public LoginVO read(LoginVO vo) throws SQLException
	{
		return dao.read(vo);
	}



}
