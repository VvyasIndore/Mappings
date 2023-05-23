package com.mapping.Mappings.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student_new")
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studName;
    private String about;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lapi_id",referencedColumnName = "laptopId")
    private Laptop laptop;


}
