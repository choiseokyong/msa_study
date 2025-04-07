package com.onlineplatform.lctr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.onlineplatform.lctr.model.LctrRprsVO;


@Mapper
public interface LctrStatsSrchMapper {

	List<LctrRprsVO> selectLctrRprsList();

	LctrRprsVO findByLctrSeq(String lctrSeq);
	
	List<LctrRprsVO> AdminSelectLctrRprsList();
	
	List<LctrRprsVO> GeneralSelectLctrRprsList();
}
