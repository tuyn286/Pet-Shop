package com.laptrinhweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
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

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public CategoryEntity getCategoryEntity() {
        return categoryEntity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCategoryEntity(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
