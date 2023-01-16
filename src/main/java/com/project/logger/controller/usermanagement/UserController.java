package com.project.logger.controller.usermanagement;


import com.project.logger.mapper.usermanagement.UserMapper;
import com.project.logger.payload.userManagement.UserDto;
import com.project.logger.service.usermanagement.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/user/")
public class UserController {
    private final UserService userService;
    private  UserMapper userMapper;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("findAll")
    public ResponseEntity<?> findAll(){
        List<UserDto> users = userMapper.map(userService.findAll());
        return ResponseEntity.ok(users);
    }

    @GetMapping(
            "/test")
    public String  testMethod(){
        return " hello ezzat !";
    }

}
