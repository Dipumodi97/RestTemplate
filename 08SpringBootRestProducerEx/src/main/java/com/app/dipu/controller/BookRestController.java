package com.app.dipu.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dipu.entity.Book;

@RestController
@RequestMapping("/v1/api/book")
public class BookRestController {

	@GetMapping("/showA")
	public ResponseEntity<String> showMsg1(){
		
		// return new ResponseEntity<String>("Welcome",HttpStatus.OK);
		              // try to another way
		return ResponseEntity.ok("Welcome");
	}
	
	@GetMapping("/showB/{id}/{name}")
	public ResponseEntity<String> showMsg2(
			@PathVariable Integer id,
			@PathVariable String name
			){
		
		// return new ResponseEntity<String>("Welcome",HttpStatus.OK);
		              // try to another way
		return ResponseEntity.ok("Welcome to Get Type==>"+id+" - "+name);
	}
	
	@GetMapping("/showC")
	public ResponseEntity<Book> showMsg3(){
		
		// return new ResponseEntity<String>("Welcome",HttpStatus.OK);
		              // try to another way
		return ResponseEntity.ok(new Book(101,"Java","Dipu",980.95));
	}
	
	@GetMapping("/showD")
	public ResponseEntity<List<Book>> showMsg4()
	{
		
		List<Book> books = Arrays.asList(
				new Book(12, "java", "dipu", 890.0),
				new Book(13, "python", "dounge", 9867.9),
				new Book(12, "dev", "raune", 346.65),
				new Book(12, "java ", "john", 855.8)
				
				);
		
//		ResponseEntity<Book> response = new ResponseEntity<Book>(
//				Arrays.asList(new Book(12, "java", "dipu", 890.0)).
//				HttpStatus.OK
//				);
		
		//return response;
		
		// return new ResponseEntity<String>("Welcome",HttpStatus.OK);
		              // try to another way
		return ResponseEntity.ok(books);
	}
	
	// --------------POST Mapping examples--------------
	
	@PostMapping("/showE")
	public ResponseEntity<String> getMsg5(
			@RequestBody Book book
			)
	{
		return ResponseEntity.ok("Data Given is  :"+book.toString());
		
	}
	
	//---------PUT/DELETE Examples
	@PutMapping("/showF")
	public ResponseEntity<String> showMsg6(
	         @RequestBody Book book
			)
	{
		return ResponseEntity.ok("Data From PUT is :"+book);
	}
	
	@DeleteMapping("/showG/{id}")
	public ResponseEntity<String> showMsg7(@PathVariable("id") Integer id){
		
		return ResponseEntity.ok("Delete mapping :"+id);
	}
}
