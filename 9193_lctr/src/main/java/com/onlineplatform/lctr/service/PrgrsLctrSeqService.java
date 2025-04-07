package com.onlineplatform.lctr.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.onlineplatform.lctr.mapper.PrgrsLctrSeqMapper;
import com.onlineplatform.lctr.model.LctrSeqVO;

@Service
public class PrgrsLctrSeqService {

    @Autowired
    private PrgrsLctrSeqMapper prgrsLctrSeqMapper;
    
    public List<LctrSeqVO> getPrgrsLctrSeqList(String emlAddr) {
        return prgrsLctrSeqMapper.getPrgrsLctrSeqList(emlAddr);
    }
}
