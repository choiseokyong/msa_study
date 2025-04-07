package com.onlineplatform.srvy.model;

import java.time.LocalDateTime;

public class SrvyVO {
	private String surveyNo;			// 설문조사 문항번호
    private String instEmlAddr; 	// 설문조사를 등록하는 회원 이메일
    private String lctrSeq;			// 강좌 고유 키
    private String seq;				// 해당 기관의 seq 키
    private String srvyType;		// 설문 조사의 질문 유형
    private String srvyCn;			// 설문 조사의 질문 내용
    private String cHc;				// 객관식의 경우, 들어갈 보기
    private LocalDateTime regDate;	// 등록일
    
    // Getter와 Setter 메서드

    public String getSurveyNo() { 
        return surveyNo;
    }

    public void setSrvyNo(String surveyNo) {
        this.surveyNo = surveyNo;
    }
    
    public String getInstEmlAddr() {
        return instEmlAddr;
    }

    public void setInstEmlAddr(String instEmlAddr) {
        this.instEmlAddr = instEmlAddr;
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

    public String getSrvyType() {
        return srvyType;
    }

    public void setSrvyType(String srvyType) {
        this.srvyType = srvyType;
    }

    public String getSrvyCn() {
        return srvyCn;
    }

    public void setSrvyCn(String srvyCn) {
        this.srvyCn = srvyCn;
    }

    public String getcHc() {
        return cHc;
    }

    public void setcHc(String cHc) {
        this.cHc = cHc;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }
}
