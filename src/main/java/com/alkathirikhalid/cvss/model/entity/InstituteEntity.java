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
public class InstituteEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInstitute;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private String location;
    /**
     *
     */
    private String manager;

    /**
     * Constructor
     */
    public InstituteEntity() {
    }

    /**
     *
     * @param name
     * @param location
     * @param manager
     */
    public InstituteEntity(String name, String location, String manager) {
        this.name = name;
        this.location = location;
        this.manager = manager;
    }

    /**
     *
     * @param idInstitute
     * @param name
     * @param location
     * @param manager
     */
    public InstituteEntity(int idInstitute, String name, String location, String manager) {
        this.idInstitute = idInstitute;
        this.name = name;
        this.location = location;
        this.manager = manager;
    }

    /**
     *
     * @return
     */
    public int getIdInstitute() {
        return idInstitute;
    }

    /**
     *
     * @param idInstitute
     */
    public void setIdInstitute(int idInstitute) {
        this.idInstitute = idInstitute;
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
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return
     */
    public String getManager() {
        return manager;
    }

    /**
     *
     * @param manager
     */
    public void setManager(String manager) {
        this.manager = manager;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Institute{" + "idInstitute=" + idInstitute + ", name=" + name + ", location=" + location + ", manager=" + manager + '}';
    }

}
