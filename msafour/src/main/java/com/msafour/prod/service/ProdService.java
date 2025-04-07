package com.msafour.prod.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msafour.prod.mapper.ProdMapper;
import com.msafour.prod.model.ProdVO;

@Service
public class ProdService {
	@Autowired
    public ProdMapper prodMapper;
	
	public List<ProdVO> getProdList() {
		return prodMapper.selectProdList();
	}
	public void saveProd(String prodcd, String prodnm) {
		 prodMapper.insertProd(prodcd, prodnm);
	}
	public ProdVO getProd(String prodcd) {
	     return prodMapper.selectByProdcd(prodcd);
	}
	public void deleteProd(String prodcd) {
		 prodMapper.deleteProd(prodcd);
	}
	public void updateProd(String prodcd, String prodnm) {
		 prodMapper.updateProd(prodcd,prodnm);
	}
}
