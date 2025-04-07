package com.onlineplatform.lctr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineplatform.lctr.model.InstLctrSeqRprsVO;
import com.onlineplatform.lctr.service.LctrAplyStatsSrchService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class LctrAplyStatsSrchController {

	@Autowired
	public LctrAplyStatsSrchService lctrAplyStatsSrchService;
	
	@RequestMapping(value="/api/lctrAplyStatsSrch", method= {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public List<InstLctrSeqRprsVO> list(@RequestBody String emlAddr){
		System.out.println(emlAddr);
		List<InstLctrSeqRprsVO> list = lctrAplyStatsSrchService.getInstLctrSeqRprsList(emlAddr);
		System.out.println("list size : " + list.size());
		return list;
	}
}
