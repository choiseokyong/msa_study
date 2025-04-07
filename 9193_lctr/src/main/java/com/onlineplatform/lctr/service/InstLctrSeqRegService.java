package com.onlineplatform.lctr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplatform.lctr.mapper.InstLctrSeqRegMapper;
import com.onlineplatform.lctr.model.InstLctrSeqRprsVO;

@Service
public class InstLctrSeqRegService {

	@Autowired
	public InstLctrSeqRegMapper instLctrSeqRegMapper;
	
	public void saveInstLctrSeqReg(InstLctrSeqRprsVO Ivo) {
		instLctrSeqRegMapper.insertInstLctrSeqReg(Ivo);
	}
}
