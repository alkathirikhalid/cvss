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

    /**
     * Creates a Certificate
     *
     * @param certificate
     * @return idCertificate of the Created Certificate
     */
    @Override
    public int createCertificate(CertificateEntity certificate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Gets a Certificate
     *
     * @param idCertificate
     * @return a Certificate
     */
    @Override
    public CertificateEntity getCertificate(int idCertificate) {
        EntityManager entityManager = EMFactorySingleton.getInstance().getEntityManagerFactory().createEntityManager();
        CertificateEntity certificate = entityManager.find(CertificateEntity.class, idCertificate);
        return certificate;
    }

    /**
     *
     * @return a list of Certificates
     */
    @Override
    public List<CertificateEntity> getCertificates() {
        EntityManager entityManager = EMFactorySingleton.getInstance().getEntityManagerFactory().createEntityManager();
        TypedQuery<CertificateEntity> query = entityManager.createQuery("SELECT c FROM CertificateEntity c", CertificateEntity.class);
        List<CertificateEntity> certificates = query.getResultList();
        entityManager.close();
        return certificates;
    }

    /**
     *
     * @param certificate
     * @return
     */
    @Override
    public boolean updateCertificate(CertificateEntity certificate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param certificateID
     * @return
     */
    @Override
    public boolean deleteCertificate(int certificateID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
