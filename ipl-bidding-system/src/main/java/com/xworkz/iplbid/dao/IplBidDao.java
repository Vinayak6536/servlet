package com.xworkz.iplbid.dao;

import com.xworkz.iplbid.dto.BidAmountDto;
import com.xworkz.iplbid.dto.IplBidDto;
import com.xworkz.iplbid.dto.PlayerDto;

import java.util.List;
import java.util.Optional;

public interface IplBidDao {
    boolean save(IplBidDto iplBidDto);

    List<IplBidDto> getPlayer(PlayerDto playerDto);

    Optional<IplBidDto> getPlayerName(String name);

    int getBidCountByPlayer(String name);

    boolean saveBid(BidAmountDto dto);
}
