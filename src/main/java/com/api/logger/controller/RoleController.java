package com.api.logger.controller;

import com.api.logger.payload.UserManagement.RoleDto;
import com.api.logger.sevice.RoleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/role/")
public class RoleController {

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @PostMapping("create")
    public ResponseEntity<RoleDto> create (@RequestBody RoleDto model){
        return ResponseEntity.ok(roleService.create(model));
    }
}
