package com.mapping.Mappings.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Any;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "phonenumbers")
public class PhoneNumbers
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
