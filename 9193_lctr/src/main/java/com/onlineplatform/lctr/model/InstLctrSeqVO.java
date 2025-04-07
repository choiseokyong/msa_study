package com.onlineplatform.lctr.model;


public class InstLctrSeqVO {
    private String emlAddr; // 일반 이메일
    private String lctrSeq; // 강좌 SEQ
    private String instEmlAddr; // 기관 이메일
    private String seq; // SEQ
    private String lctrObjt; // 회차
    private String prgrsRt; // 진도율 (null 허용)
    private String regYmd; // 등록일
    private String mdfcnYmd; // 수정일
    private String regId; // 세션아이디
    private String mdfcnId; // 수정아이디
    
	public String getEmlAddr() {
		return emlAddr;
	}
	public void setEmlAddr(String emlAddr) {
		this.emlAddr = emlAddr;
	}
	
	public String getInstEmlAddr() {
		return instEmlAddr;
	}
	public void setInstEmlAddr(String instEmlAddr) {
		this.instEmlAddr = instEmlAddr;
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
	public String getPrgrsRt() {
		return prgrsRt;
	}
	public void setPrgrsRt(String prgrsRt) {
		this.prgrsRt = prgrsRt;
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
    
}