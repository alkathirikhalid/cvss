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
     * SearchServlet
     */
    public static final class SearchServlet {

        /**
         * SearchServlet URL
         */
        public static final String URL = "public/search.jsp";
        /**
         * SearchServlet Title
         */
        public static final String TITLE = "Search";
    }

    /**
     * MemberServlet
     */
    public static final class Memberervlet {

        /**
         * MemberServlet URL
         */
        public static final String URL = "public/member.jsp";
        /**
         * SearchServlet Title
         */
        public static final String TITLE = "Member";
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
     * AccountServlet
     */
    public static final class AccountServlet {

        /**
         * AccountServlet URL
         */
        public static final String URL = "private/account.jsp";
        /**
         * AccountServlet Title
         */
        public static final String TITLE = "Account";
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
        /**
         * Attribute institutes
         */
        public static final String INSTITUTES = "institutes";

        /**
         * Attribute Institution
         */
        public static final String INSTITUTION = "institution";
    }

    /**
     * Request Parameter
     */
    public static final class Parameter {

        /**
         * Parameter Institution
         */
        public static final String INSTITUTION = "institution";
        /**
         * Parameter CertificateId
         */
        public static final String CERTIFICATE_ID = "certificateid";
    }

    /**
     * Request Message
     */
    public static final class Mesage {

        /**
         * Message can not be empty
         */
        public static final String CAN_NOT_BE_EMPTY = " can not be empty";
    }

    /**
     * Relative Path
     */
    public static final class Location {

        /**
         * Home
         */
        public static final String HOME = "home";
    }

    /**
     * Common Application Constants
     */
    public static final class Common {

        /**
         * Home
         */
        public static final String CURRENT_YEAR = "currentYear";
    }
}
