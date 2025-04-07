package com.onlineplatform.exam.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.onlineplatform.exam.model.ExamResultVO;
import com.onlineplatform.exam.model.ExamVO;

@Mapper
public interface ExamResultMapper {
	// 채점을 하기 위해서 답 가져오기
	ArrayList<ExamVO> getCorrectAnswers(Integer lctrSeq, Integer seq, String instEmlAddr);
	
    // 시험 결과 정보 삽입
    void insertTestResult(Integer lctrSeq, Integer seq, String instEmlAddr, String emlAddr, String ansCn, String yn, Integer score, ExamResultVO examResult);

    // 특정 시험 결과 조회
    ExamResultVO selectTestResultById(Integer testRslNo, String emlAddr);
    
    // 일반회원이 시험을 봤는지 안봤는지 체크
    String getChkExam(Integer lctrSeq, Integer seq, String emlAddr);
    
    // 특정 이메일로 시험 결과 조회
    List<ExamResultVO> selectTestResultsByEmail(String emlAddr);
    
    // 강좌 마스터 seq, 기관 seq,  기관 이메일로 시험 결과 조회
    List<ExamResultVO> InstTestRsltList(Integer lctrSeq, Integer seq, String instEmlAddr);
    
    // 시험 결과 전체 조회
    List<ExamResultVO> selectAllTestResults();
}
