package com.onlineplatform.lctr.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.onlineplatform.lctr.model.LctrRprsVO;

@Mapper
public interface LctrRegMapper {

	void insertLctrReg(LctrRprsVO lrv);
}
