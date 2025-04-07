package com.onlineplatform.lctr.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.onlineplatform.lctr.mapper.EndLctrSeqMapper;
import com.onlineplatform.lctr.model.LctrSeqVO;

@Service
public class EndLctrSeqService {

    @Autowired
    private EndLctrSeqMapper endLctrSeqMapper;
    
    public List<LctrSeqVO> getEndLctrSeqList(String emlAddr) {
        return endLctrSeqMapper.getEndLctrSeqList(emlAddr);
    }
}
