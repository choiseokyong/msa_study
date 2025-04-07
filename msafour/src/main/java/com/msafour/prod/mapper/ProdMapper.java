package com.msafour.prod.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.msafour.prod.model.ProdVO;
@Mapper
public interface ProdMapper {
    List<ProdVO> selectProdList();
    void insertProd(String prodcd,String prodnm);
    ProdVO selectByProdcd(String prodcd);
    void deleteProd(String prodcd);
    void updateProd(String prodcd,String prodnm);
}
