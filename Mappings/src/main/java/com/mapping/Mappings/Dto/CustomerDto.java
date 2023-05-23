package com.mapping.Mappings.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto
{
    private Long id;
    private String name;
    private List<OrderDto> orders;
}
