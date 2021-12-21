package com.example.secondhomeworkoyaer.controller;

import com.example.secondhomeworkoyaer.converter.UserConverter;
import com.example.secondhomeworkoyaer.dto.UserDto;
import com.example.secondhomeworkoyaer.entity.User;
import com.example.secondhomeworkoyaer.service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserEntityService userEntityService;

    //2.1:Tüm kullanıcıları getiren servis.
    @GetMapping("/allUsers")
    public List<UserDto> findAll(){

        List<User> userList = userEntityService.findAll();

        List<UserDto> userDtoList = UserConverter.INSTANCE.convertAllUserListToUserDtoList(userList);

        return userDtoList;
    }

    // 2.2: Kullanıcı adından kullanıcıyı getiren servis.
    @GetMapping("/userName/{userName}")
    public List<UserDto> findByUserName(@PathVariable String userName){

        List<User> user = userEntityService.findByUserName(userName);

        List<UserDto> userDtoList = UserConverter.INSTANCE.convertAllUserListToUserDtoList(user);

        return userDtoList;
    }

    //2.3: Kullanıcı telefonundan kullanıcıyı getiren servis.
    @GetMapping("/phoneNumber/{phoneNumber}")
    public List<UserDto> findByPhoneNumber(@PathVariable String phoneNumber){

        List<User> user = userEntityService.findByPhoneNumber(phoneNumber);

        List<UserDto> userDtoList = UserConverter.INSTANCE.convertAllUserListToUserDtoList(user);

        return userDtoList;
    }


    @PostMapping("")
    public void saveUser(@RequestBody UserDto userDto){ //TODO: Input değeri dto tipinde olmalı

        try {

            User user = UserConverter.INSTANCE.convertAllUserDtoListToUserList(userDto);

            user = userEntityService.save(user);

        }
        catch(Exception e){

            System.out.println(e.getMessage());
        }
    }

    @DeleteMapping("/{userName}/{phoneNumber}")
    public String deleteUser(@PathVariable ("userName")String userName,@PathVariable ("phoneNumber") String phoneNumber){

        List<User> userList = userEntityService.findByPhoneNumber(phoneNumber);

        List<User> user2List = userEntityService.findByUserName(userName);

        User user1 = userList.get(0);

        User user2 = user2List.get(0);

        if(user1== null || user2==null){
            return "User not found";
        }

        if(user1.getId() == user2.getId() ){
            userEntityService.deleteById(user1.getId());
            return "User has been deleted";
        }
        else{
            return "infos not matched";
        }
    }

    @PutMapping("")
    public List<UserDto> update(@RequestBody UserDto userDto){

        User user = UserConverter.INSTANCE.convertAllUserDtoListToUserList(userDto);

        userEntityService.save(user);

        List<User> userList=new ArrayList<User>();

        userList.add(user);

        List<UserDto> userDtoList = UserConverter.INSTANCE.convertAllUserListToUserDtoList(userList);

        return userDtoList;

    }


}
