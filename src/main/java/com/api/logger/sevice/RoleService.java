package com.api.logger.sevice;

import com.api.logger.payload.UserManagement.RoleDto;
import com.api.logger.payload.UserManagement.UserDto;

import java.util.List;

public interface RoleService {
    RoleDto create(RoleDto model);
    RoleDto getById(Long id);
    List< RoleDto> getAll();
    RoleDto update(RoleDto model);
}
