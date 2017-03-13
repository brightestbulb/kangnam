package org.kangnam.domain;

public class LoginVO
{
	// 관리자 테이블 컬럼명 + cnt 컬럼명
	private String admn_id, admn_pwd, admn_nm, admn_tphon, cnt;

	public String getCnt()
	{
		return cnt;
	}

	public void setCnt(String cnt)
	{
		this.cnt = cnt;
	}

	public String getAdmn_id()
	{
		return admn_id;
	}

	public void setAdmn_id(String admn_id)
	{
		this.admn_id = admn_id;
	}

	public String getAdmn_pwd()
	{
		return admn_pwd;
	}

	public void setAdmn_pwd(String admn_pwd)
	{
		this.admn_pwd = admn_pwd;
	}

	public String getAdmn_nm()
	{
		return admn_nm;
	}

	public void setAdmn_nm(String admn_nm)
	{
		this.admn_nm = admn_nm;
	}

	public String getAdmn_tphon()
	{
		return admn_tphon;
	}

	public void setAdmn_tphon(String admn_tphon)
	{
		this.admn_tphon = admn_tphon;
	}


}
