package com.api.logger.payload.Employee;


import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;
    @Size(min = 14,max = 14)
    private String nationalId;
    private Double Salary;
    private Date dateOfBirth;

}
