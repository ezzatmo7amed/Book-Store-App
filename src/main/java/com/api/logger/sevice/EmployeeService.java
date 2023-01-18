package com.api.logger.sevice;


import com.api.logger.payload.Employee.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    EmployeeDto create(EmployeeDto model);
    EmployeeDto getById(Long id);
    List< EmployeeDto> getAll();
    EmployeeDto update(EmployeeDto model);
}
