package com.example.springbootone2manyunidrictional.dto;

import com.example.springbootone2manyunidrictional.jpa.Book;

import java.util.List;
@Mapper
public interface BookMapper {
    List<BookDTO> bookDTOList(List<Book> books);
    Book toBook(BookDTO bookDTO);
}
