package com.onlineplatform.lctr.mapper;

import java.util.List;

import com.onlineplatform.lctr.model.LctrRprsVO;

public interface LctrDtlStatsMapper {

	//List<InstLctrSeqRprsVO> selectInstLctrSeqRprsList();
	
	List<LctrRprsVO> selectLctrRprsVOList();
}
