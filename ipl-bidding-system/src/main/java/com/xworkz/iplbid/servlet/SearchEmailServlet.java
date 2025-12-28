package com.xworkz.iplbid.servlet;

import com.xworkz.iplbid.dto.EmailDto;
import com.xworkz.iplbid.exception.DataInvalidException;
import com.xworkz.iplbid.exception.DataNotSavedException;
import com.xworkz.iplbid.service.EmailService;
import com.xworkz.iplbid.service.impl.EmailServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/SearchEmailServlet", loadOnStartup = 1)
public class SearchEmailServlet extends HttpServlet {
    public SearchEmailServlet() {
        System.out.println("Created SearchEmailServlet........");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running SearchEmailServlet doGet method....");

        req.getParameter("text/html");

        String email = req.getParameter("email");

        EmailDto emailDto = new EmailDto(email);

        System.out.println(emailDto);

        EmailService emailService = new EmailServiceImpl();
        Optional<EmailDto> emailDto1 = emailService.getEmailDetails(emailDto);
        if (emailDto1.isPresent()) {
            req.getSession().setAttribute("cmpemail", emailDto1.get());
            req.getRequestDispatcher("SearchPlayer.jsp").forward(req, resp);
        } else {
            req.setAttribute("error", "This e-mail is not exist");
            req.getRequestDispatcher("SearchEmail.jsp").forward(req, resp);


        }

    }
}
