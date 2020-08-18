package com.dbs.order.item.service.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.order.item.service.entity.ItemInfo;
import com.dbs.order.item.service.model.Item;
import com.dbs.order.item.service.repository.ItemRepository;

import javax.ws.rs.NotFoundException;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;

	public ItemInfo createItem(Item item) {
		ItemInfo itemInfo = new ItemInfo(item);
		return itemRepository.save(itemInfo);
	}

	public ItemInfo getItemInfo(Long id) {
		Optional<ItemInfo> itemInfo = itemRepository.findById(id);
		if (itemInfo.isPresent())
			return itemInfo.get();
		throw new NotFoundException("Item Not Found");
	}

	public boolean updateItemQuantity(Long id, Integer quantity) {
		Optional<ItemInfo> itemInfo = itemRepository.findById(id);
		if (itemInfo.isPresent()) {
			ItemInfo item = itemInfo.get();
			item.setQuantity(item.getQuantity() - quantity);
			itemRepository.save(item);
			return true;
		}
		throw new NotFoundException("Item Not Found");
	}

	public Double getItemCost(Long id) {
		Optional<ItemInfo> itemInfo = itemRepository.findById(id);
		if (itemInfo.isPresent()) {
			ItemInfo item = itemInfo.get();
			return item.getCost();
		}
		throw new NotFoundException("Item Not Found");
	}

	public List<ItemInfo> getAllItems() {
		List<ItemInfo> items = new ArrayList<>();
		itemRepository.findAll().iterator().forEachRemaining(items::add);
		return items;
	}

}
