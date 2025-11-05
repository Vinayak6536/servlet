package com.xworkz.basketapp;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/fitness",loadOnStartup = 1)
public class FitnessSerfvelet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Welcome fitnessservlet Tomcat.................");

    }

    public FitnessSerfvelet(){
        System.out.println("Welcome fitnessservlet const.................");

    }
}
