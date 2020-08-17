package com.dbs.order.item.service.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@RequiredArgsConstructor
@ToString
public class Item {

	@NotBlank(message = "Empty Product Name!")
	private String productName;
	@Min(value = 1, message = "Provide Valid Product Cost!")
	private Double cost;
	@Min(value = 1, message = "Provide Valid Product Quantity!")
	private Integer quantity;

}
