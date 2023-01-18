package com.api.logger.sevice.ServiceImp;

import com.api.logger.model.Employee.Employee;
import com.api.logger.payload.Employee.EmployeeDto;
import com.api.logger.repository.EmployeeRepository;
import com.api.logger.sevice.EmployeeService;
import com.api.utils.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImp(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDto create(EmployeeDto model) {
        Employee employee = ObjectMapper.map(model, Employee.class);
        employeeRepository.save(employee);

        return ObjectMapper.map(employee, EmployeeDto.class);
    }

    @Override
    public EmployeeDto getById(Long id) {

        return ObjectMapper.map(employeeRepository.findById(id).orElseThrow(null),EmployeeDto.class);
    }

    @Override
    public List<EmployeeDto> getAll() {
        return null;
    }

    @Override
    public EmployeeDto update(EmployeeDto model) {
        return null;
    }
}
