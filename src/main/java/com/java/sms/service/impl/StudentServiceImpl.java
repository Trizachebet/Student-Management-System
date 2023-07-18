package com.java.sms.service.impl;

import com.java.sms.dto.StudentDto;
import com.java.sms.entity.Student;
import com.java.sms.mapper.StudentMapper;
import com.java.sms.repository.StudentRepository;
import com.java.sms.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@NoArgsConstructor
@AllArgsConstructor

public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students= studentRepository.findAll();
        List<StudentDto> studentDto= students.stream()
                .map((student)-> StudentMapper.maPToDto(student))
                .collect(Collectors.toList());
        return studentDto;
    }
}
