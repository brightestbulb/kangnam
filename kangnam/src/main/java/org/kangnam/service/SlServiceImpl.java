package org.kangnam.service;

import java.util.List;

import javax.inject.Inject;

import org.kangnam.domain.SlVO;
import org.kangnam.persistence.SlDAO;
import org.springframework.stereotype.Service;

@Service
public class SlServiceImpl implements SlService
{
	
	@Inject
	private SlDAO dao;

	
	// 월 회원권 판매 금액
	@Override
	public List<SlVO> today_sell() throws Exception
	{
		return dao.today_sell();
	}

}
