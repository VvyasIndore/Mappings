package com.mapping.Mappings.Controller;


import com.mapping.Mappings.Dto.StudentLaptopDto;
import com.mapping.Mappings.Dto.UserDto;
import com.mapping.Mappings.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/HelloUsers")
public class UserPhoneNumberController
{
    @Autowired
    private UserService userService;

    @PostMapping("/AddUser")
    public UserDto addUser(@RequestBody UserDto userDto)
    {
        return this.userService.addUser(userDto);
    }
    @GetMapping("/ListofStudents")
    public List<UserDto> getUser()
    {
        return this.userService.getUser();
    }


}
