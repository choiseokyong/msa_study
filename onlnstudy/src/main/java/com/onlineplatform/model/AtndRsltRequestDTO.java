package com.onlineplatform.model;

public class AtndRsltRequestDTO {
	private Integer seq;
//    private int page; // 현재 페이지
//    private int usersPerPage; // 한 페이지에 출력할 학생 수
//    private int countLctrObjt; // 강좌의 회차 개수
    
    // 기본 생성자 (Spring에서 객체 변환 시 필요)
    public AtndRsltRequestDTO() {}

    public Integer getSeq() { return seq; }
    public void setSeq(Integer seq) { this.seq = seq; }

//    public int getPage() {return page;}
//    public void setPage(int page) {this.page = page;}
//
//    public int getUsersPerPage() {return usersPerPage;}
//    public void setUsersPerPage(int usersPerPage) {this.usersPerPage = usersPerPage;}
//
//    public int getCountLctrObjt() { return countLctrObjt; } // 게터
//    public void setCountLctrObjt(int countLctrObjt) { this.countLctrObjt = countLctrObjt; }
}
