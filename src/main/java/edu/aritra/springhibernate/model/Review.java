package edu.aritra.springhibernate.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Review extends BaseJpaEntity {
    private int rating;
    private String reviewDescription;

    @ManyToOne
    private Book book;

}
