package com.onlineplatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineplatform.model.AtndRsltRequestDTO;
import com.onlineplatform.model.AtndRsltResponseDTO;
import com.onlineplatform.model.AttendanceVO;
import com.onlineplatform.model.UserAtndRsltRequestDTO;
import com.onlineplatform.model.UserAtndRsltResponseDTO;
import com.onlineplatform.service.AttendanceService;

import jakarta.servlet.http.HttpServletRequest;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class AttendanceController {

	@Autowired
	private AttendanceService as;
	
	//출결 등록
	@RequestMapping("/atnd/api/create")
	public void createAtnd(
			//로그인 세션이 없어서 막아두었다.
//			HttpSession httpSession, 
			HttpServletRequest request,
			@RequestBody AttendanceVO atendanceVO
			) {
		System.out.println("controller 들어옴");
		
		//로그인 세션이 없어서 막아두었다.
//	    String emlAddr = httpSession.getAttribute("emlAddr")+""; //수강회원의 이메일
		//임의의 학생 이메일(로그인 세션에서 받기 대신)
	    String emlAddr = "user2@example.com";
	    
	    String cntnIp = request.getRemoteAddr(); // 수강 회원의 IP
	    atendanceVO.setEmlAddr(emlAddr);
	    atendanceVO.setCntnIp(cntnIp);
	    
		as.createAttendance(atendanceVO);
		System.out.println("Service 수행");
	}
	
	//학생이 출결 정보 조회
	@RequestMapping(value="/api/userAtndRsltList", method=RequestMethod.POST)
	@ResponseBody
	public List<UserAtndRsltResponseDTO> userAtndRsltList(@RequestBody UserAtndRsltRequestDTO request) {
		System.out.println("Controller: 학생이 강의 출결 조회");
		return as.selectUserAtndRslt(request);
	}

	//기관이 출결 정보 조회
	@RequestMapping(value="/api/atndRsltList", method=RequestMethod.POST)
	@ResponseBody
	public List<AtndRsltResponseDTO> atndRsltList(@RequestBody AtndRsltRequestDTO request){
		System.out.println("기관이 출결 정보 조회 Controller");
		Integer seq = request.getSeq();
		return as.selectAttendance(seq);
	}
}
