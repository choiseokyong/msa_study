package com.onlineplatform.lctr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.onlineplatform.lctr.model.InstLctrSeqRprsVO;

@Mapper
public interface LctrAplyStatsSrchMapper {

	List<InstLctrSeqRprsVO> selectInstLctrSeqRprsList(String emlAddr);
}
