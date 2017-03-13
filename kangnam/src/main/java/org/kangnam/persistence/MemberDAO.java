package org.kangnam.persistence;

import java.util.List;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.MemberVO;
import org.kangnam.domain.SearchCriteria;

public interface MemberDAO {

	public void create(MemberVO vo) throws Exception;

	public void create1(MemberVO vo) throws Exception;

	public void create2(MemberVO vo) throws Exception;


	public MemberVO read(int mem_sq) throws Exception;

	public MemberVO read1(int mem_sq) throws Exception;

	public MemberVO read2(int mon_mem_rgstrt_sq) throws Exception;

	// 회원정보 출력
	public MemberVO read3(int mem_sq) throws Exception;

	public void update1(MemberVO vo) throws Exception;
	public void update2(MemberVO vo) throws Exception;

	public void delete(int mem_sq) throws Exception;

	public List<MemberVO> listAll() throws Exception;

	public List<MemberVO> listPage(int page) throws Exception;

	public List<MemberVO> listCriteria(Criteria cri) throws Exception;

	public int countPaging(Criteria cri) throws Exception;

	//use for dynamic sql

	public List<MemberVO> listSearch(SearchCriteria cri)throws Exception;

	public int listSearchCount(SearchCriteria cri)throws Exception;


	public List<MemberVO> locList() throws Exception;

	public List<MemberVO> memList() throws Exception;

	public List<MemberVO> seatList() throws Exception;

	public List<MemberVO> mdvsList() throws Exception;

	public int maxMemSq() throws Exception;

	public int maxRgsSq(int mem_sq) throws Exception;
}
