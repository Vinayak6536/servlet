package com.xworkz.iplbid.servlet;

import com.xworkz.iplbid.dto.EmailDto;
import com.xworkz.iplbid.exception.DataNotSavedException;
import com.xworkz.iplbid.service.EmailService;
import com.xworkz.iplbid.service.impl.EmailServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/email",loadOnStartup = 1)
public class EmailServlet extends HttpServlet {
    public EmailServlet(){
        System.out.println("Running Email Servlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("EmailServlet doPostMethod.....");

        req.getParameter("text/html");

        String companyName=req.getParameter("companyName");
        String email=req.getParameter("email");

        EmailDto emailDto=new EmailDto(companyName,email);
        System.out.println(emailDto);
        EmailService emailService=new EmailServiceImpl();
        boolean valid=emailService.validateAndSave(emailDto);
        if (valid){
            System.out.println("Saved Email");
            req.getRequestDispatcher("EmailResult.jsp").forward(req,resp);
        }
        else {
            throw new DataNotSavedException("Data Not Saved Check properly.....");
        }

    }
}
