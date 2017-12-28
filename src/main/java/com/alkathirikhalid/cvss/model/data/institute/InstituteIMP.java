package com.alkathirikhalid.cvss.model.data.institute;

import com.alkathirikhalid.cvss.model.data.EMFactorySingleton;
import com.alkathirikhalid.cvss.model.entity.InstituteEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 * <p>
 * Institute Data Access Object Implementation.</p>
 *
 * @author alkathirikhalid
 */
public class InstituteIMP implements InstituteDAO {

    /**
     * Creates Institute
     *
     * @param institute
     * @return
     */
    @Override
    public int createInstitute(InstituteEntity institute) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param instituteID
     * @return institute
     */
    @Override
    public InstituteEntity getInstitute(int instituteID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return list of institutes
     */
    @Override
    public List<InstituteEntity> getInstitutes() {
        EntityManager entityManager = EMFactorySingleton.getInstance().getEntityManagerFactory().createEntityManager();
        TypedQuery<InstituteEntity> query = entityManager.createQuery("SELECT c FROM InstituteEntity c", InstituteEntity.class);
        List<InstituteEntity> institutes = query.getResultList();
        entityManager.close();
        return institutes;
    }

    /**
     *
     * @param institute
     * @return
     */
    @Override
    public boolean updateInstitute(InstituteEntity institute) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param instituteID
     * @return
     */
    @Override
    public boolean deleteInstitute(int instituteID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
