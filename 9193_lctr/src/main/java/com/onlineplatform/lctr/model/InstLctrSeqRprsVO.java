package com.onlineplatform.lctr.model;


public class InstLctrSeqRprsVO {
    private String lctrSeq; // 강좌 SEQ
    private String instEmlAddr; // 기관 이메일
    private String seq; // SEQ
    private String lctrObjt; // 회차
    private String vdoUrlAddr; // 동영상 링크
    private String testUrlAddr; // 퀴즈 링크
    private String testCransUrlAddr; // 정답 링크
    private String scr; // 점수
    private String regYmd; // 등록일
    private String mdfcnYmd; // 수정일
    private String regId; // 세션아이디
    private String mdfcnId; // 수정아이디
    private String prgrsRt; //강의률
    
    private String lctrTtl; // 강좌 제목
    private String instrNm; // 강사명
    private String lctrCn; // 강의 내용 (NULL 허용)
    private String lctrKnd; // 강좌 분류
    private String MbrKnd; // 회원 분류
    
    private String emlAddr;       // 일반 이메일
    private String user;          // 사용자
    private String pswd;          // 비밀번호
    private String telno;         // 전화번호
    private String brthYmd;         // 생년월일
    private String mbrNo;            // 회원 구분 번호
    private String addr;          // 주소
    private String joinYmd;         // 가입일
    private String mdfcnYmdDate;    // 수정일
    
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
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getInstEmlAddr() {
		return instEmlAddr;
	}
	public void setInstEmlAddr(String instEmlAddr) {
		this.instEmlAddr = instEmlAddr;
	}
	
	public String getVdoUrlAddr() {
		return vdoUrlAddr;
	}
	public void setVdoUrlAddr(String vdoUrlAddr) {
		this.vdoUrlAddr = vdoUrlAddr;
	}
	public String getTestUrlAddr() {
		return testUrlAddr;
	}
	public void setTestUrlAddr(String testUrlAddr) {
		this.testUrlAddr = testUrlAddr;
	}
	public String getTestCransUrlAddr() {
		return testCransUrlAddr;
	}
	public void setTestCransUrlAddr(String testCransUrlAddr) {
		this.testCransUrlAddr = testCransUrlAddr;
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
	public String getLctrTtl() {
		return lctrTtl;
	}
	public void setLctrTtl(String lctrTtl) {
		this.lctrTtl = lctrTtl;
	}
	public String getInstrNm() {
		return instrNm;
	}
	public void setInstrNm(String instrNm) {
		this.instrNm = instrNm;
	}
	public String getLctrCn() {
		return lctrCn;
	}
	public void setLctrCn(String lctrCn) {
		this.lctrCn = lctrCn;
	}
	public String getLctrKnd() {
		return lctrKnd;
	}
	public void setLctrKnd(String lctrKnd) {
		this.lctrKnd = lctrKnd;
	}
	public String getLctrSeq() {
		return lctrSeq;
	}
	public void setLctrSeq(String lctrSeq) {
		this.lctrSeq = lctrSeq;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getLctrObjt() {
		return lctrObjt;
	}
	public void setLctrObjt(String lctrObjt) {
		this.lctrObjt = lctrObjt;
	}
	public String getScr() {
		return scr;
	}
	public void setScr(String scr) {
		this.scr = scr;
	}
	public String getRegYmd() {
		return regYmd;
	}
	public void setRegYmd(String regYmd) {
		this.regYmd = regYmd;
	}
	public String getMdfcnYmd() {
		return mdfcnYmd;
	}
	public void setMdfcnYmd(String mdfcnYmd) {
		this.mdfcnYmd = mdfcnYmd;
	}
	public String getMbrKnd() {
		return MbrKnd;
	}
	public void setMbrKnd(String mbrKnd) {
		MbrKnd = mbrKnd;
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
	public String getPrgrsRt() {
		return prgrsRt;
	}
	public void setPrgrsRt(String prgrsRt) {
		this.prgrsRt = prgrsRt;
	}
	
	
}