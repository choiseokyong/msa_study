package com.onlineplatform.model;

import java.time.LocalDateTime;

public class AtndRsltResponseDTO {
	private String lctrTtl;//강좌이름
	private String emlAddr;
	private String user;//학생이름
	private String instNm;//기관이름
	private int lctrObjt;//회차
	private LocalDateTime atndYmd;//출결날짜
	
//	//페이징 처리용 멤버변수
//	private int page; //현재 페이지
//	private int usersPerPage; //페이지당 학생 수
//	private int totalUsers; //총 학생 수
//	private int totalPages; //총 페이지 수
//	
//	public int getPage() {return page;}
//	public void setPage(int page) {this.page=page;}
//	
//	public int getUsersPerPage() {return usersPerPage;}
//	public void setUsersPerPage(int usersPerPage) {this.usersPerPage=usersPerPage;}
//	
//	public int getTotalUsers() {return totalUsers;}
//	public void setTotalUsers(int totalUsers) {this.totalUsers=totalUsers;}
//	
//	public int getTotalPages() {return totalPages;}
//	private void setTotalPages(int totalPages) {this.totalPages=totalPages;}
	
    // Getter 및 Setter 메서드
    public String getLctrTtl() {return lctrTtl;}
    public void setLctrTtl(String lctrTtl) {this.lctrTtl = lctrTtl;}
    
    public String getEmlAddr() { return emlAddr; } 
    public void setEmlAddr(String emlAddr) { this.emlAddr = emlAddr; }
    
    public String getUser() {return user;}
    public void setUser(String user) {this.user = user;}
    
    public String getInstNm() {return instNm;}
    public void setInstNm(String instNm) {this.instNm = instNm;}

    public int getLctrObjt() {return lctrObjt;}
    public void setLctrObjt(int lctrObjt) {this.lctrObjt = lctrObjt;}

    public LocalDateTime getAtndYmd() {return atndYmd;}
    public void setAtndYmd(LocalDateTime atndYmd) {this.atndYmd = atndYmd;}
}
