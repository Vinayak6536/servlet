package com.xworkz.iplbid.service;

import com.xworkz.iplbid.dto.EmailDto;
import com.xworkz.iplbid.dto.IplBidDto;

import java.util.Optional;

public interface EmailService {
    boolean validateAndSave(EmailDto emailDto);

    Optional<EmailDto> getEmailDetails(EmailDto emailDto);
}
