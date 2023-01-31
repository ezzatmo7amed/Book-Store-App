package com.api.logger.sevice;

import com.api.logger.payload.UserManagement.UserDto;

import java.util.List;

public interface UserService {

    UserDto create(UserDto model);
    UserDto getById(Long id);
    List<UserDto> getAllUsers();
    UserDto update(UserDto model);

    void deleteUserById(Long id);
}
