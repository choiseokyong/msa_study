package com.onlineplatform.lctr.model;


public class InstMbrVO {
    private String instEmlAddr; // 기관 이메일
    private String user; // 사용자
    private String pswd; // 비밀번호
    private String telno; // 전화번호
    private String brthYmd; // 생년월일
    private String mbrNo; // 회원 구분
    private String instNm; // 기관명
    private String ctrtrTelno; // 담당자 번호
    private String addr; // 주소
    private String joinYmd; // 가입일
    private String mdfcnYmd; // 수정일
    private String instKnd; // 기관 분류
    private String regId; // 세션아이디
    private String mdfcnId; // 수정아이디
    
	public String getInstEmlAddr() {
		return instEmlAddr;
	}
	public void setInstEmlAddr(String instEmlAddr) {
		this.instEmlAddr = instEmlAddr;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	
	
	public String getInstNm() {
		return instNm;
	}
	public void setInstNm(String instNm) {
		this.instNm = instNm;
	}
	public String getCtrtrTelno() {
		return ctrtrTelno;
	}
	public void setCtrtrTelno(String ctrtrTelno) {
		this.ctrtrTelno = ctrtrTelno;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getBrthYmd() {
		return brthYmd;
	}
	public void setBrthYmd(String brthYmd) {
		this.brthYmd = brthYmd;
	}
	public String getMbrNo() {
		return mbrNo;
	}
	public void setMbrNo(String mbrNo) {
		this.mbrNo = mbrNo;
	}
	public String getJoinYmd() {
		return joinYmd;
	}
	public void setJoinYmd(String joinYmd) {
		this.joinYmd = joinYmd;
	}
	public String getMdfcnYmd() {
		return mdfcnYmd;
	}
	public void setMdfcnYmd(String mdfcnYmd) {
		this.mdfcnYmd = mdfcnYmd;
	}
	public String getInstKnd() {
		return instKnd;
	}
	public void setInstKnd(String instKnd) {
		this.instKnd = instKnd;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public String getMdfcnId() {
		return mdfcnId;
	}
	public void setMdfcnId(String mdfcnId) {
		this.mdfcnId = mdfcnId;
	}
    
}