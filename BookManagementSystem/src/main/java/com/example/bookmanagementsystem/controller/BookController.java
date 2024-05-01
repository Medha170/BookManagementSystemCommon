package com.example.bookmanagementsystem.controller;

import com.example.bookmanagementsystem.models.Book;
import com.example.bookmanagementsystem.models.Genre;
import com.example.bookmanagementsystem.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/search/title/{title}")
    public List<Optional<Book>> searchByTitle(@PathVariable("title") String title){
        return bookService.searchByTitle(title);
    }

    @GetMapping("/search/author/{name}")
    public List<Optional<Book>> searchByAuthor(@PathVariable("name") String authorName){
        return bookService.searchByAuthor(authorName);
    }

    @GetMapping("/search/genre/{genre}")
    public List<Optional<Book>> searchByGenre(@PathVariable("genre") Genre genre){
        return bookService.searchByGenre(genre);
    }

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @PatchMapping("/update")
    public Book updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @DeleteMapping("delete")
    public Book deleteBook(@RequestBody Book book){
        return bookService.deleteBook(book);
    }
}
