package com.ankit.order.item.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ankit.order.item.service.entity.ItemInfo;

@Repository
public interface ItemRepository extends CrudRepository<ItemInfo, Long> {
}