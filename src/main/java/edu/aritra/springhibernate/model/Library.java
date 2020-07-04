package edu.aritra.springhibernate.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Library extends BaseJpaEntity {
    private String location;

    @OneToMany(mappedBy = "library", cascade = CascadeType.ALL, orphanRemoval = true)
    @Setter(AccessLevel.NONE)
    private List<Book> books;


    @OneToMany
    @Setter(AccessLevel.NONE)
    private List<Tag> tags;

    public void addBook(Book book) {
        book.setLibrary(this);
        this.books.add(book);
    }

    public void addTag(Tag tag) {
        this.tags.add(tag);
    }

}


