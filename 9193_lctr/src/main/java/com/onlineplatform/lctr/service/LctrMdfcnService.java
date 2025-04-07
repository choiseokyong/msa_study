package com.onlineplatform.lctr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplatform.lctr.mapper.LctrMdfcnMapper;
import com.onlineplatform.lctr.model.LctrRprsVO;

@Service
public class LctrMdfcnService {

	@Autowired
	public LctrMdfcnMapper lctrMdfcnMapper;
	
	public void lctrMdfcn(LctrRprsVO lrv) {
		lctrMdfcnMapper.lctrMdfcn(lrv);
	}
	
	// 강좌 삭제
    public void deleteLctr(String lctrSeq) {
        // 강좌 삭제 메서드
    	lctrMdfcnMapper.deleteLctr(lctrSeq);
    }
}