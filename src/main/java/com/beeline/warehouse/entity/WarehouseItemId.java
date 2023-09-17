package com.beeline.warehouse.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;

import java.io.Serializable;

@Embeddable
public class WarehouseItemId implements Serializable {

    private static final long serialVersionUID = 1310522732424787840L;
    private Integer warehouseId;
    private Integer itemId;

    public WarehouseItemId() {}

    public WarehouseItemId(Integer warehouseId, Integer itemId) {
        this.warehouseId = warehouseId;
        this.itemId = itemId;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
}
