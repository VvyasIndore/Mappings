package com.mapping.Mappings.Dto;

import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto
{
    private Long id;
    private String name;
    private List<PhoneNumbersDto> phoneNumbers;
}
