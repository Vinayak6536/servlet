package com.xworkz.formapp;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

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

        servletResponse.setContentType(firstName);
        PrintWriter writer=servletResponse.getWriter();
        writer.println("data sent successfully........"+firstName);

        servletResponse.setContentType(middleName);
        PrintWriter writer1=servletResponse.getWriter();
        writer1.println("data sent successfully....."+middleName);

        servletResponse.setContentType(lastName);
        PrintWriter writer2=servletResponse.getWriter();
        writer2.println("data sent successfully...."+lastName);

        servletResponse.setContentType(age);
        PrintWriter writer3=servletResponse.getWriter();
        writer3.println("data sent successfully...."+age);

        servletResponse.setContentType(dob);
        PrintWriter writer4=servletResponse.getWriter();
        writer4.println("data sent successfully...."+dob);

        servletResponse.setContentType(gender);
        PrintWriter writer5=servletResponse.getWriter();
        writer5.println("data sent successfully...."+gender);

        servletResponse.setContentType(email);
        PrintWriter writer6=servletResponse.getWriter();
        writer6.println("data sent successfully...."+email);

        servletResponse.setContentType(mobNo);
        PrintWriter writer7=servletResponse.getWriter();
        writer7.println("data sent successfully...."+mobNo);

        servletResponse.setContentType(address);
        PrintWriter writer8=servletResponse.getWriter();
        writer8.println("data sent successfully...."+address);

        servletResponse.setContentType(school);
        PrintWriter writer9=servletResponse.getWriter();
        writer9.println("data sent successfully...."+school);

        servletResponse.setContentType(rent);
        PrintWriter writer10=servletResponse.getWriter();
        writer10.println("data sent successfully...."+rent);

        servletResponse.setContentType(bedRoom);
        PrintWriter writer11=servletResponse.getWriter();
        writer11.println("data sent successfully...."+bedRoom);


    }
}
