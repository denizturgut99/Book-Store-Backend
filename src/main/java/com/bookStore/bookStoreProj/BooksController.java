package com.bookStore.bookStoreProj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;
import java.util.List;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BooksController {
    @Autowired
    private BookRepository bookRepository;

    @CrossOrigin
    @RequestMapping(path="/api/books")
    public Map<String, Object> bookDTO(){
        Map<String, Object> dto = new HashMap<>();
        Set<Books> book = new LinkedHashSet<>(bookRepository.findAll());

        dto.put("books", book.stream().map(books1 -> checkBooks(books1)).collect(toList()));
        return dto;
    }

    @CrossOrigin
    @RequestMapping(path="/api/books", method = RequestMethod.POST)
    public Map<String, Object> checkBooks(Books books) {
        Map<String, Object> booksDTO = new HashMap<>();

        booksDTO.put("bookName", books.getName());
        booksDTO.put("bookDetail", books.getDetail());
        booksDTO.put("bookPortrait", books.getPortrait());
        booksDTO.put("bookDescription", books.getDescription());
        booksDTO.put("bookLang", books.getLang());

        return booksDTO;
    }
}
