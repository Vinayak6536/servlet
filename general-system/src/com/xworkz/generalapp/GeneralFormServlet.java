package com.xworkz.generalapp;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet(urlPatterns="/general" , loadOnStartup= 1)
public class GeneralFormServlet extends GenericServlet{

    @Override
    public void service(ServletRequest servletRequest,ServletResponse servletResponce) throws ServletException, IOException{
        System.out.println("Created Servlet ");
    }

   public GeneralFormServlet(){
       System.out.println("Servlet Const");
   }
}
