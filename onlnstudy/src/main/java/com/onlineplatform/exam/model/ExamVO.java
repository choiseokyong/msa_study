package com.onlineplatform.exam.model;

import java.util.Date;

public class ExamVO {
    private int lctrSeq; // 강좌 번호
    private int seq; // 기관 강좌 번호
    private String instEmlAddr; // 기관 이메일
    private String qitemType; // 시험문항 타입
    private String qitemCn; // 시험문제
    private String cHc; // 보기
    private String crAns; // 정답
    private Date regDate; // 등록 날짜
    private String filePath; // 파일 경로 추가
    
    // Getter and Setter methods
    public int getLctrSeq() {
        return lctrSeq;
    }

    public void setLctrSeq(int lctrSeq) {
        this.lctrSeq = lctrSeq;
    }
    
    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getInstEmlAddr() {
        return instEmlAddr;
    }

    public void setInstEmlAddr(String instEmlAddr) {
        this.instEmlAddr = instEmlAddr;
    }

    public String getQitemType() {
        return qitemType;
    }

    public void setQitemType(String qitemType) {
        this.qitemType = qitemType;
    }

    public String getQitemCn() {
        return qitemCn;
    }

    public void setQitemCn(String qitemCn) {
        this.qitemCn = qitemCn;
    }

    public String getCHc() {
        return cHc;
    }

    public void setCHc(String cHc) {
        this.cHc = cHc;
    }

    public String getCrAns() {
        return crAns;
    }

    public void setCrAns(String crAns) {
        this.crAns = crAns;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
    
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
