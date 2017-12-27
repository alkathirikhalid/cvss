package com.alkathirikhalid.cvss.model.data.institute;

import com.alkathirikhalid.cvss.model.data.EMFactorySingleton;
import com.alkathirikhalid.cvss.model.entity.InstituteEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author alkathirikhalid
 */
public class InstituteIMP implements InstituteDAO {

    @Override
    public int createInstitute(InstituteEntity institute) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public InstituteEntity getInstitute(int instituteID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<InstituteEntity> getInstitutes() {
        EntityManager entityManager = null;
        List<InstituteEntity> institutes = null;
        try {
            entityManager = EMFactorySingleton.getInstance().getEntityManagerFactory().createEntityManager();
            TypedQuery<InstituteEntity> query = entityManager.createQuery("SELECT c FROM InstituteEntity c", InstituteEntity.class);
            institutes = query.getResultList();
        } catch (Exception exception) {
            // TODO
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        return institutes;
    }

    @Override
    public boolean updateInstitute(InstituteEntity institute) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteInstitute(int instituteID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
