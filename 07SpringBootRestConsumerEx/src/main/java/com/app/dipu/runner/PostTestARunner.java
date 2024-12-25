package com.app.dipu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class PostTestARunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		// create URL
		String url ="http://localhost:8080/v1/api/book/showE";
		
		// create Request Headers
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		// Crete Request Body
		
		String body ="{\"bookId\":101,\"bookName\":\"ABC\",\"bookAuth\":\"Raghu\", \"bookCost\":576.9}";
		
		// Create RequestBody and RequestHeaders(Combine both body and headers)
		HttpEntity<String> requestEntity = new HttpEntity<String>(body,headers);
		
		// Create RestTemplate Object
		RestTemplate template = new RestTemplate();
		
		// Make Http call and Get Response Back
		ResponseEntity<String> response = template.postForEntity(url, requestEntity,String.class);
	
		System.out.println(response.getBody());
		System.out.println(response.getHeaders());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusCode().value());
	}
  
}
