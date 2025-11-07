package com.xworkz.formapp;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/patient",loadOnStartup = 1)
public class PatientInformationServlet extends GenericServlet {

    public PatientInformationServlet(){
        System.out.println("Created PatientInformation Servlet..............");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Executed PatientInformation ServletMethod.................");
        System.out.println("Patient Information");

        String patientFirstName= servletRequest.getParameter("patientFirstName");
        System.out.println("Patient FirstName:"+patientFirstName);

        String patientLastName= servletRequest.getParameter("patientLastName");
        System.out.println("Patient LastName:"+patientLastName);

        String patientDisease= servletRequest.getParameter("patientDisease");
        System.out.println("Patient Disease:"+patientDisease);

        String patientAge= servletRequest.getParameter("patientAge");
        System.out.println("Patient Age:"+patientAge);

        String patientMobNo= servletRequest.getParameter("patientMobNo");
        System.out.println("Patient MobNo:"+patientMobNo);

        String patientGender= servletRequest.getParameter("patientGender");
        System.out.println("Patient Gender:"+patientGender);

        String patientAddress= servletRequest.getParameter("patientAddress");
        System.out.println("Patient Address:"+patientAddress);

        String patientAdharNo= servletRequest.getParameter("patientAdharNo");
        System.out.println("Patient AdharNo:"+patientAdharNo);

        String patientDob= servletRequest.getParameter("patientDob");
        System.out.println("Patient Dob:"+patientDob);

        String patientCity= servletRequest.getParameter("patientCity");
        System.out.println("Patient City:"+patientCity);

        System.out.println("-----------------------------------");

        servletResponse.setContentType(patientFirstName);
        PrintWriter writer=servletResponse.getWriter();
        writer.println("data sent successfully....."+patientFirstName);

        servletResponse.setContentType(patientLastName);
        PrintWriter writer1=servletResponse.getWriter();
        writer1.println("data sent successfully........."+patientLastName);

        servletResponse.setContentType(patientDisease);
        PrintWriter writer2=servletResponse.getWriter();
        writer2.println("data sent successfully....."+patientDisease);

        servletResponse.setContentType(patientAge);
        PrintWriter writer3 =servletResponse.getWriter();
        writer3.println("data sent successfully....."+patientAge);

        servletResponse.setContentType(patientMobNo);
        PrintWriter writer4 =servletResponse.getWriter();
        writer4.println("data sent successfully....."+patientMobNo);

        servletResponse.setContentType(patientGender);
        PrintWriter writer5 =servletResponse.getWriter();
        writer5.println("data sent successfully....."+patientGender);

        servletResponse.setContentType(patientAddress);
        PrintWriter writer6 =servletResponse.getWriter();
        writer6.println("data sent successfully....."+patientAddress);

        servletResponse.setContentType(patientAdharNo);
        PrintWriter writer7 =servletResponse.getWriter();
        writer7.println("data sent successfully....."+patientAdharNo);

        servletResponse.setContentType(patientDob);
        PrintWriter writer8 =servletResponse.getWriter();
        writer8.println("data sent successfully....."+patientDob);

        servletResponse.setContentType(patientCity);
        PrintWriter writer9 =servletResponse.getWriter();
        writer9.println("data sent successfully....."+patientCity);

    }
}
