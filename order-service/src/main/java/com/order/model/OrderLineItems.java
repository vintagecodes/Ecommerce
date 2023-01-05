package com.order.model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="s_orderLineItems")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String skuCode;
	private double price;
	private int quantity;

}
