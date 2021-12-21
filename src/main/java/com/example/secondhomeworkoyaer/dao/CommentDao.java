package com.example.secondhomeworkoyaer.dao;

import com.example.secondhomeworkoyaer.entity.ProductComment;
import com.example.secondhomeworkoyaer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentDao extends JpaRepository<ProductComment,Long> {

    List<ProductComment> findAllByUserId(User id);
}
