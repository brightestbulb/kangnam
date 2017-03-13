package org.kangnam.domain;

import java.sql.Time;
import java.util.Date;

public class SeatVO {

	private int seat_aloc_sq; //좌석배정번호
	private String mem_nm;    //회원이름
	private int mem_sq;       //회원번호
	private String seat_nm;  //좌석명
	private int seat_sq;     //좌석번호
	private Date seat_aloc_dd; //좌석배정일
	private Time seat_aloc_strt_tm; //좌석배정시작시간
	private Time seat_aloc_end_tm;  //좌석배정종료시간
	private String dvs;            //  회원,월회원
	private String admn_id;        //관리자


	public int getSeat_aloc_sq() {
		return seat_aloc_sq;
	}
	public void setSeat_aloc_sq(int seat_aloc_sq) {
		this.seat_aloc_sq = seat_aloc_sq;
	}
	public String getMem_nm() {
		return mem_nm;
	}
	public void setMem_nm(String mem_nm) {
		this.mem_nm = mem_nm;
	}
	public int getMem_sq() {
		return mem_sq;
	}
	public void setMem_sq(int mem_sq) {
		this.mem_sq = mem_sq;
	}
	public String getSeat_nm() {
		return seat_nm;
	}
	public void setSeat_nm(String seat_nm) {
		this.seat_nm = seat_nm;
	}
	public int getSeat_sq() {
		return seat_sq;
	}
	public void setSeat_sq(int seat_sq) {
		this.seat_sq = seat_sq;
	}
	public Date getSeat_aloc_dd() {
		return seat_aloc_dd;
	}
	public void setSeat_aloc_dd(Date seat_aloc_dd) {
		this.seat_aloc_dd = seat_aloc_dd;
	}
	public Time getSeat_aloc_strt_tm() {
		return seat_aloc_strt_tm;
	}
	public void setSeat_aloc_strt_tm(Time seat_aloc_strt_tm) {
		this.seat_aloc_strt_tm = seat_aloc_strt_tm;
	}
	public Time getSeat_aloc_end_tm() {
		return seat_aloc_end_tm;
	}
	public void setSeat_aloc_end_tm(Time seat_aloc_end_tm) {
		this.seat_aloc_end_tm = seat_aloc_end_tm;
	}
	public String getDvs() {
		return dvs;
	}
	public void setDvs(String dvs) {
		this.dvs = dvs;
	}
	public String getAdmn_id() {
		return admn_id;
	}
	public void setAdmn_id(String admn_id) {
		this.admn_id = admn_id;
	}
	@Override
	public String toString() {
		return "SeatVO [seat_aloc_sq=" + seat_aloc_sq + ", mem_nm=" + mem_nm + ", mem_sq=" + mem_sq + ", seat_nm="
				+ seat_nm + ", seat_sq=" + seat_sq + ", seat_aloc_dd=" + seat_aloc_dd + ", seat_aloc_strt_tm="
				+ seat_aloc_strt_tm + ", seat_aloc_end_tm=" + seat_aloc_end_tm + ", dvs=" + dvs + ", admn_id=" + admn_id
				+ "]";
	}





}
