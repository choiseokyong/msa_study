package com.onlineplatform.lctr.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.onlineplatform.lctr.model.InstMbrVO;

@Mapper
public interface InstMbrJoinMapper {

	void insertInstMbr(InstMbrVO imv);
}