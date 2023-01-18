package com.api.logger.model.Employee;

import com.api.logger.model.Department.Department;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "employees",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"email"}),
        @UniqueConstraint(columnNames = {"national_id"})
})
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id",nullable = false)
    private Long id;
    @Column(name = "first_name",nullable = false)
    private String firstName;
    @Column(name = "last_name",nullable = false)
    private String lastName;
    @Column(name = "email",nullable = false)
    private String email;
    @Column(name = "phoneNumber",nullable = false)
    private String phoneNumber;
    @Size(min = 14,max = 14)
    @Column(name = "national_id",nullable = false)
    private String nationalId;
    @Column(name = "salary",nullable = false)
    private Double Salary;
    @Column(name = "Date_of_birth",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "departmentId",referencedColumnName = "department_id")
    @JsonBackReference
    private Department department;
}
