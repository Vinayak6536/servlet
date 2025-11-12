package com.xworkz.food;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/food", loadOnStartup = 1)
public class FoodOrderServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Executed FoodOrderServlet........");
        System.out.println("Food Order Details");

        String name = req.getParameter("name");
        System.out.println("Customer Name:" + name);

        String number = req.getParameter("number");
        System.out.println("Contact Number:" + number);

        String order = req.getParameter("order");
        System.out.println("Order Type:" + order);

        String items = req.getParameter("items");
        System.out.println("Menu Item:" + items);

        String delivary = req.getParameter("delivary");
        System.out.println("Delivery Instructions:" + delivary);

        System.out.println("---------------------------------");
        Cookie cookie = new Cookie("X-Workz", "12as34ZXS6738@1*2&3#");
        resp.addCookie(cookie);
        Cookie[] cookies = req.getCookies();

        if (cookies == null || cookies.length < 1) {
            throw new IllegalArgumentException("This Cockie Not found..... please reload the file");
        } else {
            for (Cookie c : cookies) {
                System.out.println("Name:" + c.getName() + " " + "Value:" + c.getValue());
            }
        }

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Food Order Details</title>");
        writer.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css' rel='stylesheet' "
                + "integrity='sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB' crossorigin='anonymous'>");
        writer.println("</head>");
        writer.println("<body class='bg-light'>");

        writer.println("<div class='container mt-5'>");
        writer.println("<div class='card shadow-lg p-4'>");
        writer.println("<h1 class='text-warning text-center mb-4'>Food Order Placed Successfully</h1>");

        writer.println("<pre class='fs-5'>");
        writer.println("Customer Name         : " + name);
        writer.println("Contact Number        : " + number);
        writer.println("Order Type            : " + order);
        writer.println("Items                 : " + items);
        writer.println("Delivery Instructions : " + delivary);
        writer.println("</pre>");

        writer.println("<div class='text-center mt-3'>");
        writer.println("<a href='FoodOrder.html' class='btn btn-success'>Place Another Food Order</a>");
        writer.println("</div>");
        writer.println("</div>");
        writer.println("</div>");

        writer.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js' "
                + "integrity='sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI' crossorigin='anonymous'></script>");
        writer.println("</body>");
        writer.println("</html>");


        // resp.sendRedirect("modak");


    }
}



