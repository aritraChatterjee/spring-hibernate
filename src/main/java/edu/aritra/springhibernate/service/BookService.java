package edu.aritra.springhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.aritra.springhibernate.model.Book;
import edu.aritra.springhibernate.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> list() {
        return bookRepository.findAll();
    }

    public void deleteAll() {
        bookRepository.deleteAll();
    }

}
