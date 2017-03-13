package org.kangnam.persistence;

import java.util.Date;

import org.kangnam.domain.UserVO;
import org.kangnam.dto.LoginDTO;

public interface UserDAO {

	public UserVO login(LoginDTO dto)throws Exception;
	
	public void keepLogin(String uid, String sessionId, Date next);
	
	public UserVO checkUserWithSessionKey(String value);
	
	public void create(UserVO vo) throws Exception;

}