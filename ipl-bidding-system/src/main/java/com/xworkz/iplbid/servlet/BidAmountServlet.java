package com.xworkz.iplbid.servlet;

import com.xworkz.iplbid.dto.BidAmountDto;
import com.xworkz.iplbid.service.IplBidService;
import com.xworkz.iplbid.service.impl.IplBidServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/bidAmount",loadOnStartup = 1)
public class BidAmountServlet extends HttpServlet {
    public BidAmountServlet(){
        System.out.println("Bid Amount Servlet started....");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Executed doPost method BidAmount....");

        String name=req.getParameter("name");
        double bidamount=Double.parseDouble(req.getParameter("bidAmount"));

        BidAmountDto bidAmountDto=new BidAmountDto(name,bidamount);

        IplBidService iplBidService=new IplBidServiceImpl();

        String result=iplBidService.placeBid(bidAmountDto);

        if ("BIDDING_CLOSED".equals(result)){
            req.setAttribute("message", "Bidding closed for player: " + name);
            req.getRequestDispatcher("BidClosed.jsp").forward(req, resp);
        } else if ("BID_SUCCESS".equals(result)) {
            req.setAttribute("message", "Bid placed successfully for" + name);
            req.getRequestDispatcher("BidSuccess.jsp").forward(req, resp);
        }
        else {
            req.setAttribute("message", "Bid failed. Try again.");
            req.getRequestDispatcher("Error.jsp").forward(req, resp);
        }


    }
}
