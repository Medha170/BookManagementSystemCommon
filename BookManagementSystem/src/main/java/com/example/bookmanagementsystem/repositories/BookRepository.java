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

    Optional<Book> findById(Long id);

    @Override
    Book save(Book book);

    List<Optional<Book>> findBookByTitle(String title);

    List<Optional<Book>> findBookByAuthor(String authorName);

    List<Optional<Book>> findBookByGenre(Genre genre);

    @Override
    void delete(Book book);
}
