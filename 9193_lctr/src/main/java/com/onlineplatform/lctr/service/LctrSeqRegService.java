package com.onlineplatform.lctr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplatform.lctr.mapper.LctrSeqRegMapper;
import com.onlineplatform.lctr.model.LctrRprsVO;
import com.onlineplatform.lctr.model.LctrSeqVO;

@Service
public class LctrSeqRegService {

	@Autowired
	public LctrSeqRegMapper lctrSeqRegMapper; // 강의 등록 Mapper
	
	public void saveLctrSeqReg(LctrSeqVO lsv) {
        // 강의 등록 처리
        lctrSeqRegMapper.insertLctrSeqReg(lsv);
    }

	public List<LctrRprsVO> getLctrList() {
		
		return lctrSeqRegMapper.getLctrList();  // Mapper 메서드 호출
	}
}