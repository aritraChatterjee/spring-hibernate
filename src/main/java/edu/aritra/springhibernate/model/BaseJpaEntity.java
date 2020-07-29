package edu.aritra.springhibernate.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@MappedSuperclass
@Data
public class BaseJpaEntity {
    @Id
    @GeneratedValue
    protected Long id;
}
