package com.mapping.Mappings.Service;

import com.mapping.Mappings.Dto.StudentLaptopDto;
import com.mapping.Mappings.Entity.Student;
import com.mapping.Mappings.Mapper.StudentMapper;
import com.mapping.Mappings.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceimpl implements StudentService
{
    @Autowired
    private StudentMapper mapper;

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public StudentLaptopDto addStudent(StudentLaptopDto studentDto) {
        Student student = studentRepository.save(mapper.toEntity(studentDto));
        return mapper.toDto(student);
    }

    @Override
    public List<StudentLaptopDto> getStudent() {
        List<Student>  students   =   studentRepository.findAll();
        return mapper.dtoList(students);
    }
}
