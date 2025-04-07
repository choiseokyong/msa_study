package com.onlineplatform.lctr.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.onlineplatform.lctr.mapper.LctrSeqStatsSrchMapper;
import com.onlineplatform.lctr.model.LctrRprsVO;

@Service
public class LctrSeqStatsSrchService {

    @Autowired
    private LctrSeqStatsSrchMapper lctrSeqStatsSrchMapper;
    
    // 강의 목록을 조회하는 서비스 메서드
    public List<LctrRprsVO> getLectureList() {
        return lctrSeqStatsSrchMapper.getLectureList();
    }
}
