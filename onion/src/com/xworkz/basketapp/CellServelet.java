package com.xworkz.basketapp;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/cell",loadOnStartup = 1)
public class CellServelet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Welcome cellservlet Tomcat.................");

    }

    public CellServelet(){
        System.out.println("Welcome cellservlet const.................");

    }
}
