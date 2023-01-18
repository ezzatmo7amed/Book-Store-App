package com.api.logger.controller;

import com.api.logger.payload.Department.DepartmentDto;
import com.api.logger.sevice.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/department/")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("create")
    public ResponseEntity<DepartmentDto> create(@RequestBody DepartmentDto model){
        return ResponseEntity.ok(departmentService.create(model));
    }


}
