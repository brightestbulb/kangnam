package org.kangnam.domain;

import java.util.Date;

public class BoardVO {

	private int ntc_sq;  //공지사항번호
	private String ntc_sbjct;//공지사항 제목
	private String ntc_cmt;// 공지사항내용
	private String admn_id;//작성자        
	private String admn_nm; //작성자 이름
	private Date ntc_tm;//공지사항 작성일
	private int ntc_hits; //공지사항 조회수


	public int getNtc_sq() {
		return ntc_sq;
	}
	public void setNtc_sq(int ntc_sq) {
		this.ntc_sq = ntc_sq;
	}
	public String getNtc_sbjct() {
		return ntc_sbjct;
	}
	public void setNtc_sbjct(String ntc_sbjct) {
		this.ntc_sbjct = ntc_sbjct;
	}
	public String getNtc_cmt() {
		return ntc_cmt;
	}
	public void setNtc_cmt(String ntc_cmt) {
		this.ntc_cmt = ntc_cmt;
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
	public Date getNtc_tm() {
		return ntc_tm;
	}
	public void setNtc_tm(Date ntc_tm) {
		this.ntc_tm = ntc_tm;
	}
	public int getNtc_hits() {
		return ntc_hits;
	}
	public void setNtc_hits(int ntc_hits) {
		this.ntc_hits = ntc_hits;
	}
	@Override
	public String toString() {
		return "BoardVO [ntc_sq=" + ntc_sq + ", ntc_sbjct=" + ntc_sbjct + ", ntc_cmt=" + ntc_cmt + ", admn_id=" + admn_id
				+ ", admn_nm=" + admn_nm + ", ntc_tm=" + ntc_tm + ", ntc_hits=" + ntc_hits + "]";
	}




}