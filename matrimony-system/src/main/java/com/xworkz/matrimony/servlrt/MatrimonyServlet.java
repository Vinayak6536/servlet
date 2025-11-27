package com.xworkz.matrimony.servlrt;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/matrimony" , loadOnStartup = 1)
public class MatrimonyServlet extends HttpServlet {
    public MatrimonyServlet(){
        System.out.println("Created Matrimony Servlet...........");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Executing Matrimony Servlet......");

        String email=req.getParameter("email");
        String profile=req.getParameter("profile");
        String gender=req.getParameter("gender");
        String dob=req.getParameter("dob");
        String tongue=req.getParameter("tongue");
        String religion=req.getParameter("religion");
        String marital=req.getParameter("marital");
        String height=req.getParameter("height");

        req.setAttribute("email",email);
        req.setAttribute("profile",profile);
        req.setAttribute("gender",gender);
        req.setAttribute("dob",dob);
        req.setAttribute("tongue",tongue);
        req.setAttribute("religion",religion);
        req.setAttribute("marital",marital);
        req.setAttribute("height",height);

        RequestDispatcher requestDispatcher =req.getRequestDispatcher("MatrimonyResult.jsp");
        requestDispatcher.forward(req,resp);

        System.out.println("Matrimony Servlet Inform");
        System.out.println("Email:"+email);
        System.out.println("Profile for:"+profile);
        System.out.println("Gender:"+gender);
        System.out.println("Date Of Birth:"+dob);
        System.out.println("Mother Tongue:"+tongue);
        System.out.println("Religion:"+religion);
        System.out.println("Marital Status:"+marital);
        System.out.println("Height:"+height);

        System.out.println("Connect Database");
        String url="jdbc:mysql://localhost:3306/matrimony";
        String username="root";
        String password="Vina@2002";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println(connection);
        } catch (SQLException e) {
            System.out.println("error msg:"+e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
