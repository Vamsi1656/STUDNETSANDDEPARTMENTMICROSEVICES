package net.studentservice.StudentService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartDto {

    private Long departId;

    private String departName;

    private String departCode;
}
