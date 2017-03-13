package org.kangnam.service;

import java.util.Date;

import javax.inject.Inject;

import org.kangnam.domain.UserVO;
import org.kangnam.dto.LoginDTO;
import org.kangnam.persistence.UserDAO;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Inject
	private UserDAO dao;

	@Override

	public UserVO login(LoginDTO dto) throws Exception{
		return dao.login(dto);
	}

	@Override
	public void keepLogin(String uid, String sessionId, Date next)
			throws Exception {

		dao.keepLogin(uid, sessionId, next);

	}

	@Override
	public UserVO checkLoginBefore(String value) {

		return dao.checkUserWithSessionKey(value);
	}

	@Override
	public void regist(UserVO user) throws Exception {
		dao.create(user);

	}
}
