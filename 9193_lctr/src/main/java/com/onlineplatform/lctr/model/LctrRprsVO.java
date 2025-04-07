package com.onlineplatform.lctr.model;

public class LctrRprsVO {
    private String lctrSeq; // 강좌 SEQ
    private String lctrObjt; // 회차
    private String lctrTtl; // 강좌 제목
    private String instrNm; // 강사명
    private String lctrCn; // 강의 내용 (NULL 허용)
    private String lctrKnd; // 강좌 분류
    private String regYmd; // 등록일
    private String mdfcnYmd; // 수정일
    private String mbrKnd; // 회원 분류
    private String regId; // 세션아이디
    private String mdfcnId; // 수정아이디
    private String emlAddr;
    private String prgrsRt;
    private String vdoUrlAddr;

	public String getLctrSeq() {
		return lctrSeq;
	}
	public void setLctrSeq(String lctrSeq) {
		this.lctrSeq = lctrSeq;
	}
	public String getLctrObjt() {
		return lctrObjt;
	}
	public void setLctrObjt(String lctrObjt) {
		this.lctrObjt = lctrObjt;
	}
	public String getMbrKnd() {
		return mbrKnd;
	}
	public void setMbrKnd(String mbrKnd) {
		this.mbrKnd = mbrKnd;
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

	public String getEmlAddr() {
		return emlAddr;
	}

	public void setEmlAddr(String emlAddr) {
		this.emlAddr = emlAddr;
	}

	public String getPrgrsRt() {
		return prgrsRt;
	}

	public void setPrgrsRt(String prgrsRt) {
		this.prgrsRt = prgrsRt;
	}

	public String getVdoUrlAddr() {
		return vdoUrlAddr;
	}

	public void setVdoUrlAddr(String vdoUrlAddr) {
		this.vdoUrlAddr = vdoUrlAddr;
	}
    
}