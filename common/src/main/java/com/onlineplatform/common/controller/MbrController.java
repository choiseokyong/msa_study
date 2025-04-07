package com.onlineplatform.common.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineplatform.common.model.InstMbrVO;
import com.onlineplatform.common.model.MbrVO;
import com.onlineplatform.common.service.MbrService;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MbrController {
	@Autowired
	private MbrService mbrService;
	
	@GetMapping("/api/mbr/index")
	public List<MbrVO> mbrIndex() {
		List<MbrVO> list = mbrService.getMbrIndex();
		
		return list;
	}
	
    
 // 로그아웃 (세션 삭제)
    @PostMapping("/api/mbr/logout")
    public ResponseEntity<Map<String, Object>> logout(HttpSession httpSession,HttpServletRequest request,HttpServletResponse response) {
    	HttpSession session = request.getSession(false); // 세션이 존재하는 경우 가져옴
	    Map<String, Object> responseBody = new HashMap<>();
	    
	    if (httpSession.getAttribute("emlAddr") != null) {
	    	
	    	httpSession.invalidate(); // 세션 무효화
	    }

	    // JSESSIONID 쿠키 삭제 (쿠키 만료)
	    Cookie cookie = new Cookie("JSESSIONID", null);
	    cookie.setMaxAge(0); // 즉시 만료
	    cookie.setPath("/"); // 쿠키 경로 설정
	    response.addCookie(cookie);

	    // 응답 헤더에 쿠키 만료 설정
	    response.setHeader("Set-Cookie", "JSESSIONID=; Path=/; HttpOnly; Max-Age=0");

	    responseBody.put("message", "Logout successful");
	    return ResponseEntity.ok(responseBody);
       
    }
	
	//로그인
	@PostMapping("/api/mbr/lgn")
	public ResponseEntity<Map<String, Object>> mbrLgn(@RequestBody MbrVO vo, HttpSession httpSession) {
		Map<String, Object> response = new HashMap<>();
		if(vo == null) return ResponseEntity.ok(response);
		
		String emlAddr = vo.getEmlAddr();
		String pswd = vo.getPswd();
		int mbrNo = vo.getMbrNo();
		String user = "";
		
		
		MbrVO loginVo = null;
		InstMbrVO instLoginVo = null;
		
		switch(mbrNo) {
		case 1 :			
		case 3 :
			loginVo = mbrService.getMbrByLgn(emlAddr, pswd, mbrNo);
			if(loginVo != null) {
				emlAddr = loginVo.getEmlAddr();
				user = loginVo.getUser();
				mbrNo = loginVo.getMbrNo();
			}
			break;
			
		case 2:
			instLoginVo = mbrService.getInstMbrByLgn(emlAddr, pswd, mbrNo);
			if(instLoginVo != null) {
				emlAddr = instLoginVo.getInstEmlAddr();
				user = instLoginVo.getUser();
				mbrNo = instLoginVo.getMbrNo();
			}
			break;
		}
		
		if(loginVo == null && instLoginVo == null) {
			//실패 시 0
			return ResponseEntity.ok(response);
		} else {
			
			httpSession.setAttribute("emlAddr", emlAddr);
			httpSession.setAttribute("user", user);
			httpSession.setAttribute("mbrNo", mbrNo);
			
//			Object member=httpSession.getAttribute("emlAddr");
			
			response.put("sessionId", httpSession.getId());
	        response.put("emlAddr", httpSession.getAttribute("emlAddr"));
	        response.put("mbrNo", httpSession.getAttribute("mbrNo"));
	        
			//성공 시 1 반환
//			return ResponseEntity.ok().header("Set-Cookie", "JSESSIONID=" + httpSession.getId()).body(response);
			return ResponseEntity.ok().header("Set-Cookie", "JSESSIONID=" + httpSession.getId() + "; Path=/; HttpOnly; SameSite=None; Secure").body(response);

		}
	}
	
}
