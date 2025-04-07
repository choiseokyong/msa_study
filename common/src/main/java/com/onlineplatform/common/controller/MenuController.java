package com.onlineplatform.common.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.onlineplatform.common.model.MenuPageResponse;
import com.onlineplatform.common.model.MenuVO;
import com.onlineplatform.common.service.MbrService;
import com.onlineplatform.common.service.MenuService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MenuController {
	@Autowired
	public MbrService mbrService;
	
	@Autowired
	public MenuService ms;
	
	@Autowired
    private RestTemplate restTemplate;
	
	@RequestMapping(value="/api/menuform", method= {RequestMethod.GET, RequestMethod.POST})
	public int MenuForm(@RequestBody MenuVO mv) {
		String emlAddr = "test1";
		
		return ms.saveMenu(mv,emlAddr);
	}
	
	@RequestMapping(value="/api/menulist", method= {RequestMethod.GET, RequestMethod.POST})
	public int MenuList() {
		return ms.getMenuList().size();
	}
	
	@RequestMapping(value="/api/menupagelist", method= {RequestMethod.GET, RequestMethod.POST})
	public MenuPageResponse MenuPageList(@RequestBody Map<String, Integer> params) {
//		int itemsPerPage = params.get("itemsPerPage");
//        int indexOfFirstItem = params.get("indexOfFirstItem");
		
//		return ms.getMenuPageList(params);
		
		return new MenuPageResponse(ms.getMenuPageList(params),ms.getMenuList().size());
		
	}
	
	
	@RequestMapping(value="/api/menudelete", method= {RequestMethod.GET, RequestMethod.POST})
	public int delete(@RequestBody MenuVO mv) {
		
		return ms.deleteMenu(mv.getNo());
	}
	@RequestMapping(value="/api/menuupdate", method= {RequestMethod.GET, RequestMethod.POST})
	public int update(@RequestBody MenuVO mv) {
		String emlAddr = "test1";
		
		return ms.updateMenu(mv,emlAddr);
	}
	
	@RequestMapping(value="/api/getmenu", method= {RequestMethod.GET, RequestMethod.POST})
	public MenuVO getMenu(@RequestBody MenuVO mv) {
		
		return ms.getMenu(mv.getNo());
	}
	
	@GetMapping("/api/menu/header")
	public List<MenuVO> MenuGrdIndex(HttpSession session,HttpServletRequest request) {
		List<MenuVO> list;
		
		if(session.getAttribute("emlAddr") != null) {
//			String emlAddr = (String) session.getAttribute("emlAddr");
//			String pswd = "1234";
			int mbrNo = (int) session.getAttribute("mbrNo");
//			
//			MbrVO mbrVo = mbrService.getMbrByLgn(emlAddr, pswd, mbrNo);
			list = ms.getMenuGrdList(mbrNo);
		}else {
			
			list = ms.getMenuGrdList(1);
		}
		
//		System.out.println(list.get(0).getMenuNm()); 
//		System.out.println(list.get(0).getMenuLnkg()); 
		
		return list;
	}
	
	@GetMapping("/api/menu/chatbot")
   @ResponseBody
   public ResponseEntity<?> chatBot() {
      System.out.println("chatbot");
      //return "redirect:https://pnedplaf2erf6isxtiof7pepz40bnvah.lambda-url.ap-northeast-2.on.aws";
      String lambdaUrl = "https://pnedplaf2erf6isxtiof7pepz40bnvah.lambda-url.ap-northeast-2.on.aws/";
        ResponseEntity<String> response = restTemplate.getForEntity(lambdaUrl, String.class);
        
        // Lambda에서 받은 데이터를 그대로 반환
        return ResponseEntity.ok(response.getBody());
   }
}
