package edu.aritra.springhibernate.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Book extends BaseJpaEntity {
    @NotNull
    private String name;

    private String language;

    @ManyToMany(mappedBy = "books")
    @Setter(AccessLevel.NONE)
    private List<Author> authors;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews;

    @OneToMany
    @Setter(AccessLevel.NONE)
    private List<Tag> tags;

    @ManyToOne
    private Shelf shelf;


    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void addReview(Review review) {
        review.setBook(this);
        this.reviews.add(review);
    }

    public void addTag(Tag tag) {
        this.tags.add(tag);
    }

}
