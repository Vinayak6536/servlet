package com.xworkz.product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/product", loadOnStartup = 1)
public class EcommerceProductServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Executed EcommerceProduct Servlet......");
        System.out.println("EcommerceProduct Details.....");

        String name = req.getParameter("name");
        System.out.println("Product Name:" + name);

        String price = req.getParameter("price");
        System.out.println("Product Price:" + price);

        String color = req.getParameter("color");
        System.out.println("Color:" + color);

        String category = req.getParameter("category");
        System.out.println("Category:" + category);

        String description = req.getParameter("description");
        System.out.println("Description:" + description);

        System.out.println("---------------------------------");
        //        Cookie cookie = new Cookie("X-Workz", "12as34ZXS6738@1*2&3#");
        //        resp.addCookie(cookie);
        Cookie[] cookies = req.getCookies();
        if (cookies == null || cookies.length < 1) {
            throw new IllegalArgumentException("Cookie is not Created Go To Index page And Create Cookie......");
        } else {
            for (Cookie cookie : cookies)
                System.out.println("The name of the Cookie Name is:" + cookie.getName() + "Value of the Cookie is:" + cookie.getValue());
        }

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<!DOCTYPE html>");
        writer.println("<html lang='en'>");
        writer.println("<head>");
        writer.println("<meta charset='UTF-8'>");
        writer.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        writer.println("<title>Product Details</title>");
        writer.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css' rel='stylesheet' "
                + "integrity='sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB' crossorigin='anonymous'>");
        writer.println("</head>");
        writer.println("<body class='bg-light'>");

        writer.println("<div class='container mt-5'>");
        writer.println("<div class='card shadow-lg p-4'>");
        writer.println("<h1 class='text-center text-primary mb-4'>Product Details Saved Successfully</h1>");
        writer.println("<pre class='fs-5'>");
        writer.println("Product Name : " + name);
        writer.println("Product Price : ₹" + price);
        writer.println("Color : " + color);
        writer.println("Category : " + category);
        writer.println("Description : " + description);
        writer.println("</pre>");
        writer.println("<div class='text-center mt-3'>");
        writer.println("<a href='EcommerceProduct.html' class='btn btn-success'>Click here for Another Product</a>");
        writer.println("</div>");
        writer.println("</div>");
        writer.println("</div>");

        writer.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js' "
                + "integrity='sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI' crossorigin='anonymous'></script>");
        writer.println("</body>");
        writer.println("</html>");


    }
}
