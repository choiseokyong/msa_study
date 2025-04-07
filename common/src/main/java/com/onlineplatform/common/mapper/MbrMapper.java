package com.onlineplatform.common.mapper;

import java.util.ArrayList;

import com.onlineplatform.common.model.InstMbrVO;
import com.onlineplatform.common.model.MbrVO;

public interface MbrMapper {
	//MenuVO selectByNo(int no);
	ArrayList<MbrVO> selectMbrList();
	MbrVO selectMbrByLgn(String emlAddr, String pswd, int mbrNo);
	InstMbrVO selectInstMbrByLgn(String emlAddr, String pswd, int mbrNo);
	//int insertMenu();
	//int deleteMenu(int no);
	//int updateMenu(int no);
}
