package com.xworkz.iplbid.service.impl;

import com.xworkz.iplbid.dao.IplBidDao;
import com.xworkz.iplbid.dao.impl.IplBidDaoImpl;
import com.xworkz.iplbid.dto.BidAmountDto;
import com.xworkz.iplbid.dto.EmailDto;
import com.xworkz.iplbid.dto.IplBidDto;
import com.xworkz.iplbid.dto.PlayerDto;
import com.xworkz.iplbid.service.IplBidService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class IplBidServiceImpl implements IplBidService {
    IplBidDao iplBidDao=new IplBidDaoImpl();
    @Override
    public boolean validateAndSave(IplBidDto iplBidDto) {
        System.out.println("Running Validate and save method...");
        boolean isValid=false;

        if (iplBidDto != null){
            if (iplBidDto.getName().trim().isEmpty()) {
                System.out.println("Enter Valid name");
                isValid=true;
            } else if (iplBidDto.getAge() < 18 ) {
                System.out.println("You are Not Eligible.... because your age below 18");
                isValid=true;
            } else if (iplBidDto.getPlayerType().trim().isEmpty()) {
                System.out.println("Enter valid player Type");
                isValid=true;
            } else if (iplBidDto.getState().trim().isEmpty()) {
                System.out.println("Enter valid state name");
                isValid=true;
            }else if (iplBidDto.getBattingAvg() < 0){
                System.out.println("Enter Valid Batting avg");
                isValid=true;
            } else if (iplBidDto.getBowlingAvg() < 0) {
                System.out.println("Enter Valid Bowling avg");
                isValid=true;
            }
            else {

                iplBidDao.save(iplBidDto);
                isValid=true;
            }


        }
        return isValid;
    }

    @Override
    public List<IplBidDto> getPlayers(PlayerDto playerDto) {
        System.out.println("Player Servlet started");

        if (playerDto!= null){
            if (playerDto.getPlayerType().trim().isEmpty()){
                System.out.println("Enter Valid Player Name");

            } else if (playerDto.getAvgValue() < 0) {
                System.out.println("Enter valid player Avg");

            }
            else {

                List<IplBidDto> players=iplBidDao.getPlayer(playerDto);

                if (!(players == null || players.isEmpty())) {
                    System.out.println("players");
                    return players;
                } else {

                    System.out.println("player bidding service ended");
                    return null;
                }


            }
        }
        return new ArrayList<>();
    }

    @Override
    public Optional<IplBidDto> getPlayerName(String  name) {

        if (name != null){
            Optional<IplBidDto> iplBidDto=iplBidDao.getPlayerName(name);
            if (iplBidDto.isPresent()){
                return Optional.of(iplBidDto.get());
            }
        }

        return Optional.empty();
    }

    @Override
    public String placeBid(BidAmountDto dto) {
        int bidCount=iplBidDao.getBidCountByPlayer(dto.getName());

        if (bidCount >= 3){
            return "BIDDING_CLOSED";
        }

        boolean saved=iplBidDao.saveBid(dto);

        return saved ? "BID_SUCCESS" : "BID_FAILED";
    }
}
