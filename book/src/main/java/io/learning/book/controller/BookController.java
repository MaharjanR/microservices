package io.learning.book.controller;

import io.learning.book.domain.Book;
import io.learning.book.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class BookController {

    public BookService bookService;

    @PostMapping("/books")
    public Book createBook(Book book){
        return  this.bookService.createBook(book);
    }

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return this.bookService.getAllBooks();
    }
}
