package org.kangnam.service;

import java.util.List;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.MemberVO;
import org.kangnam.domain.SearchCriteria;

public interface MemberService {

	public void regist1(MemberVO member) throws Exception;

	public void regist2(MemberVO member) throws Exception;

	public void regist3(MemberVO member) throws Exception;

	public MemberVO read(int mem_sq) throws Exception;

	public MemberVO read1(int mem_sq) throws Exception;

	public MemberVO read2(int mon_mem_rgstrt_sq) throws Exception;

	// 회원정보 출력
	public MemberVO read3(int mem_sq) throws Exception;

	public void modify(MemberVO member) throws Exception;

	public void remove(int mem_sq) throws Exception;

	public List<MemberVO> listAll() throws Exception;

	public List<MemberVO> listCriteria(Criteria cri) throws Exception;

	public int listCountCriteria(Criteria cri) throws Exception;

	public List<MemberVO> listSearchCriteria(SearchCriteria cri) throws Exception;

	public int listSearchCount(SearchCriteria cri) throws Exception;

	public List<MemberVO> locList() throws Exception;

	public List<MemberVO> memList() throws Exception;

	public List<MemberVO> seatList() throws Exception;

	public List<MemberVO> mdvsList() throws Exception;

	public int maxMemSq() throws Exception;

	public int maxRgsSq(int mem_sq) throws Exception;

}
