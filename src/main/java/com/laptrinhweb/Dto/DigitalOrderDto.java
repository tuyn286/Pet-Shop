package com.laptrinhweb.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class DigitalOrderDto {
    private String moth;
    private Integer quantity;
}
