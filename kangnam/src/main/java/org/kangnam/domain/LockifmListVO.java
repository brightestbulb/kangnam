package org.kangnam.domain;

public class LockifmListVO
{
	// 사물함 현황 VO
	private String lc_nm;    //사물함 번호
	private String mem_nm;   //회원 이름
	private String mon_mem_end_dd;  //사물함 종료일 (월회원 종료일과 동일)
	
	// 현재 인원 VO
	private String mem_dvs, cnt, tot;

	public String getLc_nm()
	{
		return lc_nm;
	}

	public void setLc_nm(String lc_nm)
	{
		this.lc_nm = lc_nm;
	}

	public String getMem_nm()
	{
		return mem_nm;
	}

	public void setMem_nm(String mem_nm)
	{
		this.mem_nm = mem_nm;
	}

	public String getMon_mem_end_dd()
	{
		return mon_mem_end_dd;
	}

	public void setMon_mem_end_dd(String mon_mem_end_dd)
	{
		this.mon_mem_end_dd = mon_mem_end_dd;
	}

	public String getMem_dvs()
	{
		return mem_dvs;
	}

	public void setMem_dvs(String mem_dvs)
	{
		this.mem_dvs = mem_dvs;
	}

	public String getCnt()
	{
		return cnt;
	}

	public void setCnt(String cnt)
	{
		this.cnt = cnt;
	}

	public String getTot()
	{
		return tot;
	}

	public void setTot(String tot)
	{
		this.tot = tot;
	}	
	
	
}
