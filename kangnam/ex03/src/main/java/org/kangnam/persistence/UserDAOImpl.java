package org.kangnam.persistence;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.kangnam.domain.UserVO;
import org.kangnam.dto.LoginDTO;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace="org.kangnam.mapper.UserMapper";
	
	@Override
	public UserVO login(LoginDTO dto) throws Exception{
		
		return session.selectOne(namespace+".login", dto);
	}
	
	@Override
	  public void keepLogin(String uid, String sessionId, Date next) {

	    Map<String, Object> paramMap = new HashMap<String, Object>();
	    paramMap.put("uid", uid);
	    paramMap.put("sessionId", sessionId);
	    paramMap.put("next", next);
	    
	    session.update(namespace+".keepLogin", paramMap);
	    
	  }

	  @Override
	  public UserVO checkUserWithSessionKey(String value) {

	    return session.selectOne(namespace +".checkUserWithSessionKey", value);
	  }

	@Override
	public void create(UserVO vo) throws Exception {
		 session.insert(namespace + ".create", vo);
		
	}	
}
