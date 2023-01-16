package com.project.logger.repository.usermanagement;

import com.project.logger.base.repository.BaseRepository;
import com.project.logger.model.usermanagement.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User,Long> {

}
