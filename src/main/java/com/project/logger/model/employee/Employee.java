package com.project.logger.model.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.project.logger.base.model.BaseModel;
import com.project.logger.model.department.Department;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"email"})
})
public class Employee  {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name",nullable = false)
    private String firstName;
    @Column(name = "last_name",nullable = false)
    private String lastName;
    @Column(name = "email",nullable = false)
    private String email;
    @Column(name = "national_id",nullable = false)
    private String nationalId;
    @Column(name = "salary",nullable = false)
    private Double Salary;
    @Column(name = "Date_of_birth",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "departmentId",referencedColumnName = "id")
    @JsonBackReference
    private Department department;

}
