package com.example.library.model;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class Book {
    private String bookId;
    private String title;
    private String description;
    private String author;
    private double prince;
    private int qty;
    
    
    public Book(String bookId, String title, String description, String author, double prince, int qty) {
        this.bookId = bookId;
        this.title = title;
        this.description = description;
        this.author = author;
        this.prince = prince;
        this.qty = qty;
    }

    
}
