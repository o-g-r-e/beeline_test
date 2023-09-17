package com.beeline.warehouse;

import com.beeline.warehouse.entity.Item;
import com.beeline.warehouse.entity.Warehouse;
import com.beeline.warehouse.service.ItemService;
import com.beeline.warehouse.service.WarehouseService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Transactional
class WarehouseApplicationTests {

	@Autowired
	WarehouseService warehouseService;
	@Autowired
	ItemService itemService;

	@Test
	void test() {
		List<Warehouse> warehouses = warehouseService.getWarehouses();
		Assertions.assertNotNull(warehouses);
		Assertions.assertFalse(warehouses.isEmpty());
		warehouses.forEach(w -> System.out.println(w.toString()));

		Warehouse warehouse = warehouseService.getWarehouseById(1);
		Assertions.assertNotNull(warehouse);
		System.out.println(warehouse.toString());

		warehouses = warehouseService.getWarehouseByName("Склад 3");
		Assertions.assertNotNull(warehouses);
		Assertions.assertFalse(warehouses.isEmpty());
		warehouses.forEach(w -> System.out.println(w.toString()));
		System.out.println("Items of "+warehouses.get(0).getName()+":");
		warehouses.get(0).getWarehouseItems().forEach(e -> System.out.println(e.getItem().getName() + ", count: " + e.getAmount()));

		List<Item> items = itemService.getItems();
		Assertions.assertNotNull(items);
		Assertions.assertFalse(items.isEmpty());
		items.forEach(i -> System.out.println(i.toString()));

		Item item = itemService.getItemById(1);
		Assertions.assertNotNull(item);
		System.out.println(item.toString());

		items = itemService.getItemByName("Item 5");
		Assertions.assertNotNull(items);
		Assertions.assertFalse(items.isEmpty());
		items.forEach(i -> System.out.println(i.toString()));
		System.out.println(items.get(0).getName()+" stores in warehouses:");
		items.get(0).getWarehouseItems().forEach(e -> System.out.println(e.getWarehouse().getName() + ", count: " + e.getAmount()));
	}

}
