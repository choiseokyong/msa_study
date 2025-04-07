package com.onlineplatform.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineplatform.common.model.NtcPageVO;
import com.onlineplatform.common.model.NtcVO;
import com.onlineplatform.common.service.NtcService;

import jakarta.servlet.http.HttpSession;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
//@RequestMapping("/ntc/*")
public class NtcController {
	@Autowired
	public NtcService ntcService;
	
	@PostMapping("/api/ntc/reg")
	public String ntcInsert(@RequestBody NtcVO vo, HttpSession httpSession) {
		//httpSession.setAttribute("emlAddr", "test1");
		
		vo.setRegId("test1");
		vo.setUptId("test1");
		
		System.out.println("title : " + vo.getTitle());
		System.out.println("content : " + vo.getContent());
		
		ntcService.addNtc(vo);
		
		return "/ntcReg";
	}
	
	@GetMapping("/api/ntc/index")
	public NtcPageVO ntcIndex(@RequestParam(required = false, value = "start", defaultValue = "0") int start
			, @RequestParam(value = "scale", required = false, defaultValue = "5") int scale
			, @RequestParam(value = "searchKey", required = false, defaultValue = "") String searchKey
			, @RequestParam(value = "keyword", required = false, defaultValue = "") String keyword) {
		
		List<NtcVO> list = ntcService.getNtcIndex(start, scale, searchKey, keyword);
		int total = ntcService.getNtcTotal(searchKey, keyword);
		
		NtcPageVO pageVO = new NtcPageVO(list, total);
		
		return pageVO;
	}
	
	@GetMapping("/api/ntc/main")
	@ResponseBody
	public List<NtcVO> ntcIndexToMain() {
		List<NtcVO> list = ntcService.getNtcIndexToMain();
		System.out.println(list.get(0).getRegDt());
		return list;
	}
	
	@GetMapping("/api/ntc/get")
	public NtcVO ntcGet(@RequestParam int no) {
		//stat = 0;
		//scl = 10;
		NtcVO vo = ntcService.getNtc(no);
		
		System.out.println("list : " + vo.getTitle());
		return vo;
	}
	
	@PostMapping("/api/ntc/update")
	public int ntcUpdate(@RequestBody NtcVO vo) {		
		
		return ntcService.updateNtc(vo);
	}
	
	@PostMapping("/api/ntc/delete")
	public int ntcDelete(@RequestBody int no) {		
		return ntcService.deleteNtc(no);
	}
}
