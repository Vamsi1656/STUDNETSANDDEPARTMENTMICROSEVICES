package net.studentservice.StudentService.service;

import net.studentservice.StudentService.dto.DepartDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="DEPARTMENT-SERVICE")
public interface APIClient {

    @GetMapping("api/departs/{departCode}")
    DepartDto getByDepartCode(@PathVariable String departCode);

}
