package com.onlineplatform.exam.service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.onlineplatform.exam.mapper.ExamMapper;
import com.onlineplatform.exam.model.ExamVO;


	@Service
	public class ExamService {
	@Autowired
	public ExamMapper testMapper;
	
	
//	public List<TestVO> getUserList() {
//		return testMapper.selectUserList();
//	}
	
	// 긴관 혹은 관리자가 시험지를 업로드 하는 부분
//	public void saveTest(ExamVO testvo) {
//		testMapper.insertTest(testvo);
//	}
	
	@Transactional
	public void saveTest(MultipartFile file, Path path, int lctrSeq, int seq, String instEmlAddr) throws IOException {
	    String filePath = path.toString();
	    
	    try (InputStream is = file.getInputStream()) {
	        Workbook workbook = WorkbookFactory.create(is);
	        Sheet sheet = workbook.getSheetAt(0);

	        // 동일한 lctrNo와 instEmlAddr를 가진 데이터를 삭제
	        testMapper.deleteTestByLctrSeqAndInst(lctrSeq, seq, instEmlAddr);
	        
	        for (Row row : sheet) {
	            if (row.getRowNum() == 0) continue;
	            
	            try {
	                // 셀 값이 null인지 체크
	                String qitemType = row.getCell(0) != null ? row.getCell(0).getStringCellValue() : null;
	                String qitemCn = row.getCell(1) != null ? row.getCell(1).getStringCellValue() : null;
	                String chC = row.getCell(2) != null ? row.getCell(2).getStringCellValue() : null;
	                String crAns = row.getCell(3) != null ? row.getCell(3).getStringCellValue() : null;

	                ExamVO exam = new ExamVO();
	                exam.setLctrSeq(lctrSeq);
	                exam.setSeq(seq);
	                exam.setInstEmlAddr(instEmlAddr);
	                exam.setQitemType(qitemType);
	                exam.setQitemCn(qitemCn);
	                exam.setCHc(chC);
	                exam.setCrAns(crAns);
	                exam.setRegDate(new Date());
	                exam.setFilePath(filePath);
	                
	                // 데이터베이스에 저장
	                try {
	                    testMapper.insertTest(exam);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            } catch (Exception e) {
	                System.out.println("행 처리 중 오류 발생: " + e.getMessage());
	            }
	        }
	    } catch (IOException e) {
	        System.out.println("파일 처리 중 오류 발생: " + e.getMessage());
	        throw e;
	    }
	}
    
	
	// 일반 회원이 시험을 보기 위해 시험지를 받아오는 함수
	public ArrayList<ExamVO> getTest(int lctrSeq, int seq, String instEmlAddr) {
		return testMapper.selectBylctrNoAnduserEmail(lctrSeq, seq, instEmlAddr);
	}
	
	// 기관 혹은 관리자가 업로드된 테스트를 삭제하는 함수
	public void deleteTest(Integer lctrSeq, Integer seq, String userEmail) {
		testMapper.deleteTestByLctrSeqAndInst(lctrSeq, seq, userEmail);
	}

}
