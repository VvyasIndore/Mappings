package com.mapping.Mappings.Dto;

import com.mapping.Mappings.Entity.Laptop;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class StudentLaptopDto
{
    private Long studentId;
    private String studName;
    private String about;
    private Laptop laptop;
}
