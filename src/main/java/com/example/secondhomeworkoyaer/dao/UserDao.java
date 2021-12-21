package com.example.secondhomeworkoyaer.dao;

import com.example.secondhomeworkoyaer.entity.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    List<User> findAll();

    List<User> findByUserName(String userName);

    List<User> findByPhoneNumber(String phoneNumber);

    void deleteById(Long id);
}
