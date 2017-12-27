package com.alkathirikhalid.cvss.model.data.certificate;

import com.alkathirikhalid.cvss.model.entity.CertificateEntity;
import java.util.List;

/**
 *
 * @author alkathirikhalid
 */
interface CertificateDAO {

    int createCertificate(CertificateEntity certificate);

    CertificateEntity getCertificate(int certificateID);

    List<CertificateEntity> getCertificates();

    boolean updateCertificate(CertificateEntity certificate);

    boolean deleteCertificate(int certificateID);
}
