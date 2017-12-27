package com.alkathirikhalid.cvss.model.data.institute;

import com.alkathirikhalid.cvss.model.entity.InstituteEntity;
import java.util.List;

/**
 *
 * @author alkathirikhalid
 */
public interface InstituteDAO {

    int createInstitute(InstituteEntity institute);

    InstituteEntity getInstitute(int instituteID);

    List<InstituteEntity> getInstitutes();

    boolean updateInstitute(InstituteEntity institute);

    boolean deleteInstitute(int instituteID);
}
