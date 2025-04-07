package com.onlineplatform.lctr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplatform.lctr.mapper.MbrMdfcnMapper;
import com.onlineplatform.lctr.model.MbrVO;

@Service
public class MbrMdfcnService {

	  @Autowired
	  private MbrMdfcnMapper MbrMdfcnMapper;

	  public MbrVO getMbrInfo(String emlAddr) {
	    	System.out.println("get Mbr Service Inform"+emlAddr);
	        return MbrMdfcnMapper.getMbrInfo(emlAddr);
	    }

	    public void updateMbrInfo(MbrVO mv) {
	        MbrMdfcnMapper.updateMbrInfo(mv);
	    }

}
