package com.api.logger.controller;

import com.api.logger.payload.UserManagement.RoleDto;
import com.api.logger.sevice.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/role/")
public class RoleController {

    private final RoleService roleService;



    @PostMapping("create")
    public ResponseEntity<RoleDto> create (@RequestBody RoleDto model){
        return ResponseEntity.ok(roleService.create(model));
    }
}
