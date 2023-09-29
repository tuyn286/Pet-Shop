package com.laptrinhweb.service.serviceImpl;

import com.laptrinhweb.Dto.DigitalOrderDto;
import com.laptrinhweb.entity.OrderEntity;
import com.laptrinhweb.repository.OrderRepository;
import com.laptrinhweb.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    @Override
    public List<DigitalOrderDto> getCount() {
        List<DigitalOrderDto> digitalOrderDtos=new ArrayList<>();
        List<OrderEntity> orderEntities=orderRepository.findAll();
        for (OrderEntity order: orderEntities
             ) {
            Calendar calendar=Calendar.getInstance();
            calendar.setTime(order.getOrderDate());
            int moth= calendar.get(Calendar.MONTH);
            if(digitalOrderDtos.stream().noneMatch(digitalOrderDto ->
                digitalOrderDto.getMoth().equals(Integer.toString(moth))
            ))
                digitalOrderDtos.add(DigitalOrderDto.builder().moth(Integer.toString(moth)).quantity(1).build());
            else{
                var orderDto=digitalOrderDtos.stream().filter(digitalOrderDto -> digitalOrderDto.getMoth()
                        .equals(Integer.toString(moth))).findFirst().orElseThrow();
                orderDto.setQuantity(orderDto.getQuantity()+1);
                digitalOrderDtos.add(orderDto);
            }
        }
        return digitalOrderDtos;
    }

    @Override
    public List<DigitalOrderDto> getCountProduct() {

        List<DigitalOrderDto> digitalOrderDtos=new ArrayList<>();
        List<OrderEntity> orderEntities=orderRepository.findAll();
        for (OrderEntity order: orderEntities
        ) {
            Calendar calendar=Calendar.getInstance();
            calendar.setTime(order.getOrderDate());
            int moth= calendar.get(Calendar.MONTH);
            if(digitalOrderDtos.stream().noneMatch(digitalOrderDto ->
                    digitalOrderDto.getMoth().equals(Integer.toString(moth))
            ))
                digitalOrderDtos.add(DigitalOrderDto.builder().moth(Integer.toString(moth)).quantity(order.getOrderNumber()).build());
            else{
                var orderDto=digitalOrderDtos.stream().filter(digitalOrderDto -> digitalOrderDto.getMoth()
                        .equals(Integer.toString(moth))).findFirst().orElseThrow();
                orderDto.setQuantity(orderDto.getQuantity()+order.getOrderNumber());
                digitalOrderDtos.add(orderDto);
            }
        }
        return digitalOrderDtos;
    }
}
