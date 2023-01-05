package com.order.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.order.dto.OrderLineItemsDto;
import com.order.dto.OrderRequest;
import com.order.model.Order;
import com.order.model.OrderLineItems;
import com.order.repository.OrderRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {
	
	private final OrderRepository orderRepository;
	
	public void placeOrder(OrderRequest orderRequest) {
		Order order = new Order();
		order.setOrderNumber(UUID.randomUUID().toString());
		
		List<OrderLineItems> orderLineItems =  orderRequest.getOrderLineItemsList().stream().map(this::mapToDto).toList();
		
		
		order.setOrderLineItems(orderLineItems);
		orderRepository.save(order);
	}
	
	private OrderLineItems mapToDto(OrderLineItemsDto dto) {
		OrderLineItems orderLineItems = new OrderLineItems();
		orderLineItems.setPrice(dto.getPrice());
		orderLineItems.setQuantity(dto.getQuantity());
		orderLineItems.setSkuCode(dto.getSkuCode());
		return orderLineItems;
	}

}
