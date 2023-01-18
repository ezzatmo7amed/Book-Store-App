package com.api.logger.controller;

import com.api.logger.payload.UserManagement.UserDto;
import com.api.logger.sevice.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/user/")
public class UserController {

    private final  UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("create")
    public ResponseEntity<UserDto> create(@RequestBody UserDto model){

        return ResponseEntity.ok(userService.create(model));
    }
    @GetMapping("getById/")
    public ResponseEntity<UserDto> getById(@PathVariable Long id){

        return ResponseEntity.ok(userService.getById(id));
    }
}
