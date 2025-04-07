package com.onlineplatform.lctr.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.onlineplatform.lctr.model.LctrSeqVO;

@Mapper
public interface PrgrsLctrSeqMapper {
    // 회원 이메일(emlAddr)을 받아 해당 회원의 강의 진도 정보를 조회
    List<LctrSeqVO> getPrgrsLctrSeqList(String emlAddr);
}
