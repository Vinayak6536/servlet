package com.xworkz.iplbid.service.impl;

import com.xworkz.iplbid.dao.EmailDao;
import com.xworkz.iplbid.dao.impl.EmailDaoImpl;
import com.xworkz.iplbid.dto.EmailDto;
import com.xworkz.iplbid.dto.IplBidDto;
import com.xworkz.iplbid.service.EmailService;

import java.util.Optional;

public class EmailServiceImpl implements EmailService {
    EmailDao emailDao=new EmailDaoImpl();
    @Override
    public boolean validateAndSave(EmailDto emailDto) {
        boolean isValid=false;

        if (emailDto != null){
            if (emailDto.getCompanyName().trim().isEmpty()){
                System.out.println("Enter Valid CompanyName");
                isValid=true;
            } else if (emailDto.getEmail().trim().isEmpty()) {
                System.out.println("Enter Valid Email");
            }
            else {

                emailDao.save(emailDto);
                isValid=true;
            }
        }

        return isValid;
    }

    @Override
    public Optional<EmailDto> getEmailDetails(EmailDto emailDto) {

       if (emailDto != null){
           if (emailDto.getEmail().isEmpty()){
               System.out.println("Enter Valid Email");
           }else {
                Optional<EmailDto> valid=emailDao.getData(emailDto);

                if (valid.isPresent()){

                    return Optional.of(emailDto);
                }
           }
       }
        return Optional.empty();
    }
}
