package util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    private final static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("delaware");
    
    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
    private JPAUtil() {
    }
}