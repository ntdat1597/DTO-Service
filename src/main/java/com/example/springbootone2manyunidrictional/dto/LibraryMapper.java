package com.example.springbootone2manyunidrictional.dto;

import com.example.springbootone2manyunidrictional.jpa.Book;
import com.example.springbootone2manyunidrictional.jpa.Library;

import java.util.List;
@Mapper
public interface LibraryMapper {
    List<LibraryDTO> bookDTOList(List<Library> libraries);
    Library toLibrary(LibraryDTO libraryDTO);
}
