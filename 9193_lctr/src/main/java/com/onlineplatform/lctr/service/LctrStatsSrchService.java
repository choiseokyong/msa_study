package com.onlineplatform.lctr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplatform.lctr.mapper.LctrStatsSrchMapper;
import com.onlineplatform.lctr.model.LctrRprsVO;

@Service
public class LctrStatsSrchService {

	@Autowired
	public LctrStatsSrchMapper lctrStatsSrchMapper;
	
	public List<LctrRprsVO> getLctrRprsList(){
		return lctrStatsSrchMapper.selectLctrRprsList();
	}

	public LctrRprsVO getLctrRprsBySeq(String lctrSeq) {
		// lctrSeq에 해당하는 강좌 정보를 데이터베이스에서 가져오는 로직 작성
		 return lctrStatsSrchMapper.findByLctrSeq(lctrSeq);
	}
	
	public List<LctrRprsVO> getAdminLctrRprsList(){
		return lctrStatsSrchMapper.AdminSelectLctrRprsList();
	}
	
	public List<LctrRprsVO> getGeneralLctrRprsList(){
		return lctrStatsSrchMapper.GeneralSelectLctrRprsList();
	}
}
