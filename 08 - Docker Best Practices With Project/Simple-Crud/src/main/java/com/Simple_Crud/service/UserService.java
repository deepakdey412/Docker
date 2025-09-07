package com.Simple_Crud.service;

import com.Simple_Crud.dto.UserDto;
import com.Simple_Crud.entity.User;
import com.Simple_Crud.mappper.UserMapper;
import com.Simple_Crud.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }


    public List<UserDto> getAllUser() {
        List<User> list = userRepository.findAll();
        return list.stream()
                .map(userMapper::toDto) // Entity → DTO
                .toList();
    }

    public UserDto getUserById(Long id) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            return userMapper.toDto(user);
        }
        return null; // not found case
    }

    public UserDto updateUser(Long id, User user) {
        User foundUser = userRepository.findById(id).orElse(null);
        if (foundUser == null) {
            throw new RuntimeException("User not found with id: " + id);
        }
        foundUser.setName(user.getName());
        foundUser.setEmail(user.getEmail());
        User updatedUser = userRepository.save(foundUser);
        return userMapper.toDto(updatedUser);
    }

    public String deleteUserById(Long id) {
        User foundUser = userRepository.findById(id).orElse(null);
        if (foundUser == null) {
            throw new RuntimeException("User not found with id: " + id);
        }
        userRepository.delete(foundUser);
        return "User deleted successfully";
    }



}

