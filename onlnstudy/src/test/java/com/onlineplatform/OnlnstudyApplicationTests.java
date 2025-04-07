package com.onlineplatform;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.onlineplatform.controller.AttendanceController;
import com.onlineplatform.model.AttendanceVO;
import com.onlineplatform.service.AttendanceService;

import jakarta.servlet.http.HttpServletRequest;

@SpringBootTest
class OnlnstudyApplicationTests {
	   @Autowired
	    private AttendanceController attendanceController;


	    @Mock
	    private HttpServletRequest request;

	    @BeforeEach
	    public void setUp() {
	        MockitoAnnotations.openMocks(this);
	    }

	    @Test
	    public void testCreateAtnd() {
	        // Mocking the request to return a specific IP address
	        when(request.getRemoteAddr()).thenReturn("192.168.0.1");

	        // Test data for AttendanceVO
	        AttendanceVO attendanceVO = new AttendanceVO();
	        attendanceVO.setSeq(null);
	        attendanceVO.setInstEmlAddr("inst_user1@example.com");
	        attendanceVO.setLctrSeq(3);
	        attendanceVO.setLctrObjt(2);

	        // Call the method to be tested
	        attendanceController.createAtnd(request, attendanceVO);

	    }
}
