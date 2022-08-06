package com.example.library.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.library.model.Book;
import com.example.library.repositorio.MemoryBookRepository;

@RestController
@RequestMapping(value = "/library")
public class LibraryController {

    Book book = new Book();
    MemoryBookRepository memoryBookRepository = new MemoryBookRepository();

    public LibraryController() {
    }

    //Buscar todos los libros
    @GetMapping("/books")
    public List<Book> getAll() {
        return memoryBookRepository.getAll();
    }

    //Buscar libro por ID
    @GetMapping("/books/{id}")
    public Book get(@PathVariable String id) {
        return memoryBookRepository.get(id);
    }

    //Buscar Libro por Autor
    @GetMapping("/books/author")
    public List<Book> findByAuthor(@RequestParam(value = "author") String author) {
        return memoryBookRepository.findByAuthor(author);
    }

    //Adicionar Libro
    @PostMapping("/books")
    public String saveBook(@RequestBody Book book) {
        memoryBookRepository.save(book);
        return "Se adiciono el libro.";
    }

    //Actualizar Libro
    @PutMapping("/books/{id}")
    public String updateBook(@RequestBody Book book) {
        Book bookVar = memoryBookRepository.get(book.getBookId());
        memoryBookRepository.save(book);
        return "Se realizo la actualizacion del libro:" + bookVar; 
    }

    //Eliminar Libro
    @DeleteMapping("/books/{id}")
    public String delete(@PathVariable String id) {
        memoryBookRepository.delete(id);
        return "Se realizo la eliminacion del libro con Id: " + id;
    }
}
