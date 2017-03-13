package org.kangnam.domain;

public class OnedayVO {
	
	private int mem_sq;              //회원번호
	private String mem_nm;           //회원이름
	private String mem_pthon;        //전화번호
	private String mem_jn_dd;        //가입일
	private String admn_id;          //관리자 계정
	private int sl_prod_sq;      //판매물품번호
    private String sl_prod_nm;   //판매물품명
    
   
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
		return "OnedayVO [mem_sq=" + mem_sq + ", mem_nm=" + mem_nm + ", mem_pthon=" + mem_pthon + ", mem_jn_dd="
				+ mem_jn_dd + ", admn_id=" + admn_id + ", sl_prod_sq=" + sl_prod_sq + ", sl_prod_nm=" + sl_prod_nm
				+ "]";
	}
	
	

}
