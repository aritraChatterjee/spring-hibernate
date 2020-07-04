package edu.aritra.springhibernate.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Author extends BaseJpaEntity{
    private String firstName;
    private String lastName;

    @ManyToOne
    private Book book;

}
