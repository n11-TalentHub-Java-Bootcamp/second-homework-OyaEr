package com.example.secondhomeworkoyaer.controller;

import com.example.secondhomeworkoyaer.converter.UserConverter;
import com.example.secondhomeworkoyaer.dto.UserDto;
import com.example.secondhomeworkoyaer.entity.User;
import com.example.secondhomeworkoyaer.service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserEntityService userEntityService;

    //2.1:Tüm kullanıcıları getiren servis.
    @GetMapping("")
    public List<UserDto> findAll(){

        List<User> userList = userEntityService.findAll();

        List<UserDto> userDtoList = UserConverter.INSTANCE.convertAllUserListToUserDtoList(userList);

        return userDtoList;
    }



}
