package com.dbs.order.item.service.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dbs.order.item.service.model.Item;

@SpringBootTest
class ItemServiceTest {

	@Autowired
	private ItemService itemService;

	private static Item item;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		item = new Item();
		item.setProductName("ABC");
		item.setCost(10.0);
		item.setQuantity(11);
	}

	@Test
	void testCreateItem() {
		itemService.createItem(item);
		assertEquals("ABC", itemService.getItemInfo(1L).getProduct_name());
	}

	@Test
	void testGetItemInfo() {
		itemService.createItem(item);
		assertEquals("ABC", itemService.getItemInfo(1L).getProduct_name());
	}

	@Test
	void testUpdateItemQuantity() {
		itemService.updateItemQuantity(1L, 2);
		assertEquals(9, itemService.getItemInfo(1L).getQuantity());
	}

	@Test
	void testGetItemCost() {
		itemService.createItem(item);
		assertEquals(10.0, itemService.getItemInfo(1L).getCost());
	}

}
