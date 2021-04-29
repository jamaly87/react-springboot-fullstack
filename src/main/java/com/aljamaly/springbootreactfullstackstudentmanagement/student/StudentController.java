package com.aljamaly.springbootreactfullstackstudentmanagement.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents(){
        List<Student> studentsList = Arrays.asList(
                new Student(1L, "Mina", "mina@jamaly.com", Gender.FEMALE),
                new Student(2L, "Hamza", "hamza@jamaly.com", Gender.MALE)
                );
        return studentsList;
    }

}
