package com.api.logger.sevice;

import com.api.logger.payload.Department.DepartmentDto;
import com.api.logger.payload.UserManagement.UserDto;

import java.util.List;

public interface DepartmentService {
    DepartmentDto create(DepartmentDto model);
    DepartmentDto getById(Long id);
    List<DepartmentDto> getAll();
    DepartmentDto update(DepartmentDto model);
}
