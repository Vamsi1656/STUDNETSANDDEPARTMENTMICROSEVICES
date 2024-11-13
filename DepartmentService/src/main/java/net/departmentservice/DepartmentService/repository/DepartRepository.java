package net.departmentservice.DepartmentService.repository;

import net.departmentservice.DepartmentService.entity.Depart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartRepository extends JpaRepository<Depart,Long> {


    Depart findBydepartCode(String departCode);
}

