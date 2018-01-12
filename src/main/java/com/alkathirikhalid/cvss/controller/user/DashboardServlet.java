package com.alkathirikhalid.cvss.controller.user;

import com.alkathirikhalid.cvss.common.Constants;
import com.alkathirikhalid.cvss.controller.base.BaseServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alkathirikhalid
 */
@WebServlet(name = "DashboardServlet", urlPatterns = {"/dashboard"})
public class DashboardServlet extends BaseServlet {

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
        super.doGet(request, response, Constants.DashboardServlet.TITLE, message, Constants.DashboardServlet.URL);
    }
}
