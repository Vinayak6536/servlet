package com.xworkz.basketapp;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/clg",loadOnStartup = 1)
public class CollegeSevelet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Welcome collegeservlet Tomcat.................");

    }

    public CollegeSevelet(){
        System.out.println("Welcome collegeservlet Tomcat.................");

    }
}
