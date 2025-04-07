package com.onlineplatform.model;

import java.time.LocalDateTime;

public class AttendanceVO {
    private int atndNo; // 출결 고유번호
    private Integer seq; // 일반 강의 SEQ (nullable이므로 Integer 사용)
    private String instEmlAddr; // 기관 이메일 (nullable)
    private int lctrSeq; // 강좌 고유번호
    private int lctrObjt; // 회차 고유번호
    private String emlAddr; // 일반 이메일
    private LocalDateTime atndYmd; // 출결 날짜
    private String cntnIp; // 수강 회원의 IP
    
    // 기본 생성자
    public AttendanceVO() {}

    // 모든 필드를 포함하는 생성자
    public AttendanceVO(int atndNo, Integer seq, String instEmlAddr, int lctrSeq, int lctrObjt, String emlAddr, LocalDateTime atndYmd, String cntnIp) {
        this.atndNo = atndNo;
        this.seq = seq;
        this.instEmlAddr = instEmlAddr;
        this.lctrSeq = lctrSeq;
        this.lctrObjt = lctrObjt;
        this.emlAddr = emlAddr;
        this.atndYmd = atndYmd;
        this.cntnIp = cntnIp;
    }

    // Getter 및 Setter 메서드
    public int getAtndNo() { return atndNo; }
    public void setAtndNo(int atndNo) { this.atndNo = atndNo; }

    public Integer getSeq() { return seq; }
    public void setSeq(Integer seq) { this.seq = seq; }

    public String getInstEmlAddr() { return instEmlAddr; }
    public void setInstEmlAddr(String instEmlAddr) { this.instEmlAddr = instEmlAddr; }

    public int getLctrSeq() { return lctrSeq; }
    public void setLctrSeq(int lctrSeq) { this.lctrSeq = lctrSeq; }

    public int getLctrObjt() { return lctrObjt; }
    public void setLctrObjt(int lctrObjt) { this.lctrObjt = lctrObjt; }

    public String getEmlAddr() { return emlAddr; }
    public void setEmlAddr(String emlAddr) { this.emlAddr = emlAddr; }

    public LocalDateTime getAtndYmd() { return atndYmd; }
    public void setAtndYmd(LocalDateTime atndYmd) { this.atndYmd = atndYmd; }

    public String getCntnIp() { return cntnIp; }
    public void setCntnIp(String cntnIp) { this.cntnIp = cntnIp; }

    // toString() 메서드 (디버깅 용도)
    @Override
    public String toString() {
        return "AttendanceVO{" +
                "atndNo=" + atndNo +
                ", seq=" + seq +
                ", instEmlAddr='" + instEmlAddr + '\'' +
                ", lctrSeq=" + lctrSeq +
                ", lctrObjt=" + lctrObjt +
                ", emlAddr='" + emlAddr + '\'' +
                ", atndYmd=" + atndYmd +
                ", cntnIp='" + cntnIp + '\'' +
                '}';
    }
}
