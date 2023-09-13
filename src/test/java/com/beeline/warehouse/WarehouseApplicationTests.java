package com.beeline.warehouse;

import com.beeline.warehouse.entity.Item;
import com.beeline.warehouse.entity.Warehouse;
import com.beeline.warehouse.service.ItemService;
import com.beeline.warehouse.service.WarehouseService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WarehouseApplicationTests {

	@Autowired
	WarehouseService warehouseService;
	@Autowired
	ItemService itemService;

	@Test
	void test() {
		List<Warehouse> warehouses = warehouseService.getWarehouses();
		Assertions.assertNotNull(warehouses);
		warehouses.forEach(w -> System.out.println(w.toString()));

		Warehouse warehouse = warehouseService.getWarehouseById(1);
		Assertions.assertNotNull(warehouse);
		System.out.println(warehouse.toString());

		warehouses = warehouseService.getWarehouseByName("Склад 3");
		Assertions.assertNotNull(warehouses);
		warehouses.forEach(w -> System.out.println(w.toString()));

		List<Item> items = itemService.getItems();
		Assertions.assertNotNull(items);
		items.forEach(i -> System.out.println(i.toString()));

		Item item = itemService.getItemById(1);
		Assertions.assertNotNull(item);
		System.out.println(item.toString());

		items = itemService.getItemByName("Item 5");
		Assertions.assertNotNull(items);
		items.forEach(i -> System.out.println(i.toString()));
	}

}
