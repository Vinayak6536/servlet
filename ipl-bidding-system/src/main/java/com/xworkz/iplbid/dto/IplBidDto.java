package com.xworkz.iplbid.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class IplBidDto {

    private String name;
    private int age;
    private String playerType;
    private String state;
    private double battingAvg;
    private double bowlingAvg;
    private int stumps;

    public IplBidDto(String name){
        this.name=name;
    }
}
