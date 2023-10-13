package com.example.StudentsApi.Students;

import lombok.*;

import javax.management.ConstructorParameters;
import java.time.LocalDate;
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Student {

    private Long id;
    private Integer age;
    private LocalDate birthDate;
    private String email;
    private String name;

    public Student(Integer age, LocalDate birthDate, String email, String name) {
        this.age = age;
        this.birthDate = birthDate;
        this.email = email;
        this.name = name;
    }
}
