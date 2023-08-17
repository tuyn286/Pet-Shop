package com.laptrinhweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
    @Id
    @GeneratedValue
    private int productId;
    private String productName;
    private String description;
    private Double price;
    private String image;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private CategoryEntity categoryEntity;
    private int quantity;
}
