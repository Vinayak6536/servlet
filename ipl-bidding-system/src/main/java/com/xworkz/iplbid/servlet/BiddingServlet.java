package com.xworkz.iplbid.servlet;

import com.xworkz.iplbid.dto.IplBidDto;
import com.xworkz.iplbid.exception.DataInvalidException;
import com.xworkz.iplbid.service.IplBidService;
import com.xworkz.iplbid.service.impl.IplBidServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/bidding",loadOnStartup = 1)
public class BiddingServlet extends HttpServlet {
    public BiddingServlet(){
        System.out.println("BiddingServletStarted....");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Executed doGet method BidAmount...");

        String name=req.getParameter("bidPlayer");



        IplBidService iplBidService=new IplBidServiceImpl();
        Optional<IplBidDto> fetched=iplBidService.getPlayerName(name);
        if (fetched.isPresent()){
            System.out.println("Fetched Details");
            req.setAttribute("playerlist",fetched.get());
            req.getRequestDispatcher("BuyPlayer.jsp").forward(req,resp);
        }else {
            throw new DataInvalidException("Data Not fetched....");
        }
    }
}
