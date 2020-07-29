package edu.aritra.springhibernate.action;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import edu.aritra.springhibernate.model.Library;

@Transactional
public class SaveLibraryAction {
    @Autowired
    private EntityManager em;

    public void process(Library library) {
        em.persist(library);
    }
}
