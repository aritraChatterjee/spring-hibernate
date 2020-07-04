package edu.aritra.springhibernate.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Book extends BaseJpaEntity {

    private String name;
    private String language;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Author> authors;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews;

    @OneToMany
    @Setter(AccessLevel.NONE)
    private List<Tag> tags;

    @ManyToOne
    private Library library;


    public void addAuthor(Author author) {
        author.setBook(this);
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
