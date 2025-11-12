package com.xworkz.flight;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/flight",loadOnStartup = 1)
public class FlightTicketServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Executed FlightTicketServlet........");
        System.out.println("Flight Ticket Details");

        String name= req.getParameter("name");
        System.out.println("Passenger Name:"+name);

        String number= req.getParameter("number");
        System.out.println("Passport number:"+number);

        String classes= req.getParameter("class");
        System.out.println("Class Type:"+classes);

        String destination= req.getParameter("destination");
        System.out.println("Destination:"+destination);

        String special= req.getParameter("special");
        System.out.println("Special Assistance:"+special);

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

        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Flight Ticket Details</title>");
        writer.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css' rel='stylesheet' "
                + "integrity='sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB' crossorigin='anonymous'>");
        writer.println("</head>");
        writer.println("<body class='bg-light'>");

        writer.println("<div class='container mt-5'>");
        writer.println("<div class='card shadow-lg p-4'>");
        writer.println("<h1 class='text-primary text-center mb-4'>Flight Ticket Booked Successfully</h1>");

        writer.println("<pre class='fs-5'>");
        writer.println("Passenger Name     : " + name);
        writer.println("Passport Number    : " + number);
        writer.println("Class Type         : " + classes);
        writer.println("Destination        : " + destination);
        writer.println("Special Assistance : " + special);
        writer.println("</pre>");

        writer.println("<div class='text-center mt-3'>");
        writer.println("<a href='FlightTicket.html' class='btn btn-success'>Book Another Flight Ticket</a>");
        writer.println("</div>");
        writer.println("</div>");
        writer.println("</div>");

        writer.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js' "
                + "integrity='sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI' crossorigin='anonymous'></script>");
        writer.println("</body>");
        writer.println("</html>");



    }
}
