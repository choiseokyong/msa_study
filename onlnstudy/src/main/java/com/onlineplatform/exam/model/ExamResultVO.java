package com.onlineplatform.exam.model;

import java.sql.Timestamp;
import java.util.List;

public class ExamResultVO {
    
    private int testRsltNo; // TEST_RSLT_NO
    private int lctrSeq;     // LCTR_SEQ
    private String instEmlAddr; // INST_EML_ADDR
    private String emlAddr;     // EML_ADDR
    private int seq;        // SEQ
    private int testNo;     // TEST_NO
    private String ansCn;    // ANS_CN
    private String yn;       // YN
    private Timestamp ansDocSbmsnVmd; // ANSDOC_SBMSN_VMD
    private Timestamp ansdocSbmsnYmd; // ANSDOC_SBMSN_YMD
    private List<String> answers; // 사용자가 제출한 답안 목록
    private int score; // 점수
    
    // MBR 테이블에서 조인( 기존 TEST_RSLT 테이블에는 해당 이름을 저장하지 않음 )
    private String user; // USER 칼럼
    
    //페이징에 필요
    private Integer pageSize;
    private Integer offset;
    
    
    // Getter 및 Setter
    public int getTestRsltNo() {
        return testRsltNo;
    }

    public void setTestRsltNo(int testRsltNo) {
        this.testRsltNo = testRsltNo;
    }

    public int getLctrSeq() {
        return lctrSeq;
    }

    public void setLctrSeq(int lctrSeq) {
        this.lctrSeq = lctrSeq;
    }

    public String getInstEmlAddr() {
        return instEmlAddr;
    }

    public void setInstEmlAddr(String instEmlAddr) {
        this.instEmlAddr = instEmlAddr;
    }

    public String getEmlAddr() {
        return emlAddr;
    }

    public void setEmlAddr(String emlAddr) {
        this.emlAddr = emlAddr;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getTestNo() {
        return testNo;
    }

    public void setTestNo(int testNo) {
        this.testNo = testNo;
    }

    public String getAnsCn() {
        return ansCn;
    }

    public void setAnsCn(String ansCn) {
        this.ansCn = ansCn;
    }

    public String getYn() {
        return yn;
    }

    public void setYn(String yn) {
        this.yn = yn;
    }

    public Timestamp getAnsDocSbmsnVmd() {
        return ansDocSbmsnVmd;
    }

    public void setAnsDocSbmsnVmd(Timestamp ansDocSbmsnVmd) {
        this.ansDocSbmsnVmd = ansDocSbmsnVmd;
    }

    public Timestamp getAnsdocSbmsnYmd() { // 추가된 getter
        return ansdocSbmsnYmd;
    }

    public void setAnsdocSbmsnYmd(Timestamp ansdocSbmsnYmd) { // 추가된 setter
        this.ansdocSbmsnYmd = ansdocSbmsnYmd;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
	public String getUser() {
		return user;
	}
		
	public void setUser(String user) {
		this.user = user;
	}
	
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

}
