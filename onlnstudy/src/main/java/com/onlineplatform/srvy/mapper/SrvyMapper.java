package com.onlineplatform.srvy.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.onlineplatform.srvy.model.SrvyVO;

@Mapper
public interface SrvyMapper {
	// 만족도 설문조사 문제 삽입
    void insertSurvey(SrvyVO srvyVo);
    void deleteSrvy(String lctrSeq, String seq, String instEmlAddr);
	ArrayList<SrvyVO> selectBylctrNoAndSeq(String lctrSeq, String seq, String instEmlAddr);
}
