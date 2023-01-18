package com.api.logger.sevice.ServiceImp;

import com.api.logger.model.UserManagement.Role;
import com.api.logger.payload.UserManagement.RoleDto;
import com.api.logger.repository.RoleRepository;
import com.api.logger.sevice.RoleService;
import com.api.utils.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImp implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImp(RoleRepository roleRepository) {this.roleRepository = roleRepository;}

    @Override
    public RoleDto create(RoleDto model) {
        Role role = ObjectMapper.map(model,Role.class);
        roleRepository.save(role);
        return ObjectMapper.map(role, RoleDto.class);
    }

    @Override
    public RoleDto getById(Long id) {
        return null;
    }

    @Override
    public List<RoleDto> getAll() {
        return null;
    }

    @Override
    public RoleDto update(RoleDto model) {
        return null;
    }
}
