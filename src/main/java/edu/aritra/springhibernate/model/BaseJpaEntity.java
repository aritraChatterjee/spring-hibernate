package edu.aritra.springhibernate.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public class BaseJpaEntity {
    @Id
    @GeneratedValue
    protected Long id;
}
