package org.example.bookmanagement.Service;

import org.example.bookmanagement.Models.Author;
import org.example.bookmanagement.Models.Book;
import org.example.bookmanagement.Repository.BookRepository;
import org.example.bookmanagement.exception.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {
    private BookRepository bookRepository;



    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book searchById(Book book) {
        return bookRepository.findBookById(book.getId())
                .orElseThrow(() -> new NotFoundException("Book not found with id: " + book.getId()));
    }

    public Book updateBook(Book book) {
        Book existingBook = searchById(book);
        return bookRepository.save(existingBook);
    }

    public void deleteBook(Book book) {
        bookRepository.deleteById(book.getId());
    }

    public Optional<Book> searchByTitle(Book book) {
        return bookRepository.findBookByTitle(book.getTitle());
    }

    public Optional<Book> searchByAuthor(Author author) {
        return bookRepository.findBooksByAuthor(author);
    }
}
