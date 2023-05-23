package com.mapping.Mappings.Mapper;


import com.mapping.Mappings.Dto.StudentLaptopDto;
import com.mapping.Mappings.Entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper
{
    @Mapping(source = "studName", target = "studName")
    StudentLaptopDto toDto(Student student);
    Student         toEntity(StudentLaptopDto studentLaptopDto);
    List<StudentLaptopDto>  dtoList(List<Student> students);
}
