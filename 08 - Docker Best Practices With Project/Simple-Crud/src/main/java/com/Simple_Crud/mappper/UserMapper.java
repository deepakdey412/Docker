package com.Simple_Crud.mappper;

import com.Simple_Crud.dto.UserDto;
import com.Simple_Crud.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    // DTO → Entity
    public User toEntity(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId()); // optional, if we want to update
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPasswrod());
        return user;
    }

    // Entity → DTO
    public UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
//        userDto.setPasswrod(user.getPassword()); // if we want to return password
        return userDto;
    }
}
