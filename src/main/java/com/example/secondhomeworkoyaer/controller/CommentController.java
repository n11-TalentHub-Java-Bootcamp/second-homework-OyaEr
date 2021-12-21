package com.example.secondhomeworkoyaer.controller;

import com.example.secondhomeworkoyaer.converter.CommentConverter;
import com.example.secondhomeworkoyaer.converter.UserConverter;
import com.example.secondhomeworkoyaer.dto.CommentDto;
import com.example.secondhomeworkoyaer.dto.UserDto;
import com.example.secondhomeworkoyaer.entity.ProductComment;
import com.example.secondhomeworkoyaer.entity.User;
import com.example.secondhomeworkoyaer.service.CommentEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    CommentEntityService commentEntityService;

   // 3.1: Bir kullanıcının yaptığı yorumları getiren servistir.
    @GetMapping("/allCommentsByUser/{id}")
    public List<CommentDto> findAllProductCommentsByUserId(@PathVariable Long id){
        List<ProductComment> commentList = commentEntityService.findAllCommentsByUserId(id);

        List<CommentDto> commentDtoList = CommentConverter.INSTANCE.convertAllCommentListToCommentDtoList(commentList);

        return commentDtoList;
  }
    // 3.2: Bir ürüne yapılan yorumların getirildiği servistir.
    @GetMapping("/allCommentsByProduct/{id}")
    public List<CommentDto> findAllProductCommentsByProductId(@PathVariable Long id){
        List<ProductComment> commentList = commentEntityService.findAllCommentsByProductId(id);

        List<CommentDto> commentDtoList = CommentConverter.INSTANCE.convertAllCommentListToCommentDtoList(commentList);

        return commentDtoList;
    }

    // 3.3: Yeni yorum yapılabilicek servistir.
    @PutMapping("")
    public List<CommentDto> update(@RequestBody CommentDto commentDto){

        ProductComment productComment = CommentConverter.INSTANCE.convertAllCommentDtoListToCommentList(commentDto);

        commentEntityService.save(productComment);

        List<ProductComment> commentList = new ArrayList<ProductComment>();

        commentList.add(productComment);

        List<CommentDto> commentDtoList = CommentConverter.INSTANCE.convertAllCommentListToCommentDtoList(commentList);

        return commentDtoList;

    }

    // 3.4: Yorum silebilecek servistir.
    @DeleteMapping("/{id}")
    public void deleteComment (@PathVariable("id") Long id){

        commentEntityService.deleteById(id);

    }

}
