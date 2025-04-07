package com.onlineplatform.common.model;

import java.time.LocalDateTime;

public class MbrVO {
	private String emlAddr;
	private String user;
	private String pswd;
	private String telNo;
	private LocalDateTime brthYmd;
	private int mbrNo;
	private String addr;
	private LocalDateTime joinYmd;
	private LocalDateTime mdfcnYmd;
	private String regId;
	private String mdfcnId;
	
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
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public LocalDateTime getBrthYmd() {
		return brthYmd;
	}
	public void setBrthYmd(LocalDateTime brthYmd) {
		this.brthYmd = brthYmd;
	}
	public int getMbrNo() {
		return mbrNo;
	}
	public void setMbrNo(int mbrNo) {
		this.mbrNo = mbrNo;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public LocalDateTime getJoinYmd() {
		return joinYmd;
	}
	public void setJoinYmd(LocalDateTime joinYmd) {
		this.joinYmd = joinYmd;
	}
	public LocalDateTime getMdfcnYmd() {
		return mdfcnYmd;
	}
	public void setMdfcnYmd(LocalDateTime mdfcnYmd) {
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
	
	
}
