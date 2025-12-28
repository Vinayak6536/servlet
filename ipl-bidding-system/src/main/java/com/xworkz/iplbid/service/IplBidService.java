package com.xworkz.iplbid.service;

import com.xworkz.iplbid.dto.BidAmountDto;
import com.xworkz.iplbid.dto.EmailDto;
import com.xworkz.iplbid.dto.IplBidDto;
import com.xworkz.iplbid.dto.PlayerDto;

import java.util.List;
import java.util.Optional;

public interface IplBidService {
    boolean validateAndSave(IplBidDto iplBidDto);

    List<IplBidDto> getPlayers(PlayerDto playerDto);

    Optional<IplBidDto> getPlayerName(String  name);

    String placeBid(BidAmountDto dto);
}
