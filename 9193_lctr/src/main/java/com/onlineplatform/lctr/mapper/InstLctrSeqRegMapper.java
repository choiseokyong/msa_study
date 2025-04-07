package com.onlineplatform.lctr.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.onlineplatform.lctr.model.InstLctrSeqRprsVO;

@Mapper
public interface InstLctrSeqRegMapper {

	void insertInstLctrSeqReg(InstLctrSeqRprsVO Ivo);
}
