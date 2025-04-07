package com.msafive.prod.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msafive.prod.mapper.ProdMapper;
import com.msafive.prod.model.ProdVO;

@Service
public class ProdService {
	@Autowired
    public ProdMapper prodMapper;
	
	public List<ProdVO> getProdList() {
		return prodMapper.selectProdList();
	}
	public void saveProd(String stockcd, String stocknm) {
		 prodMapper.insertProd(stockcd, stocknm);
	}
	public ProdVO getProd(String stockcd) {
	     return prodMapper.selectByProdcd(stockcd);
	}
	public void deleteProd(String stockcd) {
		 prodMapper.deleteProd(stockcd);
	}
	public void updateProd(String stockcd, String stocknm) {
		 prodMapper.updateProd(stockcd,stocknm);
	}
}
