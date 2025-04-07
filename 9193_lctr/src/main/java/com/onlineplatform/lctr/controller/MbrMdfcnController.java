package com.onlineplatform.lctr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.onlineplatform.lctr.model.MbrVO;
import com.onlineplatform.lctr.service.MbrMdfcnService;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MbrMdfcnController {

    @Autowired
    private MbrMdfcnService MbrMdfcnService;
    
    @RequestMapping(value="/api/MbrMdfcn", method={RequestMethod.POST}) // 엔드포인트 통합 및 PUT 메서드 추가
	@ResponseBody
    public MbrVO MbrMdfcn(@RequestBody MbrVO  mv) {
        if (mv.getPswd() == null) { // 비밀번호가 없으면 조회
        	System.out.println("Controller 조회"+mv.getEmlAddr());
            return MbrMdfcnService.getMbrInfo(mv.getEmlAddr());
        } else { // 비밀번호가 있으면 수정
            MbrMdfcnService.updateMbrInfo(mv);
            return mv; // 수정된 정보 반환
        }
    }
}


