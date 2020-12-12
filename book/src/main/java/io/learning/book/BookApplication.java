package io.learning.book;

import io.learning.book.domain.Book;
import io.learning.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
public class BookApplication {

    @Autowired
    public BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(){
        return  args -> {
            this.bookService.createBook( new Book(1L, "learning Java", "No one", 330));
            this.bookService.createBook( new Book(2L, "learning JavaScript", "No one", 3230));
            this.bookService.createBook( new Book(3L, "learning Python", "No one", 320));
            this.bookService.createBook( new Book(4L, "learning React", "No one", 333));
            this.bookService.createBook( new Book(5L, "learning Express", "No one", 310));

            System.out.println("BOok has been created");
        };
    }
}
