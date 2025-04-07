package com.msafive.prod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.msafive.prod.model.ProdVO;
import com.msafive.prod.service.ProdService;

import jakarta.servlet.http.HttpSession;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ProdController {
	@Autowired
    public ProdService prodService; 
	@RequestMapping(value="/form", method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView form(HttpSession httpSession) {
		ModelAndView mav = new ModelAndView();
		
		String sessionid = (String)httpSession.getAttribute("session_id");
		String sessionname = (String)httpSession.getAttribute("session_name");
		
		System.out.println("5 SESSION ID ---> " + sessionid);
		System.out.println("5 SESSION NAME ---> " + sessionname);
		
		mav.setViewName("/prod/prodform");
		return mav;
	}
	
	//@RequestMapping("/api/getform")
	@RequestMapping(value="/api/getform", method= {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public ProdVO getform(@RequestBody ProdVO pv) {
		ProdVO pv2 = new ProdVO();
		pv2 = prodService.getProd(pv.stockcd);
		return pv2;
	}
	@RequestMapping(value="/api/update", method= {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public void update(@RequestBody ProdVO pv) {
		prodService.updateProd(pv.stockcd,pv.stocknm);
	}
	@RequestMapping(value="/api/delete", method= {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public void delete(@RequestBody ProdVO pv) {
		prodService.deleteProd(pv.stockcd);
		
	}
	
	@RequestMapping(value="/api/signup", method= {RequestMethod.GET, RequestMethod.POST})
	public void signup(@RequestBody ProdVO pv) {
		System.out.println("user name====>"+pv.stocknm);
		System.out.println("user id====>"+pv.stockcd);		
		prodService.saveProd(pv.stockcd,pv.stocknm);
	}	
	@RequestMapping(value="/userlist", method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView userlist() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/prod/prodlist");
		return mav;
	}
	@RequestMapping(value="/api/list", method= {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public List<ProdVO> list() {
		List<ProdVO> list = prodService.getProdList();	
		return list;
	}
}
