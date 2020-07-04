package edu.aritra.springhibernate.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Tag extends BaseJpaEntity {
    private String text;
    private String description;

}

