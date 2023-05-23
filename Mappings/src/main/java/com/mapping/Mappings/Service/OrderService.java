package com.mapping.Mappings.Service;

import com.mapping.Mappings.Dto.OrderDto;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderService
{
    OrderDto createOrder(OrderDto orderDto);
    List<OrderDto> getAllOrders();

    List<Object[]> getOrderCountByCustomer();

    List<Object[]> getOrdersOrderedByCustomerName();

    List<Object[]> getOrderCountsByCustomerLike(String keyword);

}
