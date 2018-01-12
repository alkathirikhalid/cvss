package com.alkathirikhalid.cvss.controller.world;

import com.alkathirikhalid.cvss.common.Constants;
import com.alkathirikhalid.cvss.controller.base.BaseServlet;
import com.alkathirikhalid.cvss.model.entity.CertificateEntity;
import com.alkathirikhalid.util.Capitalize;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alkathirikhalid
 */
@WebServlet(name = "SearchServlet", urlPatterns = {"/search"})
public class SearchServlet extends BaseServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response, String title, String message, String url) throws ServletException, IOException {
        String institution = request.getParameter(Constants.Parameter.INSTITUTION);
        String certificatedid = request.getParameter(Constants.Parameter.CERTIFICATE_ID);
        CertificateEntity certificate = new CertificateEntity();
        // Institution param is mandatory
        if (null == institution || "".equals(institution)) {
            response.sendRedirect(Constants.Location.HOME);
            return;
        } // Certificate Id can be empty
        else if (null == certificatedid || "".equals(certificatedid)) {
            certificate.setInstitute(institution);
        } // To handle get request with both params
        else {
            certificate.setInstitute(institution);
            certificate.setCertificateId(certificatedid);
        }
        super.doGet(request, response, Constants.SearchServlet.TITLE, message, Constants.SearchServlet.URL);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response, String title, String message, String url) throws ServletException, IOException {
        String certificatedid = request.getParameter(Constants.Parameter.CERTIFICATE_ID);

        if (null == certificatedid | "".equals(certificatedid)) {
            // Stay on same page
            // give message
            message = Capitalize.firstLetter(Constants.Parameter.CERTIFICATE_ID.concat(Constants.Mesage.CAN_NOT_BE_EMPTY));
        } // TODO ADD VALIDATIONS
        else {
        }
        super.doPost(request, response, title, message, url);
    }

}
