package com.api.logger.controller;

import com.api.logger.payload.Employee.EmployeeDto;
import com.api.logger.sevice.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee/")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("create")
   public ResponseEntity<EmployeeDto> create(@RequestBody EmployeeDto model){
        return new ResponseEntity<>(employeeService.create(model), HttpStatus.CREATED);
    }
    @GetMapping("getById/{id}")
    public EmployeeDto getById(@PathVariable Long id) {

        return employeeService.getById(id);
    }
}
