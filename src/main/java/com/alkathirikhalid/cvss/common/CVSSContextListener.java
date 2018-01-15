/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alkathirikhalid.cvss.common;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author alkathirikhalid
 */
@WebListener
public class CVSSContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // Start Up
        // initialize the current year for copyright notice
        GregorianCalendar currentDate = new GregorianCalendar();
        int currentYear = currentDate.get(Calendar.YEAR);
        sce.getServletContext().setAttribute(Constants.Common.CURRENT_YEAR, currentYear);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // Clean Up
    }

}
