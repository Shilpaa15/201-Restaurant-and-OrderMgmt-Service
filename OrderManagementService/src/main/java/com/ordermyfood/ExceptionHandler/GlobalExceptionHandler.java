package com.ordermyfood.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.ordermyfood.Exception.OrderException;
public class GlobalExceptionHandler {
	Map<String, Object> response;
	@ExceptionHandler(OrderException.class)
	protected ResponseEntity<Map<String, Object>> handleConflict(OrderException ex) {
		response = new HashMap<String, Object>();
		response.put("message", ex.getMessage());
		response.put("Status", HttpStatus.BAD_REQUEST);
		response.put("body", null);
		response.put("Error", true);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
}
