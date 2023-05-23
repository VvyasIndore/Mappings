package com.mapping.Mappings.Service;

import com.mapping.Mappings.Dto.CustomerDto;
import com.mapping.Mappings.Dto.OrderDto;
import com.mapping.Mappings.Entity.Customers;
import com.mapping.Mappings.Entity.Order;
import com.mapping.Mappings.Mapper.CustomerMapper;
import com.mapping.Mappings.Mapper.OrderMapper;
import com.mapping.Mappings.Repository.CustomerRepository;
import com.mapping.Mappings.Repository.OrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerServiceimpl  implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private OrderMapper orderMapper;


    @Transactional
    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
    Customers customers =  customerMapper.toEntity(customerDto);
    List<Order> orders = new ArrayList<>();
        for (OrderDto orderDto : customerDto.getOrders()) {
            Order order = orderMapper.toEntity(orderDto);
            order.setCustomer(customers);
            orders.add(order);
        }

        customers.setOrders(orders);

    Customers savedCustomers=  customerRepository.save(customers);
    return customerMapper.toDto(savedCustomers);
    }

    @Override
    public List<CustomerDto> getAllCustomers()
    {
        List<Customers>  customers   =   customerRepository.findAll();
        return customerMapper.toListDto(customers);
    }
}
