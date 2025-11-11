package com.xworkz.movie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/movie",loadOnStartup = 1)
public class MovieTicketBookingServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Executed MovieTicketBookingServlet........");
        System.out.println("MovieTicketBooking Details");

       String name= req.getParameter("name");
        System.out.println("Movie Name:"+name);

        String price= req.getParameter("price");
        System.out.println("Movie Price:"+price);

        String seat= req.getParameter("seat");
        System.out.println("Movie Seat Type:"+seat);

        String theatre= req.getParameter("theatre");
        System.out.println("Theatre Name:"+theatre);

        String feedback= req.getParameter("feedback");
        System.out.println("Movie Feedback:"+feedback);

        System.out.println("---------------------------------");

        resp.setContentType("name");
        PrintWriter writer=resp.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<pre>");
        writer.println("<h1 style='color:blue'>Movie Ticket is Booked Successfully....</h1>");
        writer.println("Movie Name:"+name);
        writer.println("Movie Price:"+price);
        writer.println("Movie Seat Type:"+seat);
        writer.println("Theatre:"+theatre);
        writer.println("Movie Feedback:"+feedback);
        writer.println("</pre>");
        writer.println("</body>");
        writer.println("</html>");

    }
}
