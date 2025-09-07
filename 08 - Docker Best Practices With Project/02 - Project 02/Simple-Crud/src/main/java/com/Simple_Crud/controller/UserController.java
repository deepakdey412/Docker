package com.Simple_Crud.controller;

import com.Simple_Crud.dto.UserDto;
import com.Simple_Crud.entity.User;
import com.Simple_Crud.mappper.UserMapper;
import com.Simple_Crud.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @PostMapping("/create")
    public UserDto saveUser(@RequestBody User user){
        userService.createUser(user);
        return userMapper.toDto(user);
    }

    @GetMapping("/getAll")
    public List<UserDto> getAll(){
        return userService.getAllUser();
    }

    @GetMapping("/get/{id}")
    public UserDto getbByID(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PostMapping("/update/{id}")
    public UserDto update(@PathVariable Long id , @RequestBody User user){
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteByid(@PathVariable Long id){
        return userService.deleteUserById(id);
    }

}
