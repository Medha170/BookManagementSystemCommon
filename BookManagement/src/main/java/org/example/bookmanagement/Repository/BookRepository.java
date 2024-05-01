package org.example.bookmanagement.Repository;
import org.example.bookmanagement.Models.Author;
import org.example.bookmanagement.Models.Book;
import org.example.bookmanagement.Models.Genre;
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

    Book findBookById(Long id);

    List<Book> findBooksByAuthor(Author author);

    List<Book> findBooksByGenre(Genre genre);

    @Override
    void deleteById(Long id);

}