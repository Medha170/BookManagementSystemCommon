package org.example.bookmanagement.controller;

import org.example.bookmanagement.Models.Author;
import org.example.bookmanagement.Models.Book;
import org.example.bookmanagement.Models.Genre;
import org.example.bookmanagement.Service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @DeleteMapping("/{id}")
    public Book deleteBook(@PathVariable Long id) {
        return bookService.deleteBook(id);
    }
    @GetMapping("/search/title/{title}")
    public List<Book> searchByTitle(@PathVariable String title) {
        return bookService.searchByTitle(title);
    }

    @GetMapping("/search/author/{author}")
    public Optional<Book> searchByAuthor(@RequestBody Author author) {
        return bookService.searchByAuthor(author);
    }

    @GetMapping("/search/genre/{genre}")
    public Optional<Book> searchByGenre(@RequestBody Genre genre) {
        return bookService.searchByGenre(genre);
    }
}
