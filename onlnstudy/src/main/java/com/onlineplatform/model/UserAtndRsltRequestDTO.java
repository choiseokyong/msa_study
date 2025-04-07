package com.onlineplatform.model;
//@RequesBody는 하나의 객체만 받을 수 있는데,
	//Integer seq와 String emlAddr을 개별적으로 받으려고 하면 오류가 생길 수 있음.
	//@RequestBody가 아니라 @RequestParam
	//또는 @RequestBody를 활용한 DTO 객체를 사용하는 것이 적절함.
	
	//React에서 POST 요청을 보낼 때 seq, emlAddr를 body에 JSON으로 담아 전송하는 경우,
	//fetch 경로에 /${seq}/${emlAddr}처럼 변수를 포함할 필요가 없음.
	//따라서, @RequestBody 애너테이션을 사용하는 게 적절.

	//seq, emlAddr을 받기 위한 DTO 클래스 추가
public class UserAtndRsltRequestDTO {
	private Integer seq;
    private String emlAddr;
    private String instEmlAddr;
    
    // 기본 생성자 (Spring에서 객체 변환 시 필요)
    public UserAtndRsltRequestDTO() {}

    // Getter & Setter
    public Integer getSeq() { return seq; }
    public void setSeq(Integer seq) { this.seq = seq; }

    public String getEmlAddr() { return emlAddr; }
    public void setEmlAddr(String emlAddr) { this.emlAddr = emlAddr; }
    
    public String getInstEmlAddr() { return instEmlAddr; }
    public void setInstEmlAddr(String instEmlAddr) { this.instEmlAddr = instEmlAddr; }
}
