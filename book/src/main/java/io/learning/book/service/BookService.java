package io.learning.book.service;

import io.learning.book.domain.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private List<Book> books = new ArrayList<>();

    public Book createBook(Book book){
        book.setId((long) (Math.random() * 10000));
        books.add(book);
        return book;
    }

    public List<Book> getAllBooks(){
        return books;
    }
}
