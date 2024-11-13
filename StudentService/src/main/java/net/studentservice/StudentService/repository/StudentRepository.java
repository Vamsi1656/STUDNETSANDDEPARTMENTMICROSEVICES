package net.studentservice.StudentService.repository;

import net.studentservice.StudentService.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Students,Long> {

    Students findBystudentId(Long studentId);
}
