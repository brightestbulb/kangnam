package org.kangnam.domain;

public class LockifmVO 
{
	// 현재 월 회원 리스트 출력 VO
	private String mem_sq, mem_nm, mem_pthon, lc_nm, mon_mem_strt_dd, mon_mem_end_dd;

	// 사물함 수정하기 위한 vo
	private String lc_sq;

	// getter / setter 생성
	public String getLc_sq()
	{
		return lc_sq;
	}
	public void setLc_sq(String lc_sq)
	{
		this.lc_sq = lc_sq;
	}

	public String getMem_sq()
	{
		return mem_sq;
	}

	public void setMem_sq(String mem_sq)
	{
		this.mem_sq = mem_sq;
	}

	public String getMem_nm()
	{
		return mem_nm;
	}

	public void setMem_nm(String mem_nm)
	{
		this.mem_nm = mem_nm;
	}

	public String getMem_pthon()
	{
		return mem_pthon;
	}

	public void setMem_pthon(String mem_pthon)
	{
		this.mem_pthon = mem_pthon;
	}

	public String getLc_nm()
	{
		return lc_nm;
	}

	public void setLc_nm(String lc_nm)
	{
		this.lc_nm = lc_nm;
	}

	public String getMon_mem_strt_dd()
	{
		return mon_mem_strt_dd;
	}

	public void setMon_mem_strt_dd(String mon_mem_strt_dd)
	{
		this.mon_mem_strt_dd = mon_mem_strt_dd;
	}

	public String getMon_mem_end_dd()
	{
		return mon_mem_end_dd;
	}

	public void setMon_mem_end_dd(String mon_mem_end_dd)
	{
		this.mon_mem_end_dd = mon_mem_end_dd;
	}

}
