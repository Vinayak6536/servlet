package com.xworkz.iplbid.dao;

import com.xworkz.iplbid.dto.EmailDto;
import com.xworkz.iplbid.dto.IplBidDto;

import java.util.Optional;

public interface EmailDao {
    boolean save(EmailDto emailDto);

    Optional<EmailDto> getData(EmailDto emailDto);
}
