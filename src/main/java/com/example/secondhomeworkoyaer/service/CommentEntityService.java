package com.example.secondhomeworkoyaer.service;

import com.example.secondhomeworkoyaer.dao.CommentDao;
import com.example.secondhomeworkoyaer.entity.ProductComment;
import com.example.secondhomeworkoyaer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentEntityService {

    @Autowired
    CommentDao commentDao;

    public List<ProductComment> findAllCommentsByUserId(User id){

        return commentDao.findAllByUserId(id);

    }


}
