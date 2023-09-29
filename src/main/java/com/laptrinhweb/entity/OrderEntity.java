package com.laptrinhweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {
    @Id
    @GeneratedValue
    private Integer orderId;
    private Date orderDate;
    private int orderNumber;
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserEntity userEntity;
    private long totalAmount;
    private OrderStatus orderStatus;
}
