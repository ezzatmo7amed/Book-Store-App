package com.api.logger.sevice.ServiceImp;

import com.api.logger.exception.NotFoundException;
import com.api.logger.model.UserManagement.User;
import com.api.logger.payload.UserManagement.UserDto;
import com.api.logger.repository.UserRepository;
import com.api.logger.sevice.UserService;
import com.api.utils.ObjectMapper;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;


    @Override
    public UserDto create(UserDto model) {
        try {

            Optional<User> duplicateMailCheck = userRepository.findByEmail(model.getEmail());
            Optional<User> duplicateUserNameCheck = userRepository.findByUserName(model.getUserName());

            if (duplicateMailCheck.isPresent() || duplicateUserNameCheck.isPresent()) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "A user with a duplicate National Or Email already exists !");
            }
            User user = ObjectMapper.map(model, User.class);
            userRepository.save(user);

            return ObjectMapper.map(user, UserDto.class);
        }catch (Exception ex){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"The Following Exception Occurred !");
        }
    }

    @Override
    public UserDto getById(Long id) {
        User user = userRepository.findById(id).orElseThrow(()-> new NotFoundException(" User Not Found With Id : "+id));
        return ObjectMapper.map(user, UserDto.class);
    }

    @Override
    public List<UserDto> getAllUsers() {
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

    @Override
    public void deleteUserById(Long id) {
        if(!getById(id).equals(null))
            userRepository.deleteById(id);

    }
}
