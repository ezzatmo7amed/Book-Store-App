package com.project.logger.controller.department;

import com.project.logger.model.department.Department;
import com.project.logger.payload.department.DepartmentDto;
import com.project.logger.service.department.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/department/")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("create")
    public ResponseEntity<DepartmentDto> save (@RequestBody DepartmentDto dept){

        return  new ResponseEntity<DepartmentDto>(departmentService.create(dept), HttpStatus.CREATED);
    }
}
