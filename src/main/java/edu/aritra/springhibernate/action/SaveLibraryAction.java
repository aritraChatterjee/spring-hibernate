package edu.aritra.springhibernate.action;

import edu.aritra.springhibernate.model.Library;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Transactional
public class SaveLibraryAction {
    @Autowired
    private EntityManager em;

    public void process(Library library) {
        em.persist(library);
    }
}
