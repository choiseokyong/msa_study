package com.onlineplatform.lctr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplatform.lctr.mapper.InstMbrJoinMapper;
import com.onlineplatform.lctr.model.InstMbrVO;


@Service
public class InstMbrJoinService {

	@Autowired
	public InstMbrJoinMapper instMbrJoinMapper;
	
	public void saveInstMbrJoin(InstMbrVO imv) {
		instMbrJoinMapper.insertInstMbr(imv);
	}
	
	
}