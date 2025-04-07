package com.onlineplatform.srvy.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.onlineplatform.srvy.model.SrvyResultVO;

@Mapper
public interface SrvyResultMapper {
	// 만족도 설문조사 사용자 결과 삽입
    void insertSurveyResult(SrvyResultVO srvyRsultVO);
    List<Map<String, Object>> selectSurveyResults(Map<String, Object> paramMap);
}
