package com.onlineplatform.lctr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineplatform.lctr.model.LctrRprsVO;
import com.onlineplatform.lctr.service.LctrDtlStatsService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class LctrDtlStatsController {

	@Autowired
	public LctrDtlStatsService lctrDtlStatsService;
	
//	@RequestMapping(value="/api/lctrStatsSrch/lctrDtlStats/{lctrSeq}", method= {RequestMethod.GET, RequestMethod.POST})
//	@ResponseBody
//	public List<InstLctrSeqRprsVO> list(@PathVariable String lctrSeq){
//		List<InstLctrSeqRprsVO> list = lctrDtlStatsService.getInstLctrSeqRprsList();
//		System.out.println("list size : " + list.size());
//		return list;
//	}
	
	@RequestMapping(value="/api/lctrStatsSrch/lctrDtlStats/{lctrSeq}", method= {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public List<LctrRprsVO> list(@PathVariable String lctrSeq){
		List<LctrRprsVO> list = lctrDtlStatsService.getLctrRprsVOList();
		System.out.println("list size : " + list.size());
		return list;
	}
	
	
}
