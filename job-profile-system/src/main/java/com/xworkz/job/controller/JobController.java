package com.xworkz.job.controller;

import com.xworkz.job.dto.EducationDto;
import com.xworkz.job.dto.PersonalDto;
import com.xworkz.job.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class JobController {
    public JobController(){
        System.out.println("Running Job Controller");
    }
    @Autowired
    private JobService jobService;

    @PostMapping("personal")
    public String addPersonal(PersonalDto personalDto){

        boolean saved= jobService.validateAndSave(personalDto);

        if (saved){
            return "EducationDetails";
        }else {
            return "Error";
        }
    }

    @PostMapping("education")
    public String addEducation(EducationDto educationDto){

        boolean saved=jobService.educationValidate(educationDto);
        if (saved){
            return "Experience";
        }
        return "Error";

    }
}
