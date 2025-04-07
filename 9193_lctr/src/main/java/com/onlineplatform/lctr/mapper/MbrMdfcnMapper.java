package com.onlineplatform.lctr.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.onlineplatform.lctr.model.MbrVO;

@Mapper
public interface MbrMdfcnMapper {
	
	MbrVO getMbrInfo(String emlAddr);

    void updateMbrInfo(MbrVO mv);

}
