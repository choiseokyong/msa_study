package com.onlineplatform.lctr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.onlineplatform.lctr.model.LctrRprsVO;
import com.onlineplatform.lctr.model.LctrSeqVO;

@Mapper
public interface LctrSeqRegMapper {

	void insertLctrSeqReg(LctrSeqVO lsv); // 강의 등록
	
	void insertLctrReg(LctrRprsVO lrv); //강좌 등록

	List<LctrRprsVO> getLctrList();

	LctrRprsVO findByLctrSeq(String lctrSeq);

}
