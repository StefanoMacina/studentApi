package com.example.StudentsApi.Students;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
@Entity
@Table
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate birthDate;
    private String email;
    private String name;
    private Integer age;

    public Student(Integer age, LocalDate birthDate , String email, String name) {
        this.age = age;
        this.email = email;
        this.birthDate = birthDate;
        this.name = name;
    }
@Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
