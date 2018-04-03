package com.alkathirikhalid.cvss.controller.world;

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
@WebServlet(name = "MemberServlet", urlPatterns = {"/member"})
public class MemberServlet extends BaseServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response, String title, String message, String url) throws ServletException, IOException {
        super.doGet(request, response, Constants.Memberervlet.TITLE, message, Constants.Memberervlet.URL);
    }

}
