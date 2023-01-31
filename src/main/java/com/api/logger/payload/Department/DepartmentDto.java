package com.api.logger.payload.Department;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {
    private Long id;

    private String departmentName;

    private String departmentCode;
}
