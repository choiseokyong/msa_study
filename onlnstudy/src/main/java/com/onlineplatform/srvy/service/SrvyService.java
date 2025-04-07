package com.onlineplatform.srvy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplatform.srvy.mapper.SrvyMapper;
import com.onlineplatform.srvy.mapper.SrvyResultMapper;
import com.onlineplatform.srvy.model.SrvyResultVO;
import com.onlineplatform.srvy.model.SrvyVO;

@Service
public class SrvyService {
	@Autowired
	SrvyMapper srvymapper;
	
	@Autowired
	SrvyResultMapper srvyRsltMapper;
	
	// 설문조사 DB에 넣는 곳
	public void insertSrvy(SrvyVO srvyVo) {
		srvymapper.insertSurvey(srvyVo);
	}
	
	// 설문조사 삭제
	public void deleteSrvy(String lctrSeq, String seq, String instEmlAddr) {
		srvymapper.deleteSrvy(lctrSeq, seq, instEmlAddr);
	}
	
	// 기관회원이 설문조사 update하기
	public void updateSrvy(SrvyVO srvyVo) {
		srvymapper.insertSurvey(srvyVo);
	}
	
	// 기관회원이 설문조사에 응한 회원들의 설문조사 결과를 통꼐회 하는 곳
	public List<SrvyResultVO> getSurveyResults(Map<String, Object> paramMap) {
	    List<Map<String, Object>> results = srvyRsltMapper.selectSurveyResults(paramMap);

	    List<SrvyResultVO> surveyResults = new ArrayList<>();
	    for (Map<String, Object> map : results) {
	        SrvyResultVO vo = new SrvyResultVO();
	        vo.setSrvyNo(map.get("SURVEY_NO") != null ? ((Number) map.get("SURVEY_NO")).intValue() : null);
	        vo.setLctrSeq(map.get("LCTR_SEQ") != null ? map.get("LCTR_SEQ").toString() : null);
	        vo.setSeq(map.get("SEQ") != null ? map.get("SEQ").toString() : null);
	        vo.setSrvyType(map.get("SRVY_TYPE") != null ? map.get("SRVY_TYPE").toString() : null);
	        vo.setSrvyCn(map.get("SRVY_CN") != null ? map.get("SRVY_CN").toString() : null);
	        vo.setChc(map.get("CHC") != null ? map.get("CHC").toString() : null);
	        vo.setChcRslt(map.get("CHC_RSLT") != null ? map.get("CHC_RSLT").toString() : null);
	        vo.setCount(map.get("count") != null ? ((Number) map.get("count")).intValue() : 0);
	        vo.setPercentage(map.get("percentage") != null ? ((Number) map.get("percentage")).doubleValue() : 0.0);

	        surveyResults.add(vo);
	    }

	    return surveyResults;
	}
	
	// 일반 회원이 설문조사를 보기 위해 시험지를 받아오는 함수
	public ArrayList<SrvyVO> forupdateSrvy(String lctrSeq, String seq, String instEmlAddr) {
		return srvymapper.selectBylctrNoAndSeq(lctrSeq, seq, instEmlAddr);
	}
	
	// 일반 회원이 설문조사를 보기 위해 시험지를 받아오는 함수
	public ArrayList<SrvyVO> getSrvy(String lctrSeq, String seq, String instEmlAddr) {
		return srvymapper.selectBylctrNoAndSeq(lctrSeq, seq, instEmlAddr);
	}
	
	// 사용자가 설문지를 서브밋 해서 DB에 넣는 곳
	public void insertSrvyResult(SrvyResultVO srvyRsultVO) {
		srvyRsltMapper.insertSurveyResult(srvyRsultVO);
	}
}
