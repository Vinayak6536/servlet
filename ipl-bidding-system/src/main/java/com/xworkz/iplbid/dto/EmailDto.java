package com.xworkz.iplbid.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmailDto {
    private String companyName;
    private String email;

    public EmailDto(String email) {
        this.email=email;
    }
}
