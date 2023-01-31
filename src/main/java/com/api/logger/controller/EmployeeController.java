package com.api.logger.controller;

import com.api.logger.payload.Employee.EmployeeDto;
import com.api.logger.sevice.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/employee/")
public class EmployeeController {
    private final EmployeeService employeeService;



    @PostMapping("create")
   public ResponseEntity<EmployeeDto> create(@RequestBody EmployeeDto model){
        return new ResponseEntity<>(employeeService.create(model), HttpStatus.CREATED);
    }
    @GetMapping("getById/{id}")
    public EmployeeDto getById(@PathVariable(value = "id") Long id) {

        return employeeService.getById(id);
    }
}
