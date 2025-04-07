package com.onlineplatform.common.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.onlineplatform.common.model.NtcVO;

@Mapper
public interface NtcMapper {
	NtcVO selectByNo(int no);
	ArrayList<NtcVO> selectNtcList(int start, int scale, String searchKey, String keyword);
	ArrayList<NtcVO> selectNtcListToMain();
	int insertNtc(NtcVO vo);
	int deleteNtc(int no);
	int updateNtc(NtcVO vo);
	ArrayList<NtcVO> selectAllNtcList();
	int getNtcTotal(String searchKey, String keyword);
}
