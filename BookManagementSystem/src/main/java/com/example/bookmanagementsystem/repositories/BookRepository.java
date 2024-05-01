package com.example.bookmanagementsystem.repositories;

import com.example.bookmanagementsystem.models.Author;
import com.example.bookmanagementsystem.models.Book;
import com.example.bookmanagementsystem.models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Override
    List<Book> findAll();

    @Override
    Book save(Book book);

    Optional<Book> findBookByTitle(String title);

    List<Book> findBooksByAuthor(Author author);

    List<Book> findBooksByGenre(Genre genre);

    @Override
    void deleteById(Long id);

}
