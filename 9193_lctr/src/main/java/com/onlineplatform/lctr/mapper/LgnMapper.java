package com.onlineplatform.lctr.mapper;

import com.onlineplatform.lctr.model.MbrVO;

public interface LgnMapper {

	MbrVO selectByLgn(String emlAddr, String pswd, String mbrNo);
	MbrVO selectByFindPswd(String emlAddr, String pswd);
	
}
