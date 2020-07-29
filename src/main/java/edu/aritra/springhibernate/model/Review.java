package edu.aritra.springhibernate.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Builder
public class Review extends BaseJpaEntity {
    private int rating;
    private String reviewDescription;

    @ManyToOne
    private Book book;

}
