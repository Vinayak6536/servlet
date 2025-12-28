package com.xworkz.iplbid.servlet;

import com.xworkz.iplbid.dto.IplBidDto;
import com.xworkz.iplbid.exception.DataNotSavedException;
import com.xworkz.iplbid.service.IplBidService;
import com.xworkz.iplbid.service.impl.IplBidServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register",loadOnStartup = 1)
public class IplBidServlet extends HttpServlet {
    public IplBidServlet(){
        System.out.println("Created IPL Bid Servlet...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doPost Ipl Bid Method...");

        req.getParameter("text/html");

        String name=req.getParameter("name");
        int age=Integer.parseInt(req.getParameter("age"));
        String playerType=req.getParameter("playerType");
        String state=req.getParameter("state");
        double battingAvg=Double.parseDouble(req.getParameter("battingAvg"));
        double bowlingAvg=Double.parseDouble(req.getParameter("bowlingAvg"));
        int stumps=Integer.parseInt(req.getParameter("stumps"));

        IplBidDto iplBidDto=new IplBidDto(name,age,playerType,state,battingAvg,bowlingAvg,stumps);
        System.out.println(iplBidDto);
        IplBidService iplBidService=new IplBidServiceImpl();

        boolean valid=iplBidService.validateAndSave(iplBidDto);

        System.out.println(valid);
        if (valid){

            req.getRequestDispatcher("RegisterFormResult.jsp").forward(req,resp);
        }else{
             throw new DataNotSavedException("Data Not Saved check Properly....");
        }


    }
}
