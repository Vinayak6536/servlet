package com.xworkz.formapp;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

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
    }
}
