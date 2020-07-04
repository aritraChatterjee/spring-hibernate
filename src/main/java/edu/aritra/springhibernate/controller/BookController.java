package edu.aritra.springhibernate.controller;

import edu.aritra.springhibernate.model.Book;
import edu.aritra.springhibernate.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping(value = "/book")
    public ResponseEntity<List<Book>> getBooks() {

        return new ResponseEntity<>(bookService.list(), HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "/book/delete")
    public ResponseEntity<List<Book>> deleteBooks() {
        bookService.deleteAll();
        return new ResponseEntity<>(bookService.list(), HttpStatus.ACCEPTED);
    }
}
