package org.kangnam.service;

import java.util.List;

import javax.inject.Inject;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.MemberVO;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.persistence.MemberDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberServiceImpl implements MemberService
{

	@Inject
	private MemberDAO dao;

	@Override
	public void regist1(MemberVO member) throws Exception
	{
		dao.create(member);
		// dao.create1(member);
		// dao.create2(member);

	}

	@Override
	public void regist2(MemberVO member) throws Exception
	{

		dao.create1(member);

	}

	@Override
	public void regist3(MemberVO member) throws Exception
	{

		dao.create2(member);

	}

	@Transactional(isolation = Isolation.READ_COMMITTED)
	@Override
	public MemberVO read(int mem_sq) throws Exception
	{
		return dao.read(mem_sq);
	}

	@Transactional(isolation = Isolation.READ_COMMITTED)
	@Override
	public MemberVO read1(int mem_sq) throws Exception
	{
		return dao.read1(mem_sq);
	}

	@Transactional(isolation = Isolation.READ_COMMITTED)
	@Override
	public MemberVO read2(int mon_mem_rgstrt_sq) throws Exception
	{
		return dao.read2(mon_mem_rgstrt_sq);
	}

	@Override
	public MemberVO read3(int mem_sq) throws Exception
	{
		return dao.read3(mem_sq);
	}

	@Override
	public void modify(MemberVO member) throws Exception
	{
		dao.update1(member);
		dao.update2(member);
	}

	@Override
	public void remove(int mem_sq) throws Exception
	{
		dao.delete(mem_sq);
	}

	@Override
	public List<MemberVO> listAll() throws Exception
	{
		return dao.listAll();
	}

	@Override
	public List<MemberVO> listCriteria(Criteria cri) throws Exception
	{

		return dao.listCriteria(cri);
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception
	{

		return dao.countPaging(cri);
	}

	@Override
	public List<MemberVO> listSearchCriteria(SearchCriteria cri) throws Exception
	{

		return dao.listSearch(cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception
	{

		return dao.listSearchCount(cri);
	}

	@Override
	public List<MemberVO> locList() throws Exception
	{
		return dao.locList();
	}

	@Override
	public List<MemberVO> memList() throws Exception
	{
		return dao.memList();
	}

	@Override
	public List<MemberVO> seatList() throws Exception
	{
		return dao.seatList();
	}

	@Override
	public List<MemberVO> mdvsList() throws Exception
	{
		return dao.mdvsList();
	}

	@Override
	public int maxMemSq() throws Exception
	{
		return dao.maxMemSq();
	}

	@Override
	public int maxRgsSq(int mem_sq) throws Exception
	{
		return dao.maxRgsSq(mem_sq);
	}

}
