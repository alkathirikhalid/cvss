package com.alkathirikhalid.cvss.controller.world;

import com.alkathirikhalid.cvss.common.Constants;
import com.alkathirikhalid.cvss.controller.base.BaseServlet;
import com.alkathirikhalid.cvss.model.data.institute.InstituteIMP;
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
@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends BaseServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     * @param request
     * @param response
     * @param title
     * @param message
     * @param url
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response, String title, String message, String url) throws ServletException, IOException {
        request.setAttribute(Constants.Attribute.INSTITUTES, new InstituteIMP().getInstitutes());
        super.doGet(request, response, Constants.HomeServlet.TITLE, message, Constants.HomeServlet.URL);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response, String title, String message, String url) throws ServletException, IOException {
        String institution = request.getParameter(Constants.Parameter.INSTITUTION);
        if (null == institution || "".equals(institution)) {
            message = Capitalize.firstLetter(Constants.Parameter.INSTITUTION.concat(Constants.Mesage.CAN_NOT_BE_EMPTY));
        } // TODO ADD VALIDATIONS
        else {
            title = Constants.SearchServlet.TITLE;
            url = Constants.SearchServlet.URL;
            request.setAttribute(Constants.Attribute.INSTITUTION, institution);
        }
        super.doPost(request, response, title, message, url);
    }
}
