package com.mapping.Mappings.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto
{
    private Long id;
    private String orderNumber;
    private CustomerDto customer;
}
