package net.departmentservice.DepartmentService.controller;

import lombok.AllArgsConstructor;
import net.departmentservice.DepartmentService.dto.DepartDto;
import net.departmentservice.DepartmentService.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/departs")
public class DepartController {

    @Autowired
    private DepartService departService;

    @PostMapping("/savedepart")
    public ResponseEntity<DepartDto> saveDepart(@RequestBody DepartDto departDto){

        DepartDto depart= departService.saveDepartment(departDto);

        return new ResponseEntity<>(depart, HttpStatus.CREATED);
    }

    @GetMapping("{departCode}")
    public ResponseEntity<DepartDto> getByDepartCode(@PathVariable String departCode){

        DepartDto departDto=departService.getBydepartCode(departCode);

        return new ResponseEntity<>(departDto,HttpStatus.OK);
    }
}
