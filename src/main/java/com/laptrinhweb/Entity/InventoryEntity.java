package com.laptrinhweb.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryEntity {
    @Id
    @OneToOne
    @JoinColumn(name = "productId")
    private ProductEntity product;
    private int quantity;
    private String location;
}
