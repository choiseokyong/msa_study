package com.onlineplatform.lctr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onlineplatform.lctr.model.LctrRprsVO;
import com.onlineplatform.lctr.service.LctrRegService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class LctrRegController {

	@Autowired
	public LctrRegService lctrRegService;
	@RequestMapping(value="/api/lctrReg", method= {RequestMethod.GET, RequestMethod.POST})
	public void lctrReg(@RequestBody LctrRprsVO lrv) {
		lctrRegService.saveLctrReg(lrv);
	}
	
}