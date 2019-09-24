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

@RestController
@RequestMapping("/umas")
public class TestClient1 {
	

	private Logger logger = LoggerFactory.getLogger(TestClient1.class);

	 @GetMapping
	    public ResponseEntity<Map<String, String>> extractMainImage(@RequestParam("name") String name) {
	       
	                logger.info("Printing parameter.....");
	                Map<String, String> response = new HashMap<>();
	                response.put("resposnse", name);
	                return ResponseEntity.ok(response);
	           

}
}
