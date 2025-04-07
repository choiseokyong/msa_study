package com.onlineplatform.srvy.model;

import java.time.LocalDateTime;
import java.util.List;

public class SrvyResultVO {
    private String srvyRsltNo;  // 설문조사 고유 키
    private String lctrSeq;      // 해당 기관의 seq 키
    private String seq;          // seq 키
    private String userEmlAddr;  // 설문조사 결과를 등록하는 회원 이메일
    private String chcRslt;      // 설문조사 선택 결과
    private List<String> submittedSrvys; // 설문지 문항 리스트
    private LocalDateTime regDate; // 등록일
    private Integer srvyNo;      // 해당 설문지의 문항 번호 (int → Integer 변경)

    // 추가된 필드 (설문 통계 관련)
    private String srvyCn;  // 설문 질문
    private String chc;      // 선택지 리스트
    private String srvyType; // 문항 타입
    private Integer count;   // 선택된 개수 (int → Integer 변경)
    private Double percentage; // 선택 비율 (%)

    // 기본 생성자
    public SrvyResultVO() {}

    // 모든 필드 포함된 생성자 (선택적 사용)
    public SrvyResultVO(String srvyRsltNo, String lctrSeq, String seq, String userEmlAddr, 
                        String chcRslt, List<String> submittedSrvys, LocalDateTime regDate, 
                        Integer srvyNo, String srvyCn, String chc, String srvyType, 
                        Integer count, Double percentage) {
        this.srvyRsltNo = srvyRsltNo;
        this.lctrSeq = lctrSeq;
        this.seq = seq;
        this.userEmlAddr = userEmlAddr;
        this.chcRslt = chcRslt;
        this.submittedSrvys = submittedSrvys;
        this.regDate = regDate;
        this.srvyNo = srvyNo;
        this.srvyCn = srvyCn;
        this.chc = chc;
        this.srvyType = srvyType;
        this.count = count;
        this.percentage = percentage;
    }

    // Getter & Setter 메서드
    public String getSrvyRsltNo() { return srvyRsltNo; }
    public void setSrvyRsltNo(String srvyRsltNo) { this.srvyRsltNo = srvyRsltNo; }

    public String getLctrSeq() { return lctrSeq; }
    public void setLctrSeq(String lctrSeq) { this.lctrSeq = lctrSeq; }

    public String getSeq() { return seq; }
    public void setSeq(String seq) { this.seq = seq; }

    public String getUserEmlAddr() { return userEmlAddr; }
    public void setUserEmlAddr(String userEmlAddr) { this.userEmlAddr = userEmlAddr; }

    public String getChcRslt() { return chcRslt; }
    public void setChcRslt(String chcRslt) { this.chcRslt = chcRslt; }

    public List<String> getSubmittedSrvys() { return submittedSrvys; }
    public void setSubmittedSrvys(List<String> submittedSrvys) { this.submittedSrvys = submittedSrvys; }

    public LocalDateTime getRegDate() { return regDate; }
    public void setRegDate(LocalDateTime regDate) { this.regDate = regDate; }

    public Integer getSrvyNo() { return srvyNo; }
    public void setSrvyNo(Integer srvyNo) { this.srvyNo = srvyNo; }

    public String getSrvyCn() { return srvyCn; }
    public void setSrvyCn(String srvyCn) { this.srvyCn = srvyCn; }

    public String getChc() { return chc; }
    public void setChc(String chc) { this.chc = chc; }

    public String getSrvyType() { return srvyType; }
    public void setSrvyType(String srvyType) { this.srvyType = srvyType; }

    public Integer getCount() { return count; }
    public void setCount(Integer count) { this.count = count; }

    public Double getPercentage() { return percentage; }
    public void setPercentage(Double percentage) { this.percentage = percentage; }

    // 객체를 문자열로 변환하는 toString() 추가
    @Override
    public String toString() {
        return "SrvyResultVO{" +
                "srvyRsltNo='" + srvyRsltNo + '\'' +
                ", lctrSeq='" + lctrSeq + '\'' +
                ", seq='" + seq + '\'' +
                ", userEmlAddr='" + userEmlAddr + '\'' +
                ", chcRslt='" + chcRslt + '\'' +
                ", submittedSrvys=" + submittedSrvys +
                ", regDate=" + regDate +
                ", srvyNo=" + srvyNo +
                ", srvyCn='" + srvyCn + '\'' +
                ", chc='" + chc + '\'' +
                ", srvyType='" + srvyType + '\'' +
                ", count=" + count +
                ", percentage=" + percentage +
                '}';
    }
}
