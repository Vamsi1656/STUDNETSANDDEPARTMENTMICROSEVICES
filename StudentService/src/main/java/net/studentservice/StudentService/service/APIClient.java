package net.studentservice.StudentService.service;

import net.studentservice.StudentService.dto.DepartDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:9906/api/departs/" ,value = "STUDENT-SERVICE")
public interface APIClient {

    @GetMapping("{departCode}")
    DepartDto getByDepartCode(@PathVariable String departCode);

}
