package net.departmentservice.DepartmentService.service;

import net.departmentservice.DepartmentService.dto.DepartDto;

public interface DepartService {

    DepartDto saveDepartment(DepartDto departmentDto);

    DepartDto getBydepartCode(String departCode);
}
