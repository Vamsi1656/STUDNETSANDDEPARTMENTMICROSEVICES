package net.studentservice.StudentService.controller;


import lombok.AllArgsConstructor;
import net.studentservice.StudentService.dto.APIResponseDto;
import net.studentservice.StudentService.dto.StudentDto;
import net.studentservice.StudentService.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/savestudent")
    public ResponseEntity<StudentDto> saveStudent(@RequestBody StudentDto studentDto){

        StudentDto studentDto1=studentService.savestudents(studentDto);
        return new ResponseEntity<>(studentDto1, HttpStatus.CREATED);
    }

    @GetMapping("{studentId}")
    public ResponseEntity<APIResponseDto> getByStudentId(@PathVariable Long studentId){
        APIResponseDto apiResponseDto=studentService.getstudentById(studentId);
        return new ResponseEntity<>(apiResponseDto,HttpStatus.OK);
    }
}
