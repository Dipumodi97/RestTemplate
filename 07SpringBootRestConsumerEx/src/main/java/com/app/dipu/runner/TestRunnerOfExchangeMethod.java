package com.app.dipu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class TestRunnerOfExchangeMethod implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		// Create URL
		String url = "http://localhost:8080/v1/api/book/showB/{id}/{name}";

		// Create Request Headers

		// Create Request Headers

		// Create RequestHeaders and Request Body

		// Create RestTemplate Object
		RestTemplate template = new RestTemplate();

		// Make Http call and Get Response Back

		ResponseEntity<String> response = template.
				exchange(url,HttpMethod.GET,null, String.class, 101, "Dipu");

		System.out.println(response.getBody());
		System.out.println(response.getHeaders());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusCode().value());

		// System.out.println(response.getBody());
//		System.out.println(response.getHeaders());
//		System.out.println(response.getStatusCode());
//		System.out.println(response.getStatusCode().value());

	}

}
