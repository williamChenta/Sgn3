package br.edu.senai.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionDB {
    private static EntityManagerFactory emf;

    private static EntityManagerFactory getFactory() {
        if(emf == null || !emf.isOpen()) {
            emf = Persistence.createEntityManagerFactory("Sgn3PU");
        }
        return emf;
    }
    
    private static EntityManager getConnection() {
        return getFactory().createEntityManager();
    }
    
    public static void insert(Object o) {
        EntityManager em = getConnection();
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
        em.close();
    }
    
    public static void update(Object o) {
        EntityManager em = getConnection();
        em.getTransaction().begin();
        em.merge(o);
        em.getTransaction().commit();
        em.close();
    }
    
    public static void delete(Object o) {
        EntityManager em = getConnection();
        em.getTransaction().begin();
        em.merge(o);
        em.remove(o);
        em.getTransaction().commit();
        em.close();
    }
}
