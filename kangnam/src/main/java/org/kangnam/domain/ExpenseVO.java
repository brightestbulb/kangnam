package org.kangnam.domain;

import java.util.Date;

public class ExpenseVO {
	
	private int exps_sq; //지출내역번호
	private String admn_id; //관리자계정
	private String admn_nm; //관리자 이름
	private int accnt_sq; //거래처 번호
	private String accnt_nm; //거래처 이름
	private int exps_dvs_sq; //지출구분번호
	private String exps_dvs_nm;//지출구분명
	private Date exps_dt; //지출일
    private String exps_nm; //지출명
    private int exps_mn;  //지출금액
    
	public int getExps_sq() {
		return exps_sq;
	}
	public void setExps_sq(int exps_sq) {
		this.exps_sq = exps_sq;
	}
	public String getAdmn_id() {
		return admn_id;
	}
	public void setAdmn_id(String admn_id) {
		this.admn_id = admn_id;
	}
	public String getAdmn_nm() {
		return admn_nm;
	}
	public void setAdmn_nm(String admn_nm) {
		this.admn_nm = admn_nm;
	}
	public int getAccnt_sq() {
		return accnt_sq;
	}
	public void setAccnt_sq(int accnt_sq) {
		this.accnt_sq = accnt_sq;
	}
	public String getAccnt_nm() {
		return accnt_nm;
	}
	public void setAccnt_nm(String accnt_nm) {
		this.accnt_nm = accnt_nm;
	}
	public int getExps_dvs_sq() {
		return exps_dvs_sq;
	}
	public void setExps_dvs_sq(int exps_dvs_sq) {
		this.exps_dvs_sq = exps_dvs_sq;
	}
	public String getExps_dvs_nm() {
		return exps_dvs_nm;
	}
	public void setExps_dvs_nm(String exps_dvs_nm) {
		this.exps_dvs_nm = exps_dvs_nm;
	}
	public Date getExps_dt() {
		return exps_dt;
	}
	public void setExps_dt(Date exps_dt) {
		this.exps_dt = exps_dt;
	}
	public String getExps_nm() {
		return exps_nm;
	}
	public void setExps_nm(String exps_nm) {
		this.exps_nm = exps_nm;
	}
	public int getExps_mn() {
		return exps_mn;
	}
	public void setExps_mn(int exps_mn) {
		this.exps_mn = exps_mn;
	}
	@Override
	public String toString() {
		return "ExpenseVO [exps_sq=" + exps_sq + ", admn_id=" + admn_id + ", admn_nm=" + admn_nm + ", accnt_sq="
				+ accnt_sq + ", accnt_nm=" + accnt_nm + ", exps_dvs_sq=" + exps_dvs_sq + ", exps_dvs_nm=" + exps_dvs_nm
				+ ", exps_dt=" + exps_dt + ", exps_nm=" + exps_nm + ", exps_mn=" + exps_mn + "]";
	}
    
  
	
    
}
