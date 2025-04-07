package com.onlineplatform.lctr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplatform.lctr.mapper.LctrRegMapper;
import com.onlineplatform.lctr.model.LctrRprsVO;

@Service
public class LctrRegService {

	@Autowired
	public LctrRegMapper lctrRegMapper;
	
	public void saveLctrReg(LctrRprsVO lrv) {
		lctrRegMapper.insertLctrReg(lrv);
	}
}
