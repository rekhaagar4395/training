package com.example.ex2;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/umas")
public class TestClient1 {
	

	private Logger logger = LoggerFactory.getLogger(TestClient1.class);

	 @GetMapping
	    public ResponseEntity<Map<String, String>> extractMainImage() {
		 RestTemplate restTemplate = new RestTemplate();
		 String msg = "Welcome ";
		 msg = msg + restTemplate.getForEntity("http://data-svc:8081/welcome", String.class).getBody();
		 logger.info("Receiced response from ex2 {}",msg);
		 Map<String, String> response = new HashMap<>();
	     response.put("welcomemsg", msg);
	     return ResponseEntity.ok(response);
}
}
