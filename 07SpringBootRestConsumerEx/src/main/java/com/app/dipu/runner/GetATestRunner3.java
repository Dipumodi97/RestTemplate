package com.app.dipu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class GetATestRunner3 implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		
		
		// Create URL
		String url ="http://localhost:8080/v1/api/book/showD";
		
		// Create Request Headers
		
		// Create Request Body
		
		// Create RequestHeaders and Request Body
		
		// Create RestTemplate Object
		RestTemplate template = new RestTemplate();
		
		// Make Http call and Get Response Back
		
		ResponseEntity<String> response = template
				.getForEntity(url,String.class);
		
		System.out.println(response.getBody());
		System.out.println(response.getHeaders());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusCode().value());


		
	}

}
