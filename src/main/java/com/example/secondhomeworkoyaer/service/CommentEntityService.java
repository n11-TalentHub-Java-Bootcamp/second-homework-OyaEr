package com.example.secondhomeworkoyaer.service;

import com.example.secondhomeworkoyaer.dao.CommentDao;
import com.example.secondhomeworkoyaer.entity.ProductComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentEntityService {

    @Autowired
    CommentDao commentDao;



    public List<ProductComment> findAllCommentsByUserId(Long id){

        return commentDao.findAllByUserId(id);

    }

    public List<ProductComment> findAllCommentsByProductId(Long id){

        return commentDao.findAllByProductId(id);

    }


}
