package com.app.dipu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class PutTestARunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		String url = "http://localhost:8080/v1/api/book/showF";
		
		
		// to construct request head and body
		String body ="{\"bookId\":101,\"bookName\":\"ABC\",\"bookAuth\":\"Raghu\", \"bookCost\":576.9}";

		// to create headers
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		
		// combine head and body using HttpEntity
		
		HttpEntity<String> requestEntity = new HttpEntity<String>(body,header);
		
		// create RestTemplate
		RestTemplate template = new RestTemplate();
		
		// This method makes request, but returns no body(void)
		// template.put(url, requestEntity);
		
		    // or
		ResponseEntity<String> responseEntity = template.exchange(url,HttpMethod.PUT, requestEntity,String.class);

		System.out.println(responseEntity.getBody());
		System.out.println(responseEntity.getHeaders());
		System.out.println(responseEntity.getStatusCode());
		System.out.println(responseEntity.getStatusCode().value());
	}

}
