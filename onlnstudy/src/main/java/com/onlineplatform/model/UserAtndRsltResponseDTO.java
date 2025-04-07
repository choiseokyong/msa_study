package com.onlineplatform.model;

import java.time.LocalDateTime;

public class UserAtndRsltResponseDTO {
	//response에 담을 정보를 멤버변수로 만듦
	String lctrTtl;
	String user;
	int lctrObjt;
	LocalDateTime atndYmd;
	
    // Getter 및 Setter 메서드

    public String getLctrTtl() {
        return lctrTtl;
    }

    public void setLctrTtl(String lctrTtl) {
        this.lctrTtl = lctrTtl;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getLctrObjt() {
        return lctrObjt;
    }

    public void setLctrObjt(int lctrObjt) {
        this.lctrObjt = lctrObjt;
    }

    public LocalDateTime getAtndYmd() {
        return atndYmd;
    }

    public void setAtndYmd(LocalDateTime atndYmd) {
        this.atndYmd = atndYmd;
    }
}
