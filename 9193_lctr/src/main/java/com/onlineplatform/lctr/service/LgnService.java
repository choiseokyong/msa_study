package com.onlineplatform.lctr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplatform.lctr.mapper.LgnMapper;
import com.onlineplatform.lctr.model.MbrVO;

@Service
public class LgnService {
	@Autowired
	public LgnMapper lgnMapper;
	
	public MbrVO getlgn(String emlAddr, String pswd, String mbrNo ) {
		return lgnMapper.selectByLgn(emlAddr, pswd, mbrNo);
	}
	public MbrVO getfindPswd(String emlAddr, String pswd) {
		return lgnMapper.selectByFindPswd(emlAddr, pswd);
	}	
}
