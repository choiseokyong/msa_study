package com.onlineplatform.lctr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onlineplatform.lctr.model.MbrVO;
import com.onlineplatform.lctr.service.MbrJoinService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MbrJoinController {

	@Autowired
	public MbrJoinService MbrJoinService;
	
	@RequestMapping(value="/api/MbrJoin",method= {RequestMethod.GET, RequestMethod.POST})
	public void MbrJoin(@RequestBody MbrVO mv) {
		
		MbrJoinService.saveMbrJoin(mv);
		if (mv.getEmlAddr() != null) {
			System.out.println("Mbr 일반 회원 가입 :"+mv.getAddr());
		}else {
			System.out.println("Mbr 회원가입 실패");
		}
	}
}