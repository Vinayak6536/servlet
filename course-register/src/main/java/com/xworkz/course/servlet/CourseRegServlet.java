package com.xworkz.course.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns="/course",loadOnStartup = 1)
public class CourseRegServlet extends HttpServlet {
    public CourseRegServlet(){
        System.out.println("Created Course Reg Servlet.............");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Executed CourseReg Servlet...........");

        String name=req.getParameter("name");
        String dob=req.getParameter("dob");
        String address=req.getParameter("address");
        String gender=req.getParameter("gender");
        String course=req.getParameter("course");


        req.setAttribute("name",name);
        req.setAttribute("dob",dob);
        req.setAttribute("address",address);
        req.setAttribute("gender",gender);
        req.setAttribute("course",course);

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("Result.jsp");
        requestDispatcher.forward(req,resp);

    }
}
