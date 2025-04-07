package com.onlineplatform.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplatform.mapper.AttendanceMapper;
import com.onlineplatform.model.AtndRsltRequestDTO;
import com.onlineplatform.model.AtndRsltResponseDTO;
import com.onlineplatform.model.AttendanceVO;
import com.onlineplatform.model.UserAtndRsltRequestDTO;
import com.onlineplatform.model.UserAtndRsltResponseDTO;

@Service
public class AttendanceService {
	
	@Autowired
	private AttendanceMapper am;
	
	//출석 정보 등록
	public void createAttendance(AttendanceVO atendanceVO) {
	System.out.println("Service 들어옴");
	atendanceVO.setAtndYmd(LocalDateTime.now());
	am.insertAttendance(atendanceVO);
	System.out.println("mapper 수행");
	}
	
	//출석 정보 학생이 조회
	public List<AttendanceVO> selectUserAttendance(String emlAddr, Integer seq) {
		System.out.println("조회 Service 들어옴");
		return am.selectAttendanceByEmailAndSeq(emlAddr, seq);
	}
	
	public List<UserAtndRsltResponseDTO> selectUserAtndRslt(UserAtndRsltRequestDTO request){
		System.out.println("새로운 조회 Service 들어옴");
		if(request.getInstEmlAddr() == null){
			return am.responseAttendanceByEmailAndSeq(request.getEmlAddr(),request.getSeq());
		}else {
			return am.responseInstAttendanceByEmailAndSeq(request.getEmlAddr(),request.getSeq());
		}
	}
	
	//출석 정보 기관이 조회
	public List<AtndRsltResponseDTO> selectAttendance(Integer seq){
		System.out.println("기관 출결 조회 Service 들어옴");
		return am.selectAttendancesBySeq(seq);
	}
	
}
