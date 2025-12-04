package com.xworkz.course.servlet;

import com.xworkz.course.dao.CourseReg;
import com.xworkz.course.dao.CourseRegDAOImpl;
import com.xworkz.course.dto.CourseRegDTO;
import com.xworkz.course.service.CourseRegValidate;
import com.xworkz.course.service.CourseRegValidateImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/course", loadOnStartup = 1)
public class CourseRegServlet extends HttpServlet {
    public CourseRegServlet() {
        System.out.println("Created Course Reg Servlet.............");
    }

    CourseReg courseReg = new CourseRegDAOImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Executed CourseReg Servlet...........");

        String name = req.getParameter("name");
        String dob = req.getParameter("dob");
        String phone=req.getParameter("phone");
        String address = req.getParameter("address");
        String gender = req.getParameter("gender");
        String course = req.getParameter("course");

resp.setContentType("text/html");
        req.setAttribute("name", name);
        req.setAttribute("dob", dob);
        req.setAttribute("phone",phone);
        req.setAttribute("address", address);
        req.setAttribute("gender", gender);
        req.setAttribute("course", course);


        CourseRegDTO courseRegDTO = new CourseRegDTO(name, dob,phone, address, gender, course);
        CourseRegValidate courseRegValidate = new CourseRegValidateImpl();
        boolean valid = courseRegValidate.validate(courseRegDTO);

        if (valid) {
            courseReg.savezCourseReg(courseRegDTO);
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("Result.jsp");
        requestDispatcher.forward(req, resp);
    }

}
