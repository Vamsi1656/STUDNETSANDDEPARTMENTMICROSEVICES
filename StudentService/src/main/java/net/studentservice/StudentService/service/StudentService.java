package net.studentservice.StudentService.service;

import net.studentservice.StudentService.dto.APIResponseDto;
import net.studentservice.StudentService.dto.StudentDto;

public interface StudentService {

    StudentDto savestudents(StudentDto studentDto);

    APIResponseDto getstudentById(Long studentId);

}
