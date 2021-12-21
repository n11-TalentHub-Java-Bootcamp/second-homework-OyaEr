package com.example.secondhomeworkoyaer.converter;


import com.example.secondhomeworkoyaer.dto.CommentDto;
import com.example.secondhomeworkoyaer.dto.UserDto;
import com.example.secondhomeworkoyaer.entity.ProductComment;
import com.example.secondhomeworkoyaer.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CommentConverter {

    CommentConverter INSTANCE = Mappers.getMapper(CommentConverter.class);

    List<CommentDto> convertAllCommentListToCommentDtoList (List<ProductComment> commentList);

    ProductComment convertAllCommentDtoListToCommentList(CommentDto commentDto);


}
