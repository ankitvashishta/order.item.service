package com.ankit.order.item.service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.ankit.order.item.service.model.Item;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "item_info")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ItemInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long product_code;
	@NotBlank(message = "Empty Product Name!")
	private String product_name;
	@Min(value = 1, message = "Provide Valid Product Cost!")
	private Double cost;
	@Min(value = 1, message = "Provide Valid Product Quantity!")
	private Integer quantity;

	public ItemInfo(Item item) {
		this.product_name = item.getProductName();
		this.cost = item.getCost();
		this.quantity = item.getQuantity();
	}

}
