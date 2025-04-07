package com.onlineplatform.exam.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineplatform.exam.model.ExamResultVO;
import com.onlineplatform.exam.service.ExamResultService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ExamResultController {
	
	@Autowired
	public ExamResultService resultService;
	
	// 기관이 본인의 특정 강좌에 시험을 본 학생들의 결과를 보는 페이지
	@RequestMapping(value="/api/InstTestRsltList", method={RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public List<ExamResultVO> answerList(
			@RequestParam Integer lctrSeq, 
			@RequestParam Integer seq, 
			@RequestParam String instEmlAddr, ExamResultVO ervo) {
		
		
		// 해당 정보로 해당 시험을 본 학생들의 리스트를 들고 옴
		List<ExamResultVO> answerList = resultService.getTestResultsByLctrSeqAndSeqAndInst(lctrSeq, seq, instEmlAddr);	
		
		return answerList;
	}
	
	
	@RequestMapping(value="/api/SubmitTest", method={RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public ResponseEntity<Void> insertResult(
	        @RequestParam Integer lctrSeq, 
	        @RequestParam Integer seq, 
	        @RequestParam String instEmlAddr, 
	        @RequestParam String emlAddr,
	        @RequestParam List<String> submittedAnswers,
	        ExamResultVO ervo) {

	    // 시험 결과 채점
	    ExamResultVO result = resultService.evaluateTest(lctrSeq, seq, instEmlAddr, emlAddr, submittedAnswers);

	    // 제출된 답안을 하나의 문자열로 변환하여 ansCn에 설정
	    String ansCn = String.join(",", submittedAnswers);
	    result.setAnsCn(ansCn); // ansCn에 설정
	    
	    // 3. 시험 결과 저장
	    resultService.addTestResult(lctrSeq, seq, instEmlAddr, emlAddr, ansCn, result);

	    // 리다이렉트 URL
	    String redirectUrl = String.format("/api/list?lctrSeq=%d&seq=%d&instEmlAddr=%s", lctrSeq, seq, instEmlAddr);
	    
	    // 리다이렉트 응답 반환
	    return ResponseEntity.status(HttpStatus.FOUND)
	                         .location(URI.create(redirectUrl))
	                         .build();
	}

}