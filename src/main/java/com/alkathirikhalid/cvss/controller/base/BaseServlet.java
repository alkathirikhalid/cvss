package com.alkathirikhalid.cvss.controller.base;

import com.alkathirikhalid.cvss.common.Constants;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alkathirikhalid
 */
public abstract class BaseServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private String title;
    /**
     *
     */
    private String url;
    /**
     *
     */
    private String message;

    /**
     *
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException {
        super.init();
        title = "";
        message = "";
        url = Constants.BaseServlet.URL;
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response, title, message, url);
    }

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response, String title, String message, String url)
            throws ServletException, IOException {
        request.setAttribute(Constants.Attribute.TITLE, title);
        request.setAttribute(Constants.Attribute.MESSAGE, message);
        request.getRequestDispatcher(this.url + url).forward(request, response);
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response, title, message, url);
    }

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response, String title, String message, String url)
            throws ServletException, IOException {
        request.setAttribute(Constants.Attribute.TITLE, title);
        request.setAttribute(Constants.Attribute.MESSAGE, message);
        request.getRequestDispatcher(this.url + url).forward(request, response);
    }
}
