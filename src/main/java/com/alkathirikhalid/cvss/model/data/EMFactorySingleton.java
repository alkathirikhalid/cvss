package com.alkathirikhalid.cvss.model.data;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alkathirikhalid
 */
public class EMFactorySingleton {

    private static final EMFactorySingleton singleton = new EMFactorySingleton();

    private static final String PU = "CVSSPU";

    private EntityManagerFactory emf;

    public static EMFactorySingleton getInstance() {
        return singleton;
    }

    private EMFactorySingleton() {
    }

    public EntityManagerFactory getEntityManagerFactory() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(PU);
        }
        return emf;
    }

    public void closeEmf() {
        if (emf != null || emf.isOpen()) {
            emf.close();
        }
        emf = null;
    }
}
