package com.beeline.warehouse.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "warehouse_item")
public class WarehouseItem {

    @EmbeddedId
    private WarehouseItemId warehouseItemId;

    @ManyToOne
    @MapsId("warehouseId")
    private Warehouse warehouse;

    @ManyToOne
    @MapsId("itemId")
    private Item item;

    @Column(name = "amount")
    private Integer amount;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}