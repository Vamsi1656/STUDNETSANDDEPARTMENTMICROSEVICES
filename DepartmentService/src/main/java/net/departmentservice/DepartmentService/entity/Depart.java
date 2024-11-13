package net.departmentservice.DepartmentService.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="depart_details")
@AllArgsConstructor
@NoArgsConstructor
public class Depart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departId;

    private String departName;

    private String departCode;
}
