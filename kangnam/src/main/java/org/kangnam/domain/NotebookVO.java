package org.kangnam.domain;

import java.util.Date;

public class NotebookVO {
	
	private int ntbk_rnt_sq;              // 노트북대여번호
	private String admn_id;               //관리자 계정
	private int mem_sq;                   //화원번호
	private Date ntbk_rnt_strt_dt;       //대여시간
	private Date ntbk_rnt_end_dt;        //반납시간
	private int ntbk_sq;                 //노트북 번호
    private String ntbk_nm;              //노트북명
    
	public int getNtbk_rnt_sq() {
		return ntbk_rnt_sq;
	}
	public void setNtbk_rnt_sq(int ntbk_rnt_sq) {
		this.ntbk_rnt_sq = ntbk_rnt_sq;
	}
	public String getAdmn_id() {
		return admn_id;
	}
	public void setAdmn_id(String admn_id) {
		this.admn_id = admn_id;
	}
	public int getMem_sq() {
		return mem_sq;
	}
	public void setMem_sq(int mem_sq) {
		this.mem_sq = mem_sq;
	}
	public Date getNtbk_rnt_strt_dt() {
		return ntbk_rnt_strt_dt;
	}
	public void setNtbk_rnt_strt_dt(Date ntbk_rnt_strt_dt) {
		this.ntbk_rnt_strt_dt = ntbk_rnt_strt_dt;
	}
	public Date getNtbk_rnt_end_dt() {
		return ntbk_rnt_end_dt;
	}
	public void setNtbk_rnt_end_dt(Date ntbk_rnt_end_dt) {
		this.ntbk_rnt_end_dt = ntbk_rnt_end_dt;
	}
	public int getNtbk_sq() {
		return ntbk_sq;
	}
	public void setNtbk_sq(int ntbk_sq) {
		this.ntbk_sq = ntbk_sq;
	}
	public String getNtbk_nm() {
		return ntbk_nm;
	}
	public void setNtbk_nm(String ntbk_nm) {
		this.ntbk_nm = ntbk_nm;
	}
	@Override
	public String toString() {
		return "NotebookVO [ntbk_rnt_sq=" + ntbk_rnt_sq + ", admn_id=" + admn_id + ", mem_sq=" + mem_sq
				+ ", ntbk_rnt_strt_dt=" + ntbk_rnt_strt_dt + ", ntbk_rnt_end_dt=" + ntbk_rnt_end_dt + ", ntbk_sq="
				+ ntbk_sq + ", ntbk_nm=" + ntbk_nm + "]";
	}
}
