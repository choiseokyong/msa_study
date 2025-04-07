package com.onlineplatform.lctr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineplatform.lctr.model.LctrRprsVO;
import com.onlineplatform.lctr.service.LctrMdfcnService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class LctrMdfcnController {

	@Autowired
	public LctrMdfcnService lctrMdfcnService;
	
	@RequestMapping(value="/api/lctrStatsSrch/lctrMdfcn", method= {RequestMethod.GET, RequestMethod.POST})
	public void lctrMdfcn(@RequestBody LctrRprsVO lrv) {
		lctrMdfcnService.lctrMdfcn(lrv);
	}
	
	// 강좌 삭제 API
    @DeleteMapping("/api/lctrStatsSrch/lctrMdfcn/{lctrSeq}")
    public void deleteLctr(@PathVariable String lctrSeq) {
    	lctrMdfcnService.deleteLctr(lctrSeq);
    }
	
}