package com.xworkz.iplbid.servlet;

import com.xworkz.iplbid.dto.IplBidDto;
import com.xworkz.iplbid.dto.PlayerDto;
import com.xworkz.iplbid.service.IplBidService;
import com.xworkz.iplbid.service.impl.IplBidServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/searchPlayer",loadOnStartup = 1)
public class SearchPlayerServlet extends HttpServlet {
    public SearchPlayerServlet(){
        System.out.println("Created Search Player Servlet....");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Started Search Player goGet...");

       String playerType= req.getParameter("playerType");
       double avgValue=Double.parseDouble(req.getParameter("avgValue"));

        PlayerDto playerDto=new PlayerDto(playerType,avgValue);

        IplBidService iplBidService=new IplBidServiceImpl();
        List<IplBidDto> players = iplBidService.getPlayers(playerDto);

        System.out.println(players);

        if ((players == null || players.isEmpty())){
            req.setAttribute("error","Players not available..!");
            req.getRequestDispatcher("SearchPlayer.jsp").forward(req,resp);
        }else{
            req.setAttribute("player",players);
            req.getRequestDispatcher("PlayersDetailsList.jsp").forward(req,resp);
        }

    }
}
