package com.onlineplatform.lctr.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.onlineplatform.lctr.model.LctrRprsVO;
import com.onlineplatform.lctr.service.LctrSeqStatsSrchService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class LctrSeqStatsSrchController {

    @Autowired
    private LctrSeqStatsSrchService lctrSeqStatsSrchService;
    
    // GET 방식으로 강의 목록을 조회하는 API
    @GetMapping("/api/lctrSeqStatsSrch")
    public List<LctrRprsVO> getLectureList() {
        return lctrSeqStatsSrchService.getLectureList();
    }
}
