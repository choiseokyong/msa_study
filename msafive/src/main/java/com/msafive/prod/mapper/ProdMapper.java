package com.msafive.prod.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.msafive.prod.model.ProdVO;
@Mapper
public interface ProdMapper {
    List<ProdVO> selectProdList();
    void insertProd(String stockcd,String stocknm);
    ProdVO selectByProdcd(String stockcd);
    void deleteProd(String stockcd);
    void updateProd(String stockcd,String stocknm);
}
