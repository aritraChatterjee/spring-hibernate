package edu.aritra.springhibernate.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseJpaEntity {
    @Id
    @GeneratedValue
    protected Long id;
}
