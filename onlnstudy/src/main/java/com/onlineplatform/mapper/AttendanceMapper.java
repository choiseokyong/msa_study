package com.onlineplatform.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.onlineplatform.model.AtndRsltRequestDTO;
import com.onlineplatform.model.AtndRsltResponseDTO;
import com.onlineplatform.model.AttendanceVO;
import com.onlineplatform.model.UserAtndRsltResponseDTO;

@Mapper
public interface AttendanceMapper {
	//출석정보 create
	void insertAttendance(AttendanceVO atendanceVO);
	// 일반회원이 일반강의 출석정보를 강의별 조회
	List<AttendanceVO> selectAttendanceByEmailAndSeq(String emlAddr, Integer seq);
	
	// 일반회원이 일반강의 출석정보를 강의별 조회(JOIN)
	List<UserAtndRsltResponseDTO> responseAttendanceByEmailAndSeq(String emlAddr, Integer seq);
	// 일반회원이 기관강의 출석정보를 강의별 조회(JOIN)
	List<UserAtndRsltResponseDTO> responseInstAttendanceByEmailAndSeq(String emlAddr, Integer seq);
	
	// 기관회원이 기관강의 출석정보를 강의별 조회
	List<AtndRsltResponseDTO> selectAttendancesBySeq(Integer seq);
	
	
//	//(페이징) 강좌당 회차 개수 조회
//	int countLctrObjtBySeq(AtndRsltRequestDTO request);
//	//(페이징) 기관회원이 기관강의 출석정보를 강의별 조회
//	List<AtndRsltResponseDTO> selectAttendancesBySeqWithPaging(AtndRsltRequestDTO request);
//	//(페이징) 기관회원이 강의별 학생수 조회
//	int countTotalUsersBySeq(AtndRsltRequestDTO request);
}
