package org.kangnam.domain;

public class MemberVO {

	private int mem_sq;              //회원번호
	private String mem_nm;           //회원이름
	private String mem_pthon;        //전화번호
	private String mem_jn_dd;        //가입일
	private String admn_id;     
	private String mon_mem_addr;     //월회원주소
	private String mon_mem_brthday;  //월회원생일
	private int seat_dvs_sq;         //좌석구분번호
	private String seat_dvs_nm;      //좌석구분명
	private int lc_sq;               //사물함 번호
	private String lc_nm;            //사물함 이름
	private int seat_sq;             //좌석번호 
	private String seat_nm;          //좌석명
	private String mon_mem_strt_dd;  //월회원 시작일
	private String mon_mem_end_dd;   //월회원 종료일
	private int sl_prod_sq;      //판매물품번호
	private String sl_prod_nm;   //판매물품명
	private int mon_mem_rgstrt_sq;  //월회원등록번호


	public int getMem_sq() {
		return mem_sq;
	}

	public void setMem_sq(int mem_sq) {
		this.mem_sq = mem_sq;
	}

	public String getMem_nm() {
		return mem_nm;
	}

	public void setMem_nm(String mem_nm) {
		this.mem_nm = mem_nm;
	}

	public String getMem_pthon() {
		return mem_pthon;
	}

	public void setMem_pthon(String mem_pthon) {
		this.mem_pthon = mem_pthon;
	}

	public String getMem_jn_dd() {
		return mem_jn_dd;
	}

	public void setMem_jn_dd(String mem_jn_dd) {
		this.mem_jn_dd = mem_jn_dd;
	}

	public String getAdmn_id() {
		return admn_id;
	}

	public void setAdmn_id(String admn_id) {
		this.admn_id = admn_id;
	}

	public String getMon_mem_addr() {
		return mon_mem_addr;
	}

	public void setMon_mem_addr(String mon_mem_addr) {
		this.mon_mem_addr = mon_mem_addr;
	}

	public String getMon_mem_brthday() {
		return mon_mem_brthday;
	}

	public void setMon_mem_brthday(String mon_mem_brthday) {
		this.mon_mem_brthday = mon_mem_brthday;
	}

	public int getSeat_dvs_sq() {
		return seat_dvs_sq;
	}

	public void setSeat_dvs_sq(int seat_dvs_sq) {
		this.seat_dvs_sq = seat_dvs_sq;
	}

	public String getSeat_dvs_nm() {
		return seat_dvs_nm;
	}

	public void setSeat_dvs_nm(String seat_dvs_nm) {
		this.seat_dvs_nm = seat_dvs_nm;
	}

	public int getLc_sq() {
		return lc_sq;
	}

	public void setLc_sq(int lc_sq) {
		this.lc_sq = lc_sq;
	}

	public String getLc_nm() {
		return lc_nm;
	}

	public void setLc_nm(String lc_nm) {
		this.lc_nm = lc_nm;
	}

	public int getSeat_sq() {
		return seat_sq;
	}

	public void setSeat_sq(int seat_sq) {
		this.seat_sq = seat_sq;
	}

	public String getSeat_nm() {
		return seat_nm;
	}

	public void setSeat_nm(String seat_nm) {
		this.seat_nm = seat_nm;
	}

	public String getMon_mem_strt_dd() {
		return mon_mem_strt_dd;
	}

	public void setMon_mem_strt_dd(String mon_mem_strt_dd) {
		this.mon_mem_strt_dd = mon_mem_strt_dd;
	}

	public String getMon_mem_end_dd() {
		return mon_mem_end_dd;
	}

	public void setMon_mem_end_dd(String mon_mem_end_dd) {
		this.mon_mem_end_dd = mon_mem_end_dd;
	}

	public int getSl_prod_sq() {
		return sl_prod_sq;
	}

	public void setSl_prod_sq(int sl_prod_sq) {
		this.sl_prod_sq = sl_prod_sq;
	}

	public String getSl_prod_nm() {
		return sl_prod_nm;
	}

	public void setSl_prod_nm(String sl_prod_nm) {
		this.sl_prod_nm = sl_prod_nm;
	}

	public int getMon_mem_rgstrt_sq() {
		return mon_mem_rgstrt_sq;
	}

	public void setMon_mem_rgstrt_sq(int mon_mem_rgstrt_sq) {
		this.mon_mem_rgstrt_sq = mon_mem_rgstrt_sq;
	}

	@Override
	public String toString() {
		return "MemberVO [mem_sq=" + mem_sq + ", mem_nm=" + mem_nm + ", mem_pthon=" + mem_pthon + ", mem_jn_dd="
				+ mem_jn_dd + ", admn_id=" + admn_id + ", mon_mem_addr=" + mon_mem_addr + ", mon_mem_brthday="
				+ mon_mem_brthday + ", seat_dvs_sq=" + seat_dvs_sq + ", seat_dvs_nm=" + seat_dvs_nm + ", lc_sq=" + lc_sq
				+ ", lc_nm=" + lc_nm + ", seat_sq=" + seat_sq + ", seat_nm=" + seat_nm + ", mon_mem_strt_dd="
				+ mon_mem_strt_dd + ", mon_mem_end_dd=" + mon_mem_end_dd + ", sl_prod_sq=" + sl_prod_sq
				+ ", sl_prod_nm=" + sl_prod_nm + ", mon_mem_rgstrt_sq=" + mon_mem_rgstrt_sq + "]";
	}



}
