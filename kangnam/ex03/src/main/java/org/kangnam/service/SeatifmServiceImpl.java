package org.kangnam.service;

import java.util.List;

import javax.inject.Inject;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.LockifmVO;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.domain.SeatifmVO;
import org.kangnam.persistence.LockifmDAO;
import org.kangnam.persistence.SeatDAO;
import org.kangnam.persistence.SeatifmDAO;
import org.springframework.stereotype.Service;

@Service
public class SeatifmServiceImpl implements SeatifmService
{
	@Inject
	private SeatifmDAO dao;

	@Override
	public List<SeatifmVO> list() throws Exception
	{
		return dao.list();
	}

	@Override
	public void update(String seat_aloc_sq) throws Exception
	{
		dao.update(seat_aloc_sq);
	}

	@Override
	public List<SeatifmVO> monList() throws Exception
	{
		return dao.monList();
	}
	
	
}
