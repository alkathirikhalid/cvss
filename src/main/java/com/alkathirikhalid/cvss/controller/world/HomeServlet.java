package com.alkathirikhalid.cvss.controller.world;

import com.alkathirikhalid.cvss.common.Constants;
import com.alkathirikhalid.cvss.controller.base.BaseServlet;
import com.alkathirikhalid.cvss.model.data.institute.InstituteIMP;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alkathirikhalid
 */
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
        // TODO Handle Institution Selection
        // Get Selected Institution From the Request
        // Server Side Validation on Posted Institution Param
        // Forward Request
        super.doPost(request, response, Constants.HomeServlet.TITLE, message, Constants.HomeServlet.URL);
    }
}
