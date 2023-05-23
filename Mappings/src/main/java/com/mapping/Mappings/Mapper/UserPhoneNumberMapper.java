package com.mapping.Mappings.Mapper;

import com.mapping.Mappings.Dto.PhoneNumbersDto;
import com.mapping.Mappings.Dto.UserDto;
import com.mapping.Mappings.Entity.PhoneNumbers;
import com.mapping.Mappings.Entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserPhoneNumberMapper
{
    UserPhoneNumberMapper INSTANCE = Mappers.getMapper(UserPhoneNumberMapper.class);
    UserDto toDto(User user);
    User toEntity(UserDto userDTO);
    List<UserDto> toDtoList(List<User> users);

    PhoneNumbersDto toDto(PhoneNumbers phoneNumber);
    PhoneNumbers toEntity(PhoneNumbersDto phoneNumberDTO);
    List<PhoneNumbersDto> todtoList(List<PhoneNumbers> phoneNumbers);
}
