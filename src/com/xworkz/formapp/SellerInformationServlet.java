package com.xworkz.formapp;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/seller",loadOnStartup = 1)
public class SellerInformationServlet extends GenericServlet {
    public SellerInformationServlet(){
        System.out.println("Created SellerInformation Servlet.....................");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Executed SellerInformation Servlet................");
        System.out.println("Seller Information");

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

        String code= servletRequest.getParameter("code");
        System.out.println("Area Code:"+code);

        String house= servletRequest.getParameter("house");
        System.out.println("Do You Currently Live in the House:"+house);

        String sell= servletRequest.getParameter("sell");
        System.out.println("Why Are You Selling?:"+sell);

        System.out.println("-------------------------------------");

        servletResponse.setContentType(firstName);
        PrintWriter writer=servletResponse.getWriter();
        writer.println("data sent successfully...."+firstName);

        servletResponse.setContentType(middleName);
        PrintWriter writer1=servletResponse.getWriter();
        writer1.println("data sent successfully...."+middleName);

        servletResponse.setContentType(lastName);
        PrintWriter writer2=servletResponse.getWriter();
        writer2.println("data sent successfully...."+lastName);

        servletResponse.setContentType(age);
        PrintWriter writer3=servletResponse.getWriter();
        writer3.println("data sent successfully...."+age);

        servletResponse.setContentType(address);
        PrintWriter writer4=servletResponse.getWriter();
        writer4.println("data sent successfully...."+address);

        servletResponse.setContentType(code);
        PrintWriter writer5=servletResponse.getWriter();
        writer5.println("data sent successfully...."+code);

        servletResponse.setContentType(dob);
        PrintWriter writer6=servletResponse.getWriter();
        writer6.println("data sent successfully...."+dob);

        servletResponse.setContentType(email);
        PrintWriter writer7=servletResponse.getWriter();
        writer7.println("data sent successfully...."+email);

        servletResponse.setContentType(gender);
        PrintWriter writer8=servletResponse.getWriter();
        writer8.println("data sent successfully...."+gender);

        servletResponse.setContentType(house);
        PrintWriter writer9=servletResponse.getWriter();
        writer9.println("data sent successfully...."+house);

        servletResponse.setContentType(mobNo);
        PrintWriter writer10=servletResponse.getWriter();
        writer10.println("data sent successfully...."+mobNo);

        servletResponse.setContentType(sell);
        PrintWriter writer11=servletResponse.getWriter();
        writer11.println("data sent successfully...."+sell);
    }
}
