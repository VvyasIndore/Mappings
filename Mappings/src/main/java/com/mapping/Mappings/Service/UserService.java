package com.mapping.Mappings.Service;

import com.mapping.Mappings.Dto.StudentLaptopDto;
import com.mapping.Mappings.Dto.UserDto;

import java.util.List;

public interface UserService
{
    public UserDto addUser(UserDto userDto);
    public List<UserDto> getUser();
}
