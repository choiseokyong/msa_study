package com.onlineplatform.lctr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.onlineplatform.lctr.model.LctrRprsVO;
import com.onlineplatform.lctr.model.LctrSeqVO;
import com.onlineplatform.lctr.service.LctrSeqRegService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class LctrSeqRegController {

	@Autowired
	public LctrSeqRegService lctrSeqRegService;
	
	@GetMapping("/api/lctrSeqReg")
	public List<LctrRprsVO> getLctrList() {
	    return lctrSeqRegService.getLctrList();  // 강좌 목록을 반환하는 서비스 메서드 호출
	}
	
	@PostMapping("/api/lctrSeqReg")
	@ResponseStatus(HttpStatus.CREATED)  // 강좌 등록 시 201 상태 코드 반환
	public void lctrReg(@RequestBody LctrSeqVO lsv) {
	    // lctrSeq는 lsv 객체 내부에 포함되어 있다고 가정
		if (lsv.getEmlAddr() == null || lsv.getLctrObjt() == null) {
	        throw new IllegalArgumentException("필수 항목이 누락되었습니다.");
	    }
		
	    lctrSeqRegService.saveLctrSeqReg(lsv);
	}
}
