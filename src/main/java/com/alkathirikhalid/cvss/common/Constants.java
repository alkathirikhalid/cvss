package com.alkathirikhalid.cvss.common;

/**
 *
 * @author alkathirikhalid
 */
public class Constants {

    /**
     * BaseServlet
     */
    public static final class BaseServlet {

        /**
         * BaseServler URL
         */
        public static final String URL = "WEB-INF/jsp/views/";
    }

    /**
     * HomeServlet
     */
    public static final class HomeServlet {

        /**
         * HomeServlet URL
         */
        public static final String URL = "public/home.jsp";
        /**
         * HomeServlet Title
         */
        public static final String TITLE = "Home";
    }

    /**
     * SignUpServlet
     */
    public static final class SignUpServlet {

        /**
         * SignUpServlet URL
         */
        public static final String URL = "public/signup.jsp";
        /**
         * SignUpServlet Title
         */
        public static final String TITLE = "Sign Up";
    }

    /**
     * SignInServlet
     */
    public static final class SignInServlet {

        /**
         * SignInServlet URL
         */
        public static final String URL = "public/signin.jsp";
        /**
         * SignInServlet Title
         */
        public static final String TITLE = "Sign In";
    }

    /**
     * DashboardServlet
     */
    public static final class DashboardServlet {

        /**
         * DashboardServlet URL
         */
        public static final String URL = "private/dashboard.jsp";
        /**
         * DashboardServlet Title
         */
        public static final String TITLE = "Dashboard";
    }

    /**
     * Request Attribute
     */
    public static final class Attribute {

        /**
         * Attribute title
         */
        public static final String TITLE = "title";
        /**
         * Attribute message
         */
        public static final String MESSAGE = "message";
    }
}
