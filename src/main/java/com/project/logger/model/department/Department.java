package com.project.logger.model.department;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.project.logger.base.model.BaseModel;
import com.project.logger.model.employee.Employee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity(name = "Departments")
public class Department  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "department_name",nullable = false)
    private String departmentName;
    @Column(name = "department_code",nullable = false)
    private String departmentCode;

    @OneToMany(mappedBy = "department")
    @JsonManagedReference
    private List<Employee> employeeList;
}
