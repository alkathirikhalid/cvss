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
public class UserEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    /**
     *
     */
    private String userName;
    /**
     *
     */
    private String password;
    /**
     *
     */
    private String salt;
    /**
     *
     */
    private String email;
    /**
     *
     */
    private String account;
    /**
     *
     */
    private String dateJoined;
    /**
     *
     */
    private String active;
    /**
     *
     */
    private String lastLogin;
    /**
     *
     */
    private String lastLogout;

    /**
     * Constructor
     */
    public UserEntity() {
    }

    /**
     *
     * @param userName
     * @param password
     */
    public UserEntity(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    /**
     *
     * @param userName
     * @param password
     * @param email
     */
    public UserEntity(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    /**
     *
     * @param userName
     * @param password
     * @param salt
     * @param email
     * @param account
     * @param dateJoined
     */
    public UserEntity(String userName, String password, String salt, String email, String account, String dateJoined) {
        this.userName = userName;
        this.password = password;
        this.salt = salt;
        this.email = email;
        this.account = account;
        this.dateJoined = dateJoined;
    }

    /**
     *
     * @param idUser
     * @param userName
     * @param password
     * @param salt
     * @param email
     * @param account
     * @param dateJoined
     * @param active
     * @param lastLogin
     * @param lastLogout
     */
    public UserEntity(int idUser, String userName, String password, String salt, String email, String account, String dateJoined, String active, String lastLogin, String lastLogout) {
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
        this.salt = salt;
        this.email = email;
        this.account = account;
        this.dateJoined = dateJoined;
        this.active = active;
        this.lastLogin = lastLogin;
        this.lastLogout = lastLogout;
    }

    /**
     *
     * @return
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     *
     * @param idUser
     */
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    /**
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    public String getSalt() {
        return salt;
    }

    /**
     *
     * @param salt
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getAccount() {
        return account;
    }

    /**
     *
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     *
     * @return
     */
    public String getDateJoined() {
        return dateJoined;
    }

    /**
     *
     * @param dateJoined
     */
    public void setDateJoined(String dateJoined) {
        this.dateJoined = dateJoined;
    }

    /**
     *
     * @return
     */
    public String getLastLogin() {
        return lastLogin;
    }

    /**
     *
     * @param lastLogin
     */
    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     *
     * @return
     */
    public String getLastLogout() {
        return lastLogout;
    }

    /**
     *
     * @param lastLogout
     */
    public void setLastLogout(String lastLogout) {
        this.lastLogout = lastLogout;
    }

    /**
     *
     * @return
     */
    public String getActive() {
        return active;
    }

    /**
     *
     * @param active
     */
    public void setActive(String active) {
        this.active = active;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "User{" + "idUser=" + idUser + ", userName=" + userName + ", password=" + password + ", salt=" + salt + ", email=" + email + ", account=" + account + ", dateJoined=" + dateJoined + ", active=" + active + ", lastLogin=" + lastLogin + ", lastLogout=" + lastLogout + '}';
    }

}
