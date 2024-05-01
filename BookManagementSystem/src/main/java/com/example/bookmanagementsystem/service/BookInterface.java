package com.example.bookmanagementsystem.service;

import com.example.bookmanagementsystem.models.Book;
import com.example.bookmanagementsystem.models.Genre;

import java.util.List;
import java.util.Optional;

public interface BookInterface {

    List<Optional<Book>> searchByTitle(String title);
    List<Optional<Book>> searchByAuthor(String authorName);
    List<Optional<Book>> searchByGenre(Genre genre);
    Book addBook(Book book);
    Book updateBook(Book book);
    Book deleteBook(Book book);

}
