package com.app.dipu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.app.dipu.entity.BookAtConsumer;

@Component
public class GetTestBRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		// to create Url of another application IDE
		
		// 1. create URL
		
		String url = "http://localhost:8080/v1/api/book/showC";
		
		//2. create Request Headers
		
		// 3. Create Request Body
		
		// 2+3(Request Headers + Request Body)
		
		
		// 4. Create RestTemplate Object
		
		RestTemplate template = new RestTemplate();
		
		//5. Make HTTP Call and Get Response Back
		/**
		 * I'm expected to 'Text' format then we have to use to convert String.class
		 * I'm expected to 'Json' format then we have to convert to Object(ClassName)class.
		 * I'm expected to List of'Json' format then we have to convert to List<Object>.class.
		 */
		//ResponseEntity<String> response= template.getForEntity(url, String.class);// URL,ResponseFormat.class
		ResponseEntity<BookAtConsumer> response= template.getForEntity(url, BookAtConsumer.class);// URL,ResponseFormat.class
		
		//6. to print details
		
		System.out.println(response.getBody());
		System.out.println(response.getHeaders());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusCode().value());

	}

}
