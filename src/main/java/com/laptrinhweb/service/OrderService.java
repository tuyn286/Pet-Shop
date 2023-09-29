package com.laptrinhweb.service;

import com.laptrinhweb.Dto.DigitalOrderDto;

import java.util.List;

public interface OrderService {
    List<DigitalOrderDto> getCount();

    List<DigitalOrderDto> getCountProduct();
}
