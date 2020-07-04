package edu.aritra.springhibernate.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Tag extends BaseJpaEntity {
    @NotNull
    private String name;
    private String description;

    @ManyToOne
    private Library library;

    @ManyToMany(mappedBy = "tags")
    private List<Book> books;
}

