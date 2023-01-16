package com.project.logger.mapper.usermanagement;

import com.project.logger.base.mapper.BaseMapper;
import com.project.logger.model.usermanagement.User;
import com.project.logger.payload.userManagement.UserDto;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User, UserDto> {
}
