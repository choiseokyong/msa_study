package com.onlineplatform.lctr.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.onlineplatform.lctr.model.LctrSeqVO;
import com.onlineplatform.lctr.service.EndLctrSeqService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class EndLctrSeqController {

    @Autowired
    private EndLctrSeqService endLctrSeqService;
    
    // 회원 이메일을 쿼리 파라미터로 받아 종료된 강좌 데이터를 반환
    @GetMapping("/endLctrSeq")
    public List<LctrSeqVO> getEndLctrSeq(@RequestParam String emlAddr) {
        return endLctrSeqService.getEndLctrSeqList(emlAddr);
    }
}
