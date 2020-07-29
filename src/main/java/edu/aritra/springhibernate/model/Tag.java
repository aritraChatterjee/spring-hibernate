package edu.aritra.springhibernate.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Builder
public class Tag extends BaseJpaEntity {
    @NotNull
    private String name;
    private String description;

    @ManyToOne
    private Library library;

    @ManyToMany(mappedBy = "tags")
    private List<Book> books;
}

