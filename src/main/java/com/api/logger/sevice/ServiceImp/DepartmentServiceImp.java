package com.api.logger.sevice.ServiceImp;

import com.api.logger.model.Department.Department;
import com.api.logger.payload.Department.DepartmentDto;
import com.api.logger.repository.DepartmentRepository;
import com.api.logger.sevice.DepartmentService;
import com.api.utils.ObjectMapper;
import org.apache.juli.logging.Log;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImp implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImp(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }


    @Override
    public DepartmentDto create(DepartmentDto model) {

        return ObjectMapper.map(departmentRepository.save(ObjectMapper.map(model, Department.class)), DepartmentDto.class);

    }

    @Override
    public DepartmentDto getById(Long id) {
        return ObjectMapper.map(departmentRepository.findById(id).orElseThrow(null), DepartmentDto.class);
    }

    @Override
    public List<DepartmentDto> getAll() {
        if (departmentRepository.findAll() !=null){
             ObjectMapper.mapAll(departmentRepository.findAll(), DepartmentDto.class);
        }else {
            System.out.print("departments not found !");
        }
        return ObjectMapper.mapAll(departmentRepository.findAll(), DepartmentDto.class);
    }

    @Override
    public DepartmentDto update(DepartmentDto model) {
        return null;
    }
}
