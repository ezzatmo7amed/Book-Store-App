package com.project.logger.service.department;

import com.project.logger.model.department.Department;
import com.project.logger.payload.department.DepartmentDto;
import com.project.logger.repository.department.DepartmentRepository;
import com.project.util.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService  {

@Autowired
    private  DepartmentRepository departmentRepository;


    public DepartmentDto create (DepartmentDto dept){

          Department department = ObjectMapperUtils.map(dept, Department.class);
          departmentRepository.save(department);
          return ObjectMapperUtils.map(department,DepartmentDto.class);

    }


    public List<DepartmentDto> findAll() {

        List<Department> depts = departmentRepository.findAll();
         return ObjectMapperUtils.mapAll(depts,DepartmentDto.class);
    }
}
