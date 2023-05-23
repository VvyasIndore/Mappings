package com.mapping.Mappings.Mapper;

import com.mapping.Mappings.Dto.CustomerDto;
import com.mapping.Mappings.Entity.Customers;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper
{
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDto toDto(Customers customer);
    Customers toEntity(CustomerDto customerDto);
    List<CustomerDto> toListDto(List<Customers> customersList);
}
