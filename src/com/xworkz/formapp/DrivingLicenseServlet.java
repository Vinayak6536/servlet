package com.xworkz.formapp;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

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


        servletResponse.setContentType(firstName);
        PrintWriter writer= servletResponse.getWriter();
        writer.println("data sent successfully...."+firstName);

        servletResponse.setContentType(middleName);
        PrintWriter writer1=servletResponse.getWriter();
        writer1.println("data sent successfully...."+middleName);

        servletResponse.setContentType(lastName);
        PrintWriter writer2=servletResponse.getWriter();
        writer2.println("data sent successfully...."+lastName);

        servletResponse.setContentType(dob);
       PrintWriter writer3= servletResponse.getWriter();
       writer3.println("data sent successfully...."+dob);

        servletResponse.setContentType(age);
       PrintWriter writer4= servletResponse.getWriter();
       writer4.println("data sent successfully...."+age);

        servletResponse.setContentType(adharNo);
       PrintWriter writer5= servletResponse.getWriter();
       writer5.println("data sent successfully...."+adharNo);

        servletResponse.setContentType(bloodGroup);
       PrintWriter writer6= servletResponse.getWriter();
       writer6.println("data sent successfully...."+bloodGroup);

        servletResponse.setContentType(category);
        PrintWriter writer7=servletResponse.getWriter();
        writer7.println("data sent successfully...."+category);

        servletResponse.setContentType(citizenship);
       PrintWriter writer8= servletResponse.getWriter();
       writer8.println("data sent successfully...."+citizenship);

        servletResponse.setContentType(country);


       PrintWriter writer9= servletResponse.getWriter();
       writer9.println("data sent successfully...."+country);

        servletResponse.setContentType(dist);
       PrintWriter writer10= servletResponse.getWriter();
       writer10.println("data sent successfully...."+dist);

        servletResponse.setContentType(education);
       PrintWriter writer11= servletResponse.getWriter();
       writer11.println("data sent successfully...."+education);

        servletResponse.setContentType(otp);
       PrintWriter writer12= servletResponse.getWriter();
       writer12.println("data sent successfully...."+otp);

        servletResponse.setContentType(state);
       PrintWriter writer13= servletResponse.getWriter();
       writer13.println("data sent successfully...."+state);


    }
}
