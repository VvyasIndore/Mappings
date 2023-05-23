package com.mapping.Mappings.Service;

import com.mapping.Mappings.Dto.OrderDto;
import com.mapping.Mappings.Entity.Order;
import com.mapping.Mappings.Entity.Student;
import com.mapping.Mappings.Mapper.OrderMapper;
import com.mapping.Mappings.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderServiceimpl implements OrderService
{
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public OrderDto createOrder(OrderDto orderDto)
    {
        Order order = orderMapper.toEntity(orderDto);
        Order savedOrder = orderRepository.save(order);
        return orderMapper.toDto(savedOrder);
    }

    @Override
    public List<OrderDto> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        return orderMapper.toListDto(orders);
    }

    @Override
    public List<Object[]> getOrderCountByCustomer() {
        return orderRepository.getOrderCountByCustomer();
    }

    @Override
    public List<Object[]> getOrdersOrderedByCustomerName() {
        return orderRepository.getOrdersOrderedByCustomerName();
    }

    @Override
    public List<Object[]> getOrderCountsByCustomerLike(String keyword) {
        return orderRepository.getOrderCountsByCustomerLike(keyword);
    }


}
