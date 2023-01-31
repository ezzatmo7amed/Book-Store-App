package com.api.logger.payload.Employee;


import jakarta.validation.constraints.Size;
import lombok.*;

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

    private String phoneNumber;
    @Size(min = 14,max = 14)
    private String nationalId;
    private Double Salary;
    private Date dateOfBirth;

}
