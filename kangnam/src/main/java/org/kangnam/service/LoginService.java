package org.kangnam.service;

import java.sql.SQLException;

import org.kangnam.domain.LoginVO;

public interface LoginService
{
	// 해당 계정이 있는지 조회하라
	public String cnt(LoginVO vo) throws SQLException;

	// 계정이 존재한다면 그 정보를 불러와라
	public LoginVO read(LoginVO vo) throws SQLException;
}
