package com.java.sms.mapper;

import com.java.sms.dto.StudentDto;
import com.java.sms.entity.Student;

public class StudentMapper {

// map student entity to studentDto
public static  StudentDto maPToDto(Student student){
    StudentDto studentDto = new StudentDto(
            student.getId(),
            student.getEmail(),
            student.getFirstName(),
            student.getLastName()
    );
    return studentDto;

}

//maps studentDto to student entity
 public static Student mapToStudent(StudentDto studentDto){
    Student student = new Student(
            studentDto.getId(),
            studentDto.getFirstName(),
            studentDto.getLastName(),
            studentDto.getEmail()
    );
    return student;
 }
}
