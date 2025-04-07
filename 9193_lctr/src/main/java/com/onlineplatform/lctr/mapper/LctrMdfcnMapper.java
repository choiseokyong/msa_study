package com.onlineplatform.lctr.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.onlineplatform.lctr.model.LctrRprsVO;

@Mapper
public interface LctrMdfcnMapper {

	void lctrMdfcn(LctrRprsVO lrv);
	
	// 강좌 삭제
    void deleteLctr(String lctrSeq); 
}
