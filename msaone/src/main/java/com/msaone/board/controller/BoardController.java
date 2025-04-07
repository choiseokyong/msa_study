package com.msaone.board.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.msaone.board.dao.boardDao;
import com.msaone.board.model.UserVO;
import com.msaone.board.service.UserService;

@Controller
public class BoardController {
	@Autowired
	public UserService userService;
	
	boardDao boardDao = new boardDao();
	
	@RequestMapping("/")
	public ModelAndView test() {
		ModelAndView mav = new ModelAndView();
		
		UserVO uv = userService.getUser("1");
		System.out.println("--->" + uv.name);
		
		mav.addObject("name", uv.name);
		mav.addObject("id", uv.id);
		mav.setViewName("main");
		
		return mav;
	}
	
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		
		ArrayList<UserVO> uvlist = userService.getUserList();
		
		mav.addObject("list", uvlist);
		mav.setViewName("list");
		
		return mav;
	}
	
	@RequestMapping("/saveform")
	public ModelAndView saveform() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("save");
		
		return mav;
	}
	
	@RequestMapping("/user/save")
	public String save(@RequestParam("id") String id, @RequestParam("name") String name) {
		System.out.println("JFJFJFJF" + name);
		userService.saveUser(id, name);
		
		return "redirect:/list";
	}
	
	@RequestMapping("/deleteList")
	public ModelAndView deleteList() {
		ModelAndView mav = new ModelAndView();
		
		ArrayList<UserVO> uvlist = userService.getUserList();
		
		mav.addObject("list", uvlist);
		mav.setViewName("deleteList");
		
		return mav;
	}
	
	@RequestMapping("/user/delete")
	public String delete(@RequestParam("id") String id) {
		ModelAndView mav = new ModelAndView();
		
		userService.deleteUser(id);
		
		return "redirect:/deleteList";
	}
	
//	@RequestMapping("/user/delete")
//	public ModelAndView delete(@RequestParam(value = "id", defaultValue = "") String id) {
//		ModelAndView mav = new ModelAndView();
//		
//		userService.deleteUser(id);
//		ArrayList<UserVO> uvlist = userService.getUserList();
//		
//		mav.addObject("list", uvlist);
//		mav.setViewName("deleteList");
//		
//		return mav;
//	}
	
	@RequestMapping("/updateList")
	public ModelAndView updateList() {
		ModelAndView mav = new ModelAndView();
		
		ArrayList<UserVO> uvlist = userService.getUserList();
		
		mav.addObject("list", uvlist);
		mav.setViewName("updateList");
		
		return mav;
	}

//	@RequestMapping("/user/update")
//	public ModelAndView update(@RequestParam(value = "id", defaultValue = "") String id, @RequestParam(value = "name", defaultValue = "") String name) {
//		ModelAndView mav = new ModelAndView();
//		
//		userService.updateUser(id, name);
//		ArrayList<UserVO> uvlist = userService.getUserList();
//		
//		mav.addObject("list", uvlist);
//		mav.setViewName("updateList");
//		
//		return mav;
//	}
	
	@RequestMapping("/user/update")
	public String update(@RequestParam("id") String id, @RequestParam("name") String name) {
		ModelAndView mav = new ModelAndView();
		
		userService.updateUser(id, name);
		
		return "redirect:/updateList";
	}
	
//	@RequestMapping("/list")
//	ModelAndView boardList() {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("./boardlist");
//		
//		
//		ArrayList list = boardDao.getList();
//		
//		for(int i=0; i<list.size(); i++) {
//			Map map = new HashMap();
//			map = (Map)list.get(i);
//			System.out.println("컨트롤러에서 호출하여 받은 디비값 name ===> " + map.get("name"));
//			System.out.println("컨트롤러에서 호출하여 받은 디비값 addr ===> " + map.get("addr") + System.lineSeparator());
//		}
//		
//		mav.addObject("list", list);
//		return mav;
//	}
	
	
}
