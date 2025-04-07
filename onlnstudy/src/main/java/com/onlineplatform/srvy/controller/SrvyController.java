package com.onlineplatform.srvy.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlineplatform.srvy.model.SrvyResultVO;
import com.onlineplatform.srvy.model.SrvyVO;
import com.onlineplatform.srvy.service.SrvyService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController // 추가: RESTful API를 위한 어노테이션
public class SrvyController {

    @Autowired
    public SrvyService srvyService;
    
    // 기관회원이 해당 강좌에 대하여 설문조사를 등록하는 곳
    @RequestMapping(value = "/api/SrvyReg", method = {RequestMethod.POST})
    public void insertSrvy(@RequestBody Map<String, Object> requestBody) {
        String instEmlAddr = (String) requestBody.get("instEmlAddr");
        String lctrSeq = (String) requestBody.get("lctrSeq");
        String seq = (String) requestBody.get("seq");
        List<Map<String, String>> submittedSrvys = (List<Map<String, String>>) requestBody.get("submittedSrvys");

        for (Map<String, String> survey : submittedSrvys) {
            SrvyVO vo = new SrvyVO();
            vo.setInstEmlAddr(instEmlAddr);
            vo.setLctrSeq(lctrSeq);
            vo.setSeq(seq);
            vo.setSrvyType(survey.get("svyType"));
            vo.setSrvyCn(survey.get("srvyCn"));
            vo.setcHc(survey.get("cHc"));
            
            srvyService.insertSrvy(vo);
        }
    }
    
    // 기관회원이 해당 강좌에 대하여 설문조사를 수정하는 곳
    @RequestMapping(value = "/api/SrvyUpdate", method = {RequestMethod.POST})
    public void updateSrvy(@RequestBody Map<String, Object> requestBody) {
        String instEmlAddr = (String) requestBody.get("instEmlAddr");
        String lctrSeq = (String) requestBody.get("lctrSeq");
        String seq = (String) requestBody.get("seq");
        List<Map<String, String>> submittedSrvys = (List<Map<String, String>>) requestBody.get("submittedSrvys");
        System.out.println("asdasdasd");
        srvyService.deleteSrvy(lctrSeq, seq, instEmlAddr);
        
        for (Map<String, String> survey : submittedSrvys) {
            SrvyVO vo = new SrvyVO();
            vo.setInstEmlAddr(instEmlAddr);
            vo.setLctrSeq(lctrSeq);
            vo.setSeq(seq);
            vo.setSrvyType(survey.get("svyType"));
            vo.setSrvyCn(survey.get("srvyCn"));
            vo.setcHc(survey.get("cHc"));
            
            srvyService.insertSrvy(vo);
        }
    }
    
    // 기관이 해당 강좌에 대하여 등록되어있는 설문지를 삭제하는 곳
    @RequestMapping(value = "/api/SrvyDelete", method = {RequestMethod.POST})
    public void deleteSrvy(
    		@RequestParam String lctrSeq, 
    		@RequestParam String seq, 
    		@RequestParam String instEmlAddr) {
    	
    	srvyService.deleteSrvy(lctrSeq, seq, instEmlAddr);
    }
    
    // 기관회원이 업로드 한 설문조사를 수정하기 위해서 리스트를 가져오는 곳
    @RequestMapping(value = "/api/GetSurveyData", method = {RequestMethod.GET})
    public ArrayList<SrvyVO> updateSrvy(
    		@RequestParam String lctrSeq, 
    		@RequestParam String seq, 
    		@RequestParam String instEmlAddr) {
    	
    	ArrayList<SrvyVO> srvy = srvyService.forupdateSrvy(lctrSeq, seq, instEmlAddr);
    	
	    return srvy;
    }
    
    
    
    
    // 기관회원이 일반회원들이 작성한 설문지를 통계화해서 보여주는 API
    @RequestMapping(value = "/api/SrvyRslt", method = RequestMethod.GET)
    public List<SrvyResultVO> getSurveyResults(
            @RequestParam("lctrSeq") String lctrSeq, 
            @RequestParam("seq") String seq) {

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("lctrSeq", lctrSeq);
        paramMap.put("seq", seq);

        //System.out.println("🔍 getSurveyResults 요청 파라미터: " + paramMap);

        List<SrvyResultVO> results = srvyService.getSurveyResults(paramMap);

        //System.out.println("📊 설문 통계 API 응답 데이터: " + results);

        return results;
    }


    
    
    
    
    // 일반 회원이 설문조사지를 받아서 화면에 띄워주는 곳
    @RequestMapping(value = "/api/UserGetSrvy", method = {RequestMethod.GET})
    public ArrayList<SrvyVO> getSrvy(
    		@RequestParam String lctrSeq, 
    		@RequestParam String seq, 
    		@RequestParam String instEmlAddr) {
    	
    	ArrayList<SrvyVO> srvy = srvyService.getSrvy(lctrSeq, seq, instEmlAddr);
	    return srvy;
    }
    
    // 일반 회원이 설문조사지를 다 작성 후 보내는 곳
    @RequestMapping(value = "/api/SubmitSrvy", method = {RequestMethod.POST})
    public void submitSrvy(@RequestBody Map<String, Object> requestBody) {
        String lctrSeq = String.valueOf(requestBody.get("lctrSeq"));
        String seq = String.valueOf(requestBody.get("seq"));
        
        List<Map<String, String>> submittedSrvys = (List<Map<String, String>>) requestBody.get("submittedSrvys");
        
        for (Map<String, String> surveyRslt : submittedSrvys) {
            SrvyResultVO vo = new SrvyResultVO();
            vo.setLctrSeq(lctrSeq);
            vo.setSeq(seq);
            vo.setUserEmlAddr(surveyRslt.get("userEmlAddr"));
            vo.setChcRslt(surveyRslt.get("chcRslt"));
            vo.setRegDate(LocalDateTime.now());
            vo.setSrvyNo(Integer.parseInt(surveyRslt.get("surveyNo")));

            srvyService.insertSrvyResult(vo); // DB 저장
        }

    }


}
