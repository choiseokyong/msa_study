package com.onlineplatform.lctr.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.onlineplatform.lctr.model.LctrRprsVO;

@Mapper
public interface LctrSeqStatsSrchMapper {
    // DB에서 강의 목록을 조회하는 메서드 선언
    List<LctrRprsVO> getLectureList();
}
