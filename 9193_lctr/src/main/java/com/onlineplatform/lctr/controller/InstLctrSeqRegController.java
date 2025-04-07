package com.onlineplatform.lctr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onlineplatform.lctr.model.InstLctrSeqRprsVO;
import com.onlineplatform.lctr.service.InstLctrSeqRegService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class InstLctrSeqRegController {

	@Autowired
	public InstLctrSeqRegService instLctrSeqRegService;
	@RequestMapping(value="/api/instLctrSeqReg", method= {RequestMethod.GET, RequestMethod.POST})
	public void instLctrReg(@RequestBody InstLctrSeqRprsVO Ivo) {
		instLctrSeqRegService.saveInstLctrSeqReg(Ivo);
	}
}
