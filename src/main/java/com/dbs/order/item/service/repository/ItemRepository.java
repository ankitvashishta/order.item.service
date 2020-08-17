package com.dbs.order.item.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dbs.order.item.service.entity.ItemInfo;

@Repository
public interface ItemRepository extends CrudRepository<ItemInfo, Long> {
}