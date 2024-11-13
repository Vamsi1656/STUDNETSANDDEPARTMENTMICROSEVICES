package net.studentservice.StudentService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIResponseDto {

    public StudentDto studentDto;

    public DepartDto departDto;
}
