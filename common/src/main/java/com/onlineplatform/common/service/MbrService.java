package com.onlineplatform.common.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplatform.common.mapper.MbrMapper;
import com.onlineplatform.common.model.InstMbrVO;
import com.onlineplatform.common.model.MbrVO;

@Service
public class MbrService {
	@Autowired
	public MbrMapper mbrMapper;
	
	public ArrayList<MbrVO> getMbrIndex(){
		return mbrMapper.selectMbrList();
	}
	
	public MbrVO getMbrByLgn(String emlAddr, String pswd, int mbrNo){
		return mbrMapper.selectMbrByLgn(emlAddr, pswd, mbrNo);
	}
	
	public InstMbrVO getInstMbrByLgn(String emlAddr, String pswd, int mbrNo){
		return mbrMapper.selectInstMbrByLgn(emlAddr, pswd, mbrNo);
	}
}
