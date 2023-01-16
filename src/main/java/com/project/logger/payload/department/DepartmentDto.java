package com.project.logger.payload.department;


import com.project.logger.payload.employee.EmployeeDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {
    private Long id;

    private String departmentName;

    private String departmentCode;

    private List<EmployeeDto> employeeList;
}
