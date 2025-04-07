package com.onlineplatform.lctr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.onlineplatform.lctr.model.InstMbrVO;
import com.onlineplatform.lctr.service.InstMbrMdfcnService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class InstMbrMdfcnController {

    @Autowired
    private InstMbrMdfcnService instMbrMdfcnService;
    
    @RequestMapping(value="/api/instMbrMdfcn", method={RequestMethod.POST}) // 엔드포인트 통합 및 PUT 메서드 추가
	@ResponseBody
    public InstMbrVO instMbrMdfcn(@RequestBody InstMbrVO imv) {
        if (imv.getPswd() == null) { // 비밀번호가 없으면 조회
        	System.out.println("Controller 조회"+imv.getInstEmlAddr());
            return instMbrMdfcnService.getInstMbrInfo(imv.getInstEmlAddr());
        } else { // 비밀번호가 있으면 수정
            instMbrMdfcnService.updateInstMbrInfo(imv);
            return imv; // 수정된 정보 반환
        }
    }
}