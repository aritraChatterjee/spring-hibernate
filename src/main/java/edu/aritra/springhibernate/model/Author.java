package edu.aritra.springhibernate.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Author extends BaseJpaEntity {
    @NotNull
    private String firstName;
    private String lastName;

    @ManyToMany
    @Setter(AccessLevel.NONE)
    private List<Book> books;

    public void addBook(Book book) {
        this.books.add(book);
    }

}
