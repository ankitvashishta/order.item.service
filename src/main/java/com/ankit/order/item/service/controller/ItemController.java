package com.ankit.order.item.service.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ankit.order.item.service.entity.ItemInfo;
import com.ankit.order.item.service.model.Item;
import com.ankit.order.item.service.service.ItemService;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

	@Autowired
	private ItemService itemService;

	/**
	 * Create item.
	 * 
	 * @param item
	 * @return
	 */
	@PostMapping("/create")
	public ItemInfo createItem(@Valid @RequestBody Item item) {
		return itemService.createItem(item);
	}

	/**
	 * Get item info.
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}/info")
	public ItemInfo getItemInfo(@PathVariable Long id) {
		return itemService.getItemInfo(id);
	}

	/**
	 * Update item quantity after an order.
	 * 
	 * @param id
	 * @param quantity
	 * @return
	 */
	@PutMapping("/{id}/update")
	public boolean updateItemQuantity(@PathVariable Long id, @NotBlank @RequestParam Integer quantity) {
		return itemService.updateItemQuantity(id, quantity);
	}

	/**
	 * Get the cost of the item.
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}/cost")
	public Double getItemCost(@PathVariable Long id) {
		return itemService.getItemCost(id);
	}

	/**
	 * Get All items.
	 * 
	 * @return
	 */
	@GetMapping("/all/items")
	public List<ItemInfo> getAllItems() {
		return itemService.getAllItems();
	}

}
