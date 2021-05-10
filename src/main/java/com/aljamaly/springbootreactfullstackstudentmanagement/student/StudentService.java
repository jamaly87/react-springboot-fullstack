package com.aljamaly.springbootreactfullstackstudentmanagement.student;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getAllStudents (){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById (Long id) {
        return studentRepository.findById(id);
    }

    public void addStudent(Student student) {
        //check if email is take -- if so then throw an error
        studentRepository.save(student);
    }
}
