package com.onlineplatform.lctr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.onlineplatform.lctr.model.MbrVO;
import com.onlineplatform.lctr.service.LgnService;

import jakarta.servlet.http.HttpSession;

@CrossOrigin(origins="*", allowedHeaders="*")
@RestController
public class LgnController {
	
	@Autowired
	public LgnService lgnService;
	
	@RequestMapping(value="/form", method={RequestMethod.GET, RequestMethod.POST})
	public	ModelAndView form(HttpSession httpsession){
		 String sessionid=httpsession.getAttribute("session_id")+""; String
		 sessionname=httpsession.getAttribute("session_name")+"";
		 System.out.println("Two one's SESSION_ID 값은====>"+sessionid);
		 System.out.println("Two one's SESSION_NAME 값은====>"+sessionname);
		  
		ModelAndView mav =  new ModelAndView();
		mav.setViewName("/user/userform");
		return mav;	
	}
	
	@RequestMapping(value="/api/lgn", method={RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public	MbrVO getform(@RequestBody MbrVO mv){
		MbrVO mv1 = new MbrVO();
		mv1=lgnService.getlgn(mv.getEmlAddr(), mv.getPswd(), mv.getMbrNo());
		System.out.println("logon OK :"+mv.getEmlAddr()+"pswd"+mv.getPswd());
		System.out.println("logon OK :"+mv1);
		System.out.println("mbrNo :"+mv1.getMbrNo());
		return mv;	
	}
	 
	@RequestMapping(value="/api/findPswd", method={RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public	MbrVO getfindpswd(@RequestBody MbrVO fv){
		MbrVO fv1 = new MbrVO();
		fv1=lgnService.getfindPswd(fv.getEmlAddr(), fv.getPswd());
		if(fv1 != null) {
			System.out.println("Find OK :"+fv.getPswd());
		}else { 
			System.out.println("비밀번호가 없음 :"+fv1);
		}
		return fv;	
	}
}
