package org.kangnam.domain;

public class SellVO
{
	// 판매(SL_TB)
	private String sl_sq, admn_id, mem_sq,mem_nm, sl_prod_sq, by_sq, sl_dt, sl_mn;

	// 구매방법(BY_TB)
	private String by_nm;

	// 판매물품(SL_PROD_TB)
	private String sl_prod_nm;

	// 월회원(MON_MEM_TB)
	private String lc_sq, seat_dvs_sq, seat_sq, mon_mem_addr, mon_mem_brthday;

	// 사물함(LC_TB)
	private String lc_nm;

	// 월회원등록(MON_MEM_RGSTRT_TB)
	private String mon_mem_strt_dd, mon_mem_end_dd, mon_num;

	// 쿠폰(CPN_TB)
	private String cpn_by_dd, cpn_end_dd, cpn_num;

	// 좌석구분(SEAT_DVS_TB)
	private String seat_dvs_nm;

	// 좌석
	private String seat_nm;

	public String getSl_sq() {
		return sl_sq;
	}

	public void setSl_sq(String sl_sq) {
		this.sl_sq = sl_sq;
	}

	public String getAdmn_id() {
		return admn_id;
	}

	public void setAdmn_id(String admn_id) {
		this.admn_id = admn_id;
	}

	public String getMem_sq() {
		return mem_sq;
	}

	public void setMem_sq(String mem_sq) {
		this.mem_sq = mem_sq;
	}

	public String getMem_nm() {
		return mem_nm;
	}

	public void setMem_nm(String mem_nm) {
		this.mem_nm = mem_nm;
	}

	public String getSl_prod_sq() {
		return sl_prod_sq;
	}

	public void setSl_prod_sq(String sl_prod_sq) {
		this.sl_prod_sq = sl_prod_sq;
	}

	public String getBy_sq() {
		return by_sq;
	}

	public void setBy_sq(String by_sq) {
		this.by_sq = by_sq;
	}

	public String getSl_dt() {
		return sl_dt;
	}

	public void setSl_dt(String sl_dt) {
		this.sl_dt = sl_dt;
	}

	public String getSl_mn() {
		return sl_mn;
	}

	public void setSl_mn(String sl_mn) {
		this.sl_mn = sl_mn;
	}

	public String getBy_nm() {
		return by_nm;
	}

	public void setBy_nm(String by_nm) {
		this.by_nm = by_nm;
	}

	public String getSl_prod_nm() {
		return sl_prod_nm;
	}

	public void setSl_prod_nm(String sl_prod_nm) {
		this.sl_prod_nm = sl_prod_nm;
	}

	public String getLc_sq() {
		return lc_sq;
	}

	public void setLc_sq(String lc_sq) {
		this.lc_sq = lc_sq;
	}

	public String getSeat_dvs_sq() {
		return seat_dvs_sq;
	}

	public void setSeat_dvs_sq(String seat_dvs_sq) {
		this.seat_dvs_sq = seat_dvs_sq;
	}

	public String getSeat_sq() {
		return seat_sq;
	}

	public void setSeat_sq(String seat_sq) {
		this.seat_sq = seat_sq;
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

	public String getLc_nm() {
		return lc_nm;
	}

	public void setLc_nm(String lc_nm) {
		this.lc_nm = lc_nm;
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

	public String getMon_num() {
		return mon_num;
	}

	public void setMon_num(String mon_num) {
		this.mon_num = mon_num;
	}

	public String getCpn_by_dd() {
		return cpn_by_dd;
	}

	public void setCpn_by_dd(String cpn_by_dd) {
		this.cpn_by_dd = cpn_by_dd;
	}

	public String getCpn_end_dd() {
		return cpn_end_dd;
	}

	public void setCpn_end_dd(String cpn_end_dd) {
		this.cpn_end_dd = cpn_end_dd;
	}

	public String getCpn_num() {
		return cpn_num;
	}

	public void setCpn_num(String cpn_num) {
		this.cpn_num = cpn_num;
	}

	public String getSeat_dvs_nm() {
		return seat_dvs_nm;
	}

	public void setSeat_dvs_nm(String seat_dvs_nm) {
		this.seat_dvs_nm = seat_dvs_nm;
	}

	public String getSeat_nm() {
		return seat_nm;
	}

	public void setSeat_nm(String seat_nm) {
		this.seat_nm = seat_nm;
	}

	@Override
	public String toString() {
		return "SellVO [sl_sq=" + sl_sq + ", admn_id=" + admn_id + ", mem_sq=" + mem_sq + ", mem_nm=" + mem_nm
				+ ", sl_prod_sq=" + sl_prod_sq + ", by_sq=" + by_sq + ", sl_dt=" + sl_dt + ", sl_mn=" + sl_mn
				+ ", by_nm=" + by_nm + ", sl_prod_nm=" + sl_prod_nm + ", lc_sq=" + lc_sq + ", seat_dvs_sq="
				+ seat_dvs_sq + ", seat_sq=" + seat_sq + ", mon_mem_addr=" + mon_mem_addr + ", mon_mem_brthday="
				+ mon_mem_brthday + ", lc_nm=" + lc_nm + ", mon_mem_strt_dd=" + mon_mem_strt_dd + ", mon_mem_end_dd="
				+ mon_mem_end_dd + ", mon_num=" + mon_num + ", cpn_by_dd=" + cpn_by_dd + ", cpn_end_dd=" + cpn_end_dd
				+ ", cpn_num=" + cpn_num + ", seat_dvs_nm=" + seat_dvs_nm + ", seat_nm=" + seat_nm + "]";
	}






}
