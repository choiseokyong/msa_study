package com.msaone.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.msaone.user.model.UserVO;
import com.msaone.user.service.User2Service;

import jakarta.servlet.http.HttpSession;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserController {
	@Autowired
	public User2Service userService;
	
	@RequestMapping("/form")
	public ModelAndView form(HttpSession httpSession) {
		httpSession.setAttribute("session_id", "test123");
		httpSession.setAttribute("session_name", "HongGilDong");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/user/userform");
		
		return mav;
	}
	
	@RequestMapping("/api/getform")
	public UserVO getform(@RequestBody UserVO uv) {
		UserVO uv2 = userService.getUser(uv.id);
		
		return uv2;
	}
	
	@RequestMapping("/api/update")
	public void update(@RequestBody UserVO uv) {
		userService.updateUser(uv.id, uv.name);
	}
	
	@RequestMapping("/api/delete")
	public void delete(@RequestBody UserVO uv) {
		userService.deleteUser(uv.id);
	}
	
	@RequestMapping("/api/signup")
	public void signup(@RequestBody UserVO uv) {
		System.out.println("user name ====> " + uv.name);
		System.out.println("user id ====> " + uv.id);
		
		userService.saveUser(uv.id, uv.name);
	}
	
	@RequestMapping("/userlist")
	public ModelAndView userlist() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/user/userlist");
		
		return mav;
	}
	
	@RequestMapping("/api/list")
	@ResponseBody
	public List<UserVO> list() { 
		List<UserVO> list = userService.getUserList();
		
		return list;
	}
}
