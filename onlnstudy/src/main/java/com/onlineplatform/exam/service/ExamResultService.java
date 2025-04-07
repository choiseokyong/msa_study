package com.onlineplatform.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplatform.exam.mapper.ExamResultMapper;
import com.onlineplatform.exam.model.ExamResultVO;
import com.onlineplatform.exam.model.ExamVO;


@Service
public class ExamResultService {
    @Autowired
	private ExamResultMapper examResultMapper;

    public ExamResultVO evaluateTest(Integer lctrSeq, Integer seq, String instEmlAddr, String emlAddr, List<String> submittedAnswers) {
        
    	// TEST 테이블에서 정답을 가져옴.
        List<ExamVO> correctAnswers = examResultMapper.getCorrectAnswers(lctrSeq, seq, instEmlAddr);

        // 채점
        int score = 0;
        boolean pass = true;
        float percentage = 0;
        
        // 정답과 제출된 답안을 비교
        for (int i = 0; i < correctAnswers.size(); i++) {
            if (i < submittedAnswers.size() && submittedAnswers.get(i).equals(correctAnswers.get(i).getCrAns())) {
            	score++;
            }
        }
        System.out.println("score : " + score);
        System.out.println("total : " + correctAnswers.size());
        percentage = ((float) score / correctAnswers.size()) * 100; // 수정된 부분
        System.out.println("점수 : " + percentage);
        
        // 이수 여부 설정 ( 일단 강제로 7점으로 설정 )
        if (score < 7) {
            pass = false;
        }

        // 시험 결과 객체 생성 및 반환
        ExamResultVO result = new ExamResultVO();
        result.setScore(score);
        result.setYn(pass ? "Y" : "N");
        
        System.out.println(result.getYn());
        return result;
    }
    
    
 // 시험 결과 정보 삽입
    public void addTestResult(
            Integer lctrSeq, Integer seq, 
            String instEmlAddr, String emlAddr, 
            String ansCn, ExamResultVO examResult) {

        // 시험 결과가 이미 존재하는지 확인
        String chkResult = ChkExam(lctrSeq, seq, emlAddr);
        if (chkResult != null) {
            throw new IllegalArgumentException("시험 결과가 이미 존재합니다: " + chkResult);
        }

        // 결과가 없으면 시험 결과를 삽입
        examResultMapper.insertTestResult(
                lctrSeq, seq, 
                instEmlAddr, emlAddr, 
                ansCn, examResult.getYn(), examResult.getScore(), examResult);
    }

    // 특정 시험 결과 조회
    public String ChkExam(Integer lctrSeq, Integer seq, String emlAddr) {
        // 결과가 존재하는지 확인하는 로직을 추가
        String chkResult = examResultMapper.getChkExam(lctrSeq, seq, emlAddr);
        return chkResult;
    }

    // 특정 이메일로 시험 결과 조회
    public List<ExamResultVO> getTestResultsByEmail(String emlAddr) {
        return examResultMapper.selectTestResultsByEmail(emlAddr);
    }

    // 강좌 마스터 seq, 기관 seq,  기관 이메일로 시험 결과 조회
    public List<ExamResultVO> getTestResultsByLctrSeqAndSeqAndInst(Integer lctrSeq, Integer seq, String instEmlAddr) {
        return examResultMapper.InstTestRsltList(lctrSeq, seq, instEmlAddr);
    }

    // 시험 결과 전체 조회
    public List<ExamResultVO> getAllTestResults() {
        return examResultMapper.selectAllTestResults();
    }
	
}
