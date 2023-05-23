package com.mapping.Mappings.Service;

import com.mapping.Mappings.Dto.CustomerDto;
import com.mapping.Mappings.Dto.OrderDto;

import java.util.List;

public interface CustomerService
{
    CustomerDto createCustomer(CustomerDto customerDto);
    List<CustomerDto> getAllCustomers();
}
