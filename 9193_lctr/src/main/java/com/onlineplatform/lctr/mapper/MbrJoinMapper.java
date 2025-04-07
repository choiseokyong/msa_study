package com.onlineplatform.lctr.mapper;
import org.apache.ibatis.annotations.Mapper;
import com.onlineplatform.lctr.model.MbrVO;

@Mapper
public interface MbrJoinMapper {

	void insertMbr(MbrVO mv);
}
