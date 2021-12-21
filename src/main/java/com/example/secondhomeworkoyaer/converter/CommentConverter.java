package com.example.secondhomeworkoyaer.converter;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CommentConverter {

//
//    KategoriConverter INSTANCE = Mappers.getMapper(KategoriConverter.class);
//
//    @Mapping(target = "ustKategoriId", source = "ustKategori.id")
//    KategoriDto convertKategoriToKategoriDto(Kategori kategori);
}
