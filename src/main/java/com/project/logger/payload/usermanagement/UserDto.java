package com.project.logger.payload.userManagement;

import com.project.logger.base.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class UserDto extends BaseDto<Long> {

    private String firstName;
    private String lastName;

}
