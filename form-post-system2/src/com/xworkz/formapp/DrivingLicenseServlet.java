package com.xworkz.formapp;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/driving" , loadOnStartup = 1)
public class DrivingLicenseServlet extends GenericServlet{
    public DrivingLicenseServlet(){
        System.out.println("created DrivingLicense Servlet................");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Executed DrivingLicense Servlet.............");
        System.out.println("Driving License Information");

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

        String education= servletRequest.getParameter("education");
        System.out.println("Education:"+education);

        String bloodGroup= servletRequest.getParameter("bloodGroup");
        System.out.println("BloodGroup:"+bloodGroup);

        String citizenship= servletRequest.getParameter("citizenship");
        System.out.println("Citizenship:"+citizenship);

        String dist= servletRequest.getParameter("dist");
        System.out.println("Dist:"+dist);

        String state= servletRequest.getParameter("state");
        System.out.println("State:"+state);

        String country= servletRequest.getParameter("country");
        System.out.println("Country:"+country);

        String category= servletRequest.getParameter("category");
        System.out.println("Category:"+category);

        String adharNo= servletRequest.getParameter("adharNo");
        System.out.println("AdharNo:"+adharNo);

        String otp= servletRequest.getParameter("otp");
        System.out.println("OTP:"+otp);

        System.out.println("------------------------------------");








    }
}
