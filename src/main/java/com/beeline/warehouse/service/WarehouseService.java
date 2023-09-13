package com.beeline.warehouse.service;

import com.beeline.warehouse.entity.Item;
import com.beeline.warehouse.entity.Warehouse;
import com.beeline.warehouse.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {
    @Autowired
    private WarehouseRepository warehouseRepository;

    public List<Warehouse> getWarehouses() {
        return warehouseRepository.findAll();
    }

    public Warehouse getWarehouseById(Integer id) {
        return warehouseRepository.findById(id).get();
    }

    public List<Warehouse> getWarehouseByName(String name) {
        return warehouseRepository.findByName(name);
    }
}
