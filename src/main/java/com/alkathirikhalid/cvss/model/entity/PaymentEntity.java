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
public class PaymentEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPayment;
    /**
     *
     */
    private String datePaid;
    /**
     *
     */
    private String amount;
    /**
     *
     */
    private String subscription;
    /**
     *
     */
    private String payee;

    /**
     * Constructor
     */
    public PaymentEntity() {
    }

    /**
     *
     * @param payee
     */
    public PaymentEntity(String payee) {
        this.payee = payee;
    }

    /**
     *
     * @param idPayment
     * @param datePaid
     * @param amount
     * @param subscription
     * @param payee
     */
    public PaymentEntity(int idPayment, String datePaid, String amount, String subscription, String payee) {
        this.idPayment = idPayment;
        this.datePaid = datePaid;
        this.amount = amount;
        this.subscription = subscription;
        this.payee = payee;
    }

    /**
     *
     * @return
     */
    public int getIdPayment() {
        return idPayment;
    }

    /**
     *
     * @param idPayment
     */
    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }

    /**
     *
     * @return
     */
    public String getDatePaid() {
        return datePaid;
    }

    /**
     *
     * @param datePaid
     */
    public void setDatePaid(String datePaid) {
        this.datePaid = datePaid;
    }

    /**
     *
     * @return
     */
    public String getAmount() {
        return amount;
    }

    /**
     *
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     *
     * @return
     */
    public String getSubscription() {
        return subscription;
    }

    /**
     *
     * @param subscription
     */
    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    /**
     *
     * @return
     */
    public String getPayee() {
        return payee;
    }

    /**
     *
     * @param payee
     */
    public void setPayee(String payee) {
        this.payee = payee;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "PaymentEntity{" + "idPayment=" + idPayment + ", datePaid=" + datePaid + ", amount=" + amount + ", subscription=" + subscription + ", payee=" + payee + '}';
    }
}
