package com.mapping.Mappings.Service;

import com.mapping.Mappings.Dto.StudentLaptopDto;

import java.util.List;

public interface StudentService
{
    public StudentLaptopDto addStudent(StudentLaptopDto studentDto);
    public List<StudentLaptopDto> getStudent();
}
