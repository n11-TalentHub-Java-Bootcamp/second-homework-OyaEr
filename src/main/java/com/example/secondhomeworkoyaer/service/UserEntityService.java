package com.example.secondhomeworkoyaer.service;

import com.example.secondhomeworkoyaer.dao.UserDao;
import com.example.secondhomeworkoyaer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserEntityService {

    @Autowired
    private UserDao userDao;

    public List<User> findAll(){

        return (List<User>) userDao.findAll();
    }
}
