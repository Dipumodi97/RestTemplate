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
public class DeleteTestARunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		// create url
		String url = "http://localhost:8080/v1/api/book/showG/{id}";
		
		// create body
//		String body ="{\"bookId\":101,\"bookName\":\"ABC\",\"bookAuth\":\"Raghu\", \"bookCost\":576.9}";

		// create Http  Headers
//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON);
//		
//		// combine header and body
//		HttpEntity<String> requestEntity = new HttpEntity<>(body,headers);
		
		// create RestTemplate
		RestTemplate template = new RestTemplate();
		
		//template.delete(url,101);// not get any response so we use ,
		// ResponseEntity<> of exchange method
		
		//System.out.println(template);
		ResponseEntity<String> response = template.exchange(url, HttpMethod.DELETE, null, String.class,101);
		
		System.out.println(response.getBody());
		System.out.println(response.getHeaders());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusCode().value());

	}

}
