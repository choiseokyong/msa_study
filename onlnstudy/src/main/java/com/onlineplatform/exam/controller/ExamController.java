package com.onlineplatform.exam.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.onlineplatform.exam.model.ExamVO;
import com.onlineplatform.exam.service.ExamService;

import jakarta.servlet.http.HttpSession;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ExamController {
	
	@Autowired
    public ExamService testService;

	// 일반회원이 시험을 보는 페이지로 이동
	@RequestMapping(value="/api/UserTest", method={RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public ArrayList<ExamVO> getform(@RequestParam Integer lctrSeq, @RequestParam Integer seq, @RequestParam String instEmlAddr) {
	    // lctrNo(강좌번호) instEmlAddr(기관 이메일)로 사용자 정보 가져오기
	    ArrayList<ExamVO> tv2 = testService.getTest(lctrSeq, seq, instEmlAddr);
	    return tv2;
	}
	
	@RequestMapping(value="/api/delete", method={RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public void delete(@RequestBody ExamVO tv) {
		testService.deleteTest(tv.getLctrSeq(), tv.getSeq(), tv.getInstEmlAddr()); // 해당 강좌 번호와 업로드 한 기관 이메일로 삭제
	}
	
//	@RequestMapping(value="/api/insertTest", method={RequestMethod.GET, RequestMethod.POST})
//	public void signup(@RequestBody ExamVO tv) {
//		testService.saveTest(tv); // TestVO 전체를 저장
//	}

	
	// 엑셀 업로드로 시험지 등록
	@RequestMapping(value = "/api/insertTest", method = {RequestMethod.GET, RequestMethod.POST})
	public String uploadExamFile(@RequestParam("file") MultipartFile file,
	                              @RequestParam("lctrSeq") int lctrSeq,
	                              @RequestParam("seq") int seq,
	                              HttpSession httpSession) {
	    // String instEmlAddr = httpSession.getAttribute("session_name") + "";
	    String instEmlAddr = "inst_user1@example.com";
	    byte[] bytes;
	    
	    if (file.isEmpty()) {
	        return "파일이 비어 있습니다.";
	    }

	    try {
	        bytes = file.getBytes();
	        Path path = Paths.get("src/main/resources/static/exams/" + file.getOriginalFilename());
	        Files.write(path, bytes);

	        // 데이터베이스에 저장
	        testService.saveTest(file, path, lctrSeq, seq, instEmlAddr);
	        return "파일 업로드 성공";
	    } catch (IOException e) {
	        return "파일 업로드 실패: " + e.getMessage();
	    } catch (Exception e) {
	        return "예기치 않은 오류 발생: " + e.getMessage();
	    }
	}

//	@RequestMapping(value="/api/SubmitTest", method={RequestMethod.GET, RequestMethod.POST})
//	@ResponseBody
//	public List<ExamVO> list() {
//		List<ExamVO> list = testService.getUserList();	
//		return list;
//	}
	
	
	
//	@RequestMapping(value="/userlist", method={RequestMethod.GET, RequestMethod.POST})
//	public ModelAndView userlist() {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("/user/userlist");
//		return mav;
//	}
	
//	@RequestMapping(value="/api/list", method={RequestMethod.GET, RequestMethod.POST})
//	@ResponseBody
//	public List<ExamVO> list() {
//		List<ExamVO> list = testService.getUserList();	
//		return list;
//	}
}