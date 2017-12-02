package com.alkathirikhalid.cvss.model.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author alkathirikhalid
 */
@Entity
public class CertificateEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCertificate;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private String certificateId;
    /**
     *
     */
    private String dateIssued;
    /**
     *
     */
    private String actionType;
    /**
     *
     */
    private String description;
    /**
     *
     */
    private String institute;

    /**
     * Constructor
     */
    public CertificateEntity() {
    }

    /**
     *
     * @param name
     * @param certficateId
     * @param dateIssued
     * @param actionType
     * @param description
     * @param institute
     */
    public CertificateEntity(String name, String certficateId, String dateIssued, String actionType, String description, String institute) {
        this.name = name;
        this.certificateId = certficateId;
        this.dateIssued = dateIssued;
        this.actionType = actionType;
        this.description = description;
        this.institute = institute;
    }

    /**
     *
     * @param idCertificate
     * @param name
     * @param certficateId
     * @param dateIssued
     * @param actionType
     * @param description
     * @param institute
     */
    public CertificateEntity(int idCertificate, String name, String certficateId, String dateIssued, String actionType, String description, String institute) {
        this.idCertificate = idCertificate;
        this.name = name;
        this.dateIssued = dateIssued;
        this.actionType = actionType;
        this.certificateId = certficateId;
        this.description = description;
        this.institute = institute;
    }

    /**
     *
     * @return
     */
    public int getIdCertificate() {
        return idCertificate;
    }

    /**
     *
     * @param idCertificate
     */
    public void setIdCertificate(int idCertificate) {
        this.idCertificate = idCertificate;
    }

    /**
     *
     * @return
     */
    public String getCertificateId() {
        return certificateId;
    }

    /**
     *
     * @param certificateId
     */
    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getDateIssued() {
        return dateIssued;
    }

    /**
     *
     * @param dateIssued
     */
    public void setDateIssued(String dateIssued) {
        this.dateIssued = dateIssued;
    }

    /**
     *
     * @return
     */
    public String getActionType() {
        return actionType;
    }

    /**
     *
     * @param actionType
     */
    public void setAction(String actionType) {
        this.actionType = actionType;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public String getInstitute() {
        return institute;
    }

    /**
     *
     * @param institute
     */
    public void setInstitute(String institute) {
        this.institute = institute;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Certificate{" + "idCertificate=" + idCertificate + ", name=" + name + ", dateIssued=" + dateIssued + ", actionType=" + actionType + ", certificateId=" + certificateId + ", description=" + description + ", institute=" + institute + '}';
    }

}
