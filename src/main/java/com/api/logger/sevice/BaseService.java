package com.api.logger.sevice;

import com.api.logger.payload.UserManagement.UserDto;

import java.util.List;

public interface BaseService {

    UserDto create(UserDto model);
    UserDto getById(Long id);
    List<UserDto> getAll();
    UserDto update(UserDto model);
}
