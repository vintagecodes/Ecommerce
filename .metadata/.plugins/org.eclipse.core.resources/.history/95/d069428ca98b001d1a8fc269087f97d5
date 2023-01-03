package com.shopping.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {
	
	@Transient
	public static final String SEQUENCE_NAME = "product_sequence";
	
	@Id
	private int id;
	private String name;
	private String description;
	private double price;
	

}
