package net.studentservice.StudentService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private Long studentId;

    private String studentName;

    private String studentdepart;

    private String departCode;
}
