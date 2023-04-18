package com.BHoussem.springbootEcommerce.dto;

import com.BHoussem.springbootEcommerce.entity.Address;
import com.BHoussem.springbootEcommerce.entity.Customer;
import com.BHoussem.springbootEcommerce.entity.Order;
import com.BHoussem.springbootEcommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
