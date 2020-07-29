package edu.aritra.springhibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.aritra.springhibernate.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
