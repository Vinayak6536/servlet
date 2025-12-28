package com.xworkz.iplbid.dto;

import lombok.*;

@Setter
@Getter

@NoArgsConstructor
@ToString
public class PlayerDto {
    private String playerType;

    private double avgValue;

    public PlayerDto(String playerType,double avgValue){
        this.playerType=playerType;
        this.avgValue=avgValue;
    }
}
