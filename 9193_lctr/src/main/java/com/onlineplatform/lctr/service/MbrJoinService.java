package com.onlineplatform.lctr.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplatform.lctr.mapper.MbrJoinMapper;
import com.onlineplatform.lctr.model.MbrVO;

@Service
public class MbrJoinService {

	@Autowired
	public MbrJoinMapper MbrJoinMapper;
	
	public void saveMbrJoin(MbrVO mv) {
		MbrJoinMapper.insertMbr(mv);
	}
}
