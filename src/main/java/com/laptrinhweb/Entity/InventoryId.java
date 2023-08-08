package com.laptrinhweb.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class InventoryId implements Serializable {
    @Column(name = "sku_code")
    private String skuCode;
    @Column(name = "product_id")
    private int productId;
}
