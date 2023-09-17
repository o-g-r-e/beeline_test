package com.beeline.warehouse.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "price")
    private Double price;

    @OneToMany(mappedBy = "item")
    private Set<WarehouseItem> warehouseItems;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Set<WarehouseItem> getWarehouseItems() {
        return warehouseItems;
    }

    public void setWarehouseItems(Set<WarehouseItem> warehouseItems) {
        this.warehouseItems = warehouseItems;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", price=" + price +
                '}';
    }
}