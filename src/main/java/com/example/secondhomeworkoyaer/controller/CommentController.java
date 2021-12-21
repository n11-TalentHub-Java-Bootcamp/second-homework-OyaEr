package com.example.secondhomeworkoyaer.controller;

import com.example.secondhomeworkoyaer.dto.CommentDto;
import com.example.secondhomeworkoyaer.service.CommentEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    CommentEntityService commentEntityService;

//
//    @GetMapping("/allComments/{id}")
//    public List<CommentDto> findAll(@PathVariable Long id){
//
//        Long userId = UserDao.
//
//        List<ProductComment> commentList = commentEntityService.findAllCommentsByUserId(id);
//
//       List<CommentDto> commentDtoList = CommentConverter.INSTANCE.convertAllCommentListToCommentDtoList(commentList);
//
//       return commentDtoList;
//  }

    @GetMapping("/{id}")
    public List<CommentDto> findAllProductCommentsByProductId (@PathVariable Long id){
        return null;
    }



}
