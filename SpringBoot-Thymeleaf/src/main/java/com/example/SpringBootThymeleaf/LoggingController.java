package com.example.SpringBootThymeleaf;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
	org.slf4j.Logger logger = LoggerFactory.getLogger(LoggingController.class);
	@RequestMapping("/log")
	public Map<String,Object> hello(){
		Map<String , Object> result = new HashMap<>();
		result.put("name", "Abhi Mishra");
		logger.info("This is a Info-message");
		logger.warn("This is Warning");
		logger.error("this is error Message");
		return result;
	}

}
