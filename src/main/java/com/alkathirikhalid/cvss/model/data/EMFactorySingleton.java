package com.alkathirikhalid.cvss.model.data;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author alkathirikhalid
 */
public class EMFactorySingleton {

    private static final EMFactorySingleton SINGLETON = new EMFactorySingleton();

    private static final String PU = "CVSSPU";

    private EntityManagerFactory emf;

    /**
     *
     * @return
     */
    public static EMFactorySingleton getInstance() {
        return SINGLETON;
    }

    private EMFactorySingleton() {
    }

    /**
     *
     * @return
     */
    public EntityManagerFactory getEntityManagerFactory() {
        if (null == emf) {
            emf = Persistence.createEntityManagerFactory(PU);
        }
        return emf;
    }

    /**
     * close
     */
    public void closeEmf() {
        if (emf != null || emf.isOpen()) {
            emf.close();
        }
        emf = null;
    }
}
