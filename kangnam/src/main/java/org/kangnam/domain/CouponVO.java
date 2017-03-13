package org.kangnam.domain;

public class CouponVO {


	private int cpn_sq;  //쿠폰번호
	private String mem_sq;   //회원번호
	private String mem_nm;   //회원이름
	private String cpn_by_dd;//쿠폰구매일
	private String cpn_end_dd;//쿠폰종료일
	private String cpn_num;  //쿠폰갯수

	private int sl_prod_sq;      //판매물품번호
	private String sl_prod_nm;   //판매물품명

	public int getCpn_sq() {
		return cpn_sq;
	}
	public void setCpn_sq(int cpn_sq) {
		this.cpn_sq = cpn_sq;
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
	@Override
	public String toString() {
		return "CouponVO [cpn_sq=" + cpn_sq + ", mem_sq=" + mem_sq + ", mem_nm=" + mem_nm + ", cpn_by_dd=" + cpn_by_dd
				+ ", cpn_end_dd=" + cpn_end_dd + ", cpn_num=" + cpn_num + ", sl_prod_sq=" + sl_prod_sq + ", sl_prod_nm="
				+ sl_prod_nm + "]";
	}






}