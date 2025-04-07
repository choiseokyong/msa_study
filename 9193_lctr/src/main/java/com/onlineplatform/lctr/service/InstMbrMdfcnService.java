package com.onlineplatform.lctr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplatform.lctr.mapper.InstMbrMdfcnMapper;
import com.onlineplatform.lctr.model.InstMbrVO;

@Service
public class InstMbrMdfcnService {

    @Autowired
    private InstMbrMdfcnMapper instMbrMdfcnMapper;

    public InstMbrVO getInstMbrInfo(String instEmlAddr) {
    	System.out.println("get Mbr Service Inform"+instEmlAddr);
        return instMbrMdfcnMapper.getInstMbrInfo(instEmlAddr);
    }

    public void updateInstMbrInfo(InstMbrVO imv) {
        instMbrMdfcnMapper.updateInstMbrInfo(imv);
    }
}