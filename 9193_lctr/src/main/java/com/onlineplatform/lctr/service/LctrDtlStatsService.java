package com.onlineplatform.lctr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplatform.lctr.mapper.LctrDtlStatsMapper;
import com.onlineplatform.lctr.model.LctrRprsVO;

@Service
public class LctrDtlStatsService {

	@Autowired
	public LctrDtlStatsMapper lctrDtlStatsMapper;
	
//	public List<InstLctrSeqRprsVO> getInstLctrSeqRprsList(){
//		return lctrDtlStatsMapper.selectInstLctrSeqRprsList();
//	}
	
	public List<LctrRprsVO> getLctrRprsVOList(){
		return lctrDtlStatsMapper.selectLctrRprsVOList();
	}
}
