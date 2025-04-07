package com.onlineplatform.lctr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onlineplatform.lctr.model.InstMbrVO;
import com.onlineplatform.lctr.service.InstMbrJoinService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class InstMbrJoinController {

	@Autowired
	public InstMbrJoinService InstMbrJoinService;
	
	@RequestMapping(value="/api/InstMbrJoin",method= {RequestMethod.GET, RequestMethod.POST})
	public void InstMbrJoin(@RequestBody InstMbrVO imv) {
		
		InstMbrJoinService.saveInstMbrJoin(imv);
		if (imv.getInstEmlAddr() != null) {
			System.out.println("InstMbr 기관회원가입 OK:"+imv.getInstEmlAddr());
		}else {
			System.out.println("InstMbr 기관회원가입 실패");
		}
	}
}