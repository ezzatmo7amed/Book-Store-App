package com.api.logger.repository;

import com.api.logger.model.UserManagement.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
