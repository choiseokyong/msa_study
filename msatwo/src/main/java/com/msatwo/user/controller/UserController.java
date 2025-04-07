package com.msatwo.user.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.msatwo.user.model.UserVO;
import com.msatwo.user.service.UserService;

import jakarta.servlet.http.HttpSession;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserController {
	@Autowired
    public UserService userService; 
	@RequestMapping(value="/form", method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView form(HttpSession httpSession) {
		String sessionid = (String)httpSession.getAttribute("session_id");
		String sessionname = (String)httpSession.getAttribute("session_name");
		
		System.out.println("SESSION_ID 값은 ====> " + sessionid);
		System.out.println("SESSION_NAME 값은 ====> " + sessionname);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/user/userform");
		return mav;
	}
	
	//@RequestMapping("/api/getform")
	@RequestMapping(value="/api/getform", method= {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public UserVO getform(@RequestBody UserVO uv) {
		UserVO uv2=new UserVO();
		uv2=userService.getUser(uv.id);
		return uv2;
	}
	@RequestMapping(value="/api/update", method= {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public void update(@RequestBody UserVO uv) {
		userService.updateUser(uv.id,uv.name);
	}
	@RequestMapping(value="/api/delete", method= {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public void delete(@RequestBody UserVO uv) {
		userService.deleteUser(uv.id);
		
	}
	
	
	
	@RequestMapping(value="/api/signup", method= {RequestMethod.GET, RequestMethod.POST})
	public void signup(@RequestBody UserVO uv) {
		System.out.println("user name====>"+uv.name);
		System.out.println("user id====>"+uv.id);		
		userService.saveUser(uv.id,uv.name);
	}	
	@RequestMapping(value="/userlist", method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView userlist() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/user/userlist");
		return mav;
	}
	@RequestMapping(value="/api/list", method= {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public List<UserVO> list() {
		List<UserVO> list =userService.getUserList();	
		return list;
	}
}
