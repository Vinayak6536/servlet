package com.xworkz.formapp;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/buyer",loadOnStartup = 1)
public class BuyerInformationServlet extends GenericServlet {
    public BuyerInformationServlet(){
        System.out.println("Created BuyerInformation Servlet......");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Executed BuyerInformation Servlet........");
        System.out.println("Buyer Information");

        String firstName= servletRequest.getParameter("firstName");
        System.out.println("First Name:"+firstName);

        String middleName= servletRequest.getParameter("middleName");
        System.out.println("Middle Name:"+middleName);

        String lastName= servletRequest.getParameter("lastName");
        System.out.println("Last Name:"+lastName);

        String age= servletRequest.getParameter("age");
        System.out.println("Age:"+age);

        String dob= servletRequest.getParameter("dob");
        System.out.println("Dob:"+dob);

        String gender= servletRequest.getParameter("gender");
        System.out.println("Gender:"+gender);

        String email= servletRequest.getParameter("email");
        System.out.println("Email:"+email);

        String mobNo= servletRequest.getParameter("mobNo");
        System.out.println("Mob No:"+mobNo);

        String address= servletRequest.getParameter("address");
        System.out.println("Address:"+address);

        String school= servletRequest.getParameter("school");
        System.out.println("Do you have a preferred school district?:"+school);

        String rent= servletRequest.getParameter("rent");
        System.out.println("Do you currently Own or Rent?:"+rent);

        String bedRoom= servletRequest.getParameter("bedRoom");
        System.out.println("How many bedrooms do you need?:"+bedRoom);

        System.out.println("---------------------------------------");




    }
}
