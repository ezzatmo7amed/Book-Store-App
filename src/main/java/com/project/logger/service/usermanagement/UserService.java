package com.project.logger.service.usermanagement;

import com.project.logger.base.repository.BaseRepository;
import com.project.logger.base.service.BaseService;
import com.project.logger.model.usermanagement.User;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User,Long> {


    public UserService(BaseRepository<User, Long> baseRepository) {super(baseRepository);}


}
