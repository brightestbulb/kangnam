package org.kangnam.domain;

public class SellTotalVO
{
	// SL_VW 의 컬럼명 + 검색 값 sl_strt, sl_end 를 추가
	private String sl_sq, sl_dt, cpn, oneday, monday, total, sl_strt, sl_end;

	// 쿠폰, 일권, 월권 합계 
	private String sumcpn, sumone, summon, sumtotal;

	public String getSl_sq()
	{
		return sl_sq;
	}

	public void setSl_sq(String sl_sq)
	{
		this.sl_sq = sl_sq;
	}

	public String getSl_dt()
	{
		return sl_dt;
	}

	public void setSl_dt(String sl_dt)
	{
		this.sl_dt = sl_dt;
	}

	public String getCpn()
	{
		return cpn;
	}

	public void setCpn(String cpn)
	{
		this.cpn = cpn;
	}

	public String getOneday()
	{
		return oneday;
	}

	public void setOneday(String oneday)
	{
		this.oneday = oneday;
	}

	public String getMonday()
	{
		return monday;
	}

	public void setMonday(String monday)
	{
		this.monday = monday;
	}

	public String getTotal()
	{
		return total;
	}

	public void setTotal(String total)
	{
		this.total = total;
	}

	public String getSl_strt()
	{
		return sl_strt;
	}

	public void setSl_strt(String sl_strt)
	{
		this.sl_strt = sl_strt;
	}

	public String getSl_end()
	{
		return sl_end;
	}

	public void setSl_end(String sl_end)
	{
		this.sl_end = sl_end;
	}

	public String getSumcpn()
	{
		return sumcpn;
	}

	public void setSumcpn(String sumcpn)
	{
		this.sumcpn = sumcpn;
	}

	public String getSumone()
	{
		return sumone;
	}

	public void setSumone(String sumone)
	{
		this.sumone = sumone;
	}

	public String getSummon()
	{
		return summon;
	}

	public void setSummon(String summon)
	{
		this.summon = summon;
	}

	public String getSumtotal()
	{
		return sumtotal;
	}

	public void setSumtotal(String sumtotal)
	{
		this.sumtotal = sumtotal;
	}






}
