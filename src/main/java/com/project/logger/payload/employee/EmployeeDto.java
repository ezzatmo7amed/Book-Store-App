package com.project.logger.payload.employee;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String nationalId;

    private Double Salary;

    private Date dateOfBirth;

}
