package com.onlineplatform.lctr.model;

public class MbrVO {
    private String emlAddr;       // 일반 이메일
    private String user;          // 사용자
    private String pswd;          // 비밀번호
    private String telno;         // 전화번호
    private String brthYmd;         // 생년월일
    private String mbrNo;            // 회원 구분 번호
    private String addr;          // 주소
    private String joinYmd;         // 가입일
    private String mdfcnYmdDate;    // 수정일
    private String regId;         // 세션아이디
    private String mdfcnId;       // 수정아이디

    

    public String getEmlAddr() {
		return emlAddr;
	}



	public void setEmlAddr(String emlAddr) {
		this.emlAddr = emlAddr;
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



	public String getMdfcnYmdDate() {
		return mdfcnYmdDate;
	}



	public void setMdfcnYmdDate(String mdfcnYmdDate) {
		this.mdfcnYmdDate = mdfcnYmdDate;
	}



	public String getAddr() {
		return addr;
	}



	public void setAddr(String addr) {
		this.addr = addr;
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


	// toString Method for easy representation
    @Override
    public String toString() {
        return "MbrVO{" +
                "emlAddr='" + emlAddr + '\'' +
                ", user='" + user + '\'' +
                ", pswd='" + pswd + '\'' +
                ", telno='" + telno + '\'' +
                ", brthYmd=" + brthYmd +
                ", mbrNo=" + mbrNo +
                ", addr='" + addr + '\'' +
                ", joinYmd=" + joinYmd +
                ", mdfcnYmd=" + mdfcnYmdDate +
                ", regId='" + regId + '\'' +
                ", mdfcnId='" + mdfcnId + '\'' +
                '}';
    }

}