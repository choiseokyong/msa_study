package com.onlineplatform.lctr.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.onlineplatform.lctr.model.LctrSeqVO;

@Mapper
public interface EndLctrSeqMapper {
    // 회원 이메일을 받아 종료된 강좌(예: MDFCN_YMD < 현재 날짜)를 조회
    List<LctrSeqVO> getEndLctrSeqList(String emlAddr);
}
