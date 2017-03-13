package org.kangnam.service;

import java.util.Date;

import org.kangnam.domain.UserVO;
import org.kangnam.dto.LoginDTO;

public interface UserService {
	
	public UserVO login(LoginDTO dto) throws Exception;
	
	public void keepLogin(String uid, String sessionId, Date next)throws Exception;
	
	public UserVO checkLoginBefore(String value);

	public void regist(UserVO user) throws Exception;
}
