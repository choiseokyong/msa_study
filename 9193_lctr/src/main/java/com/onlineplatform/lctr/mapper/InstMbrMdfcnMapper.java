package com.onlineplatform.lctr.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.onlineplatform.lctr.model.InstMbrVO;

@Mapper
public interface InstMbrMdfcnMapper {

    InstMbrVO getInstMbrInfo(String instEmlAddr);

    void updateInstMbrInfo(InstMbrVO imv);
}