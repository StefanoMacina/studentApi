package com.example.StudentsApi.Students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }


    public void addNewStudent(Student student) {
        // prelevo l'email e la inserisco in un oggetto Optional
        Optional<Student> studentByEmail = studentRepository
                .findStudentByEmail(student.getEmail());

        // controllo se esiste gia l'email
        if(studentByEmail.isPresent()){
            throw new IllegalArgumentException("email taken");
        }
        studentRepository.save(student);
    }

    public void deleteById(Long id) {
        boolean exists = studentRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("the student with id " + id + " does not exists" );
        }
        studentRepository.deleteById(id);
    }
}
