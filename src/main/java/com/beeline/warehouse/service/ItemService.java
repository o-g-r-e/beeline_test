package com.beeline.warehouse.service;

import com.beeline.warehouse.entity.Item;
import com.beeline.warehouse.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getItems() {
        return itemRepository.findAll();
    }

    public Item getItemById(Integer id) {
        return itemRepository.findById(id).get();
    }

    public List<Item> getItemByName(String name) {
        return itemRepository.findByName(name);
    }
}
