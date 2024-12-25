package com.app.dipu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookAtConsumer {

//order can be any order but name should be match by both side at Consumer and Producer
	private Integer bookId;
	private String bookName;
	private String bookAuth;
	private Double bookCost;
}
