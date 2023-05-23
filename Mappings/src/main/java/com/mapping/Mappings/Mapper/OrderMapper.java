package com.mapping.Mappings.Mapper;

import com.mapping.Mappings.Dto.OrderDto;
import com.mapping.Mappings.Entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper
{
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderDto toDto(Order order);


    Order toEntity(OrderDto orderDto);
    List<OrderDto> toListDto(List<Order> orders);
}
