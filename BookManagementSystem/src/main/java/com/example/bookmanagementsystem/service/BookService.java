package com.example.bookmanagementsystem.service;

import com.example.bookmanagementsystem.exception.BookNotFoundException;
import com.example.bookmanagementsystem.models.Book;
import com.example.bookmanagementsystem.models.Genre;
import com.example.bookmanagementsystem.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService implements BookInterface{

    private final BookRepository bookRepository;

    BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public List<Optional<Book>> searchByTitle(String title) {
        List<Optional<Book>> books = bookRepository.findBookByTitle(title);

        return new ArrayList<>(books);
    }

    @Override
    public List<Optional<Book>> searchByAuthor(String authorName) {
        List<Optional<Book>> books = bookRepository.findBookByAuthor(authorName);
        return new ArrayList<>(books);
    }

    @Override
    public List<Optional<Book>> searchByGenre(Genre genre) {
        List<Optional<Book>> books = bookRepository.findBookByGenre(genre);
        return new ArrayList<>(books);
    }


    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        Optional<Book> existingBookOptional = bookRepository.findById(book.getId());

        if (existingBookOptional.isPresent()) {
            Book existingBook = existingBookOptional.get();

            // Update the properties of the existing book with the properties of the provided book
            existingBook.setTitle(book.getTitle());
            existingBook.setAuthors(book.getAuthors());
            existingBook.setNumberOfPages(book.getNumberOfPages());
            existingBook.setGenres(book.getGenres());
            existingBook.setISBN(book.getISBN());
            existingBook.setIssueStatus(book.getIssueStatus());

            // Save the updated book
            return bookRepository.save(existingBook);
        } else {
            // Book not found, return null or throw an exception
            throw new BookNotFoundException("Invalid book entered"); // You can modify this part based on your error handling strategy
        }
    }


    @Override
    public Book deleteBook(Book book) {
        Optional<Book> existingBookOptional = bookRepository.findById(book.getId());

        if (existingBookOptional.isPresent()) {
            // Book found, delete it from the repository
            bookRepository.delete(book);
            return existingBookOptional.get();
        } else {
            // Book not found, return null or throw an exception
            throw new BookNotFoundException("Book not found"); // You can modify this part based on your error handling strategy
        }
    }

}
