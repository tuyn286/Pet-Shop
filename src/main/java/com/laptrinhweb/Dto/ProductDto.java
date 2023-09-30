package com.laptrinhweb.Dto;

import com.laptrinhweb.entity.CategoryEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private int productId;
    private String productName;
    private String description;
    private Double price;
    private String image;
    private String categoryEntityCategoryName;
    private String categoryEntityCategoryId;
    private int quantity;
}
