package com.onlineplatform.common.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplatform.common.mapper.NtcMapper;
import com.onlineplatform.common.model.NtcVO;

@Service
public class NtcService {
	@Autowired
	public NtcMapper ntcMapper;
	
	public NtcVO getNtc(int no) {
		return ntcMapper.selectByNo(no);
	}
	
	public int addNtc(NtcVO vo) {
		return ntcMapper.insertNtc(vo);
	}
	
	public ArrayList<NtcVO> getNtcIndex(int stat, int scl, String searchKey, String keyword) {
//		List<String> allowedColumns = List.of("", "title", "user");
//        if (!allowedColumns.contains(searchKey)) {
//            throw new IllegalArgumentException("Invalid searchKey.");
//        }
		
		return ntcMapper.selectNtcList(stat, scl, searchKey, keyword);
	}
	
	public ArrayList<NtcVO> getAllNtcIndex() {
		return ntcMapper.selectAllNtcList();
	}
	
	public int updateNtc(NtcVO vo) {
		return ntcMapper.updateNtc(vo);
	}
	
	public int deleteNtc(int no) {
		return ntcMapper.deleteNtc(no);
	}
	
	public int getNtcTotal(String searchKey, String keyword) {
		return ntcMapper.getNtcTotal(searchKey, keyword);
	}
	public ArrayList<NtcVO> getNtcIndexToMain() {
		return ntcMapper.selectNtcListToMain();
	} 
}
