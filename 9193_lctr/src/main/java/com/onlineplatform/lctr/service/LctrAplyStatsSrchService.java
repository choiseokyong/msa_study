package com.onlineplatform.lctr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplatform.lctr.mapper.LctrAplyStatsSrchMapper;
import com.onlineplatform.lctr.model.InstLctrSeqRprsVO;

@Service
public class LctrAplyStatsSrchService {

	@Autowired
	public LctrAplyStatsSrchMapper lctrAplyStatsSrchMapper;
	
	public List<InstLctrSeqRprsVO> getInstLctrSeqRprsList(String emlAddr){
		return lctrAplyStatsSrchMapper.selectInstLctrSeqRprsList(emlAddr);
	}
}
