package com.alkathirikhalid.cvss.model.data.institute;

import com.alkathirikhalid.cvss.model.entity.InstituteEntity;
import java.util.List;

/**
 *
 * @author alkathirikhalid
 */
public interface InstituteDAO {

    /**
     *
     * @param institute
     * @return
     */
    int createInstitute(InstituteEntity institute);

    /**
     *
     * @param instituteID
     * @return
     */
    InstituteEntity getInstitute(int instituteID);

    /**
     *
     * @return
     */
    List<InstituteEntity> getInstitutes();

    /**
     *
     * @param institute
     * @return
     */
    boolean updateInstitute(InstituteEntity institute);

    /**
     *
     * @param instituteID
     * @return
     */
    boolean deleteInstitute(int instituteID);
}
