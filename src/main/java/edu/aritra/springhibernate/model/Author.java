package edu.aritra.springhibernate.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Author {
    private String name;
    private String address;

    @ManyToOne
    private Book book;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
