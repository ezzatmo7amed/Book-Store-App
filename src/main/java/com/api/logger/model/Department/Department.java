package com.api.logger.model.Department;

import com.api.logger.model.Employee.Employee;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Departments",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"department_code"})
})
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id",nullable = false)
    private Long id;
    @Column(name = "department_name",nullable = false)
    private String departmentName;
    @Column(name = "department_code",nullable = false)
    private String departmentCode;

    @OneToMany(mappedBy = "department")
    @JsonManagedReference
    private List<Employee> employeeList;
}
