package com.api.logger.sevice.ServiceImp;

import com.api.logger.model.UserManagement.User;
import com.api.logger.payload.UserManagement.UserDto;
import com.api.logger.repository.UserRepository;
import com.api.logger.sevice.BaseService;
import com.api.logger.sevice.UserService;
import com.api.utils.ObjectMapper;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto create(UserDto model) {
        User user = ObjectMapper.map(model, User.class);
        userRepository.save(user);
        return ObjectMapper.map(user, UserDto.class);
    }

    @Override
    public UserDto getById(Long id) {
        User user = userRepository.findById(id).orElseThrow(null);
        return ObjectMapper.map(user, UserDto.class);
    }

    @Override
    public List<UserDto> getAll() {
        List<User> users = userRepository.findAll();
        return ObjectMapper.mapAll(users, UserDto.class);
    }

    @Override
    public UserDto update(UserDto model) {
        Long userId = model.getId();
        User user =userRepository.findById(userId).orElseThrow();
        user = ObjectMapper.map(model, User.class);
        userRepository.save(user);
        return ObjectMapper.map(user,UserDto.class);
    }
}
