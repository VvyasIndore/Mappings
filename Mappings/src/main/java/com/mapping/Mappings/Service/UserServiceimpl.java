package com.mapping.Mappings.Service;

import com.mapping.Mappings.Dto.PhoneNumbersDto;
import com.mapping.Mappings.Dto.UserDto;
import com.mapping.Mappings.Entity.PhoneNumbers;
import com.mapping.Mappings.Entity.User;
import com.mapping.Mappings.Mapper.UserPhoneNumberMapper;
import com.mapping.Mappings.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceimpl implements UserService
{


    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserPhoneNumberMapper userPhoneNumberMapper;
    @Override
    public UserDto addUser(UserDto userDto)
    {
        User user = userPhoneNumberMapper.toEntity(userDto);
        List<PhoneNumbers> phoneNumbers = new ArrayList<>();
        for (PhoneNumbersDto phoneNumberDto : userDto.getPhoneNumbers()) {
            PhoneNumbers phoneNumber = userPhoneNumberMapper.toEntity(phoneNumberDto);
            phoneNumber.setUser(user);
            phoneNumbers.add(phoneNumber);
        }
        user.setPhoneNumbers(phoneNumbers);
        User savedUser = userRepository.save(user);
        return userPhoneNumberMapper.toDto(savedUser);
    }


    @Override
    public List<UserDto> getUser()
    {
        List<User> users =userRepository.findAll();
          return userPhoneNumberMapper.toDtoList(users);
    }
}
