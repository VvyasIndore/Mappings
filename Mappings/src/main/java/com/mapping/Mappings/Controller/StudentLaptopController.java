package com.mapping.Mappings.Controller;


import com.mapping.Mappings.Dto.StudentLaptopDto;
import com.mapping.Mappings.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Hello Students")
public class StudentLaptopController
{
    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
     public StudentLaptopDto addStudent(@RequestBody StudentLaptopDto studentDto)
    {
       return this.studentService.addStudent(studentDto);
    }
    @GetMapping("/ListofStudents")
    public List<StudentLaptopDto> getEmployee()
    {
        return this.studentService.getStudent();
    }

}
