package com.alkathirikhalid.cvss.model.data.certificate;

import com.alkathirikhalid.cvss.model.data.EMFactorySingleton;
import com.alkathirikhalid.cvss.model.entity.CertificateEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author alkathirikhalid
 */
public class CertificateIMP implements CertificateDAO {

    @Override
    public int createCertificate(CertificateEntity certificate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CertificateEntity getCertificate(int certificateID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CertificateEntity> getCertificates() {
        EntityManager entityManager = null;
        List<CertificateEntity> certificates = null;
        try {
            entityManager = EMFactorySingleton.getInstance().getEntityManagerFactory().createEntityManager();
            TypedQuery<CertificateEntity> query = entityManager.createQuery("SELECT c FROM CertificateEntity c", CertificateEntity.class);
            certificates = query.getResultList();
        } catch (Exception exception) {
            // TODO
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        return certificates;
    }

    @Override
    public boolean updateCertificate(CertificateEntity certificate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteCertificate(int certificateID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
