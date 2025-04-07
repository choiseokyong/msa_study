package com.onlineplatform.exam.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.onlineplatform.exam.model.ExamVO;


@Mapper
public interface ExamMapper {
	//TestVO selectBylctrNoAnduserEmail(Integer lctrNo, String userEmail);	
	ArrayList<ExamVO> selectBylctrNoAnduserEmail(Integer lctrSeq, Integer seq, String instEmlAddr); // 일반회원이 시험을 보기위해 데이터 불러오기
	void insertTest(ExamVO exam);													// 시험지 엑셀 업로드
	void deleteTestByLctrSeqAndInst(Integer lctrSeq, Integer seq, String instEmlAddr);				// 시험지 엑셀 업로드 된 것을 삭제
	void updateUser(String id, String name);
}
