package com.example.library.Util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.library.model.Book;
import com.example.library.service.BookService;

@Component
public class DummyBookFilter {
    private BookService bookService;

    public DummyBookFilter(BookService bookService) {
        this.bookService = bookService;
    }

    @PostConstruct
    public void init()
    {
        bookService.addBook(new Book(null, "el señor de los anillos", "libro compreto de la trilogia", "J.R.R. Tolkien", 500, 2 ));
        try {Thread.sleep(100);} catch (InterruptedException e) {}
        bookService.addBook(new Book(null, "100 años de soledad", "Novela", "Gabriel garcia", 100, 4 ));
        try {Thread.sleep(100);} catch (InterruptedException e) {}
        bookService.addBook(new Book(null, "las leyes de la ciencia", "Ciencias naturales", "J.K. Rowling", 250, 5 ));
        try {Thread.sleep(100);} catch (InterruptedException e) {}
        bookService.addBook(new Book(null, "5 reglas de la vida", "Vivir feliz", "El Gitano", 350, 3 ));
        try {Thread.sleep(100);} catch (InterruptedException e) {}
        bookService.addBook(new Book(null, "Matematicas", "Curso Matematicas", "Baldor", 1250, 2 ));
    }
    
}
