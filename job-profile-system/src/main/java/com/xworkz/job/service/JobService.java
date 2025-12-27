package com.xworkz.job.service;

import com.xworkz.job.dto.EducationDto;
import com.xworkz.job.dto.PersonalDto;

public interface JobService {
    boolean validateAndSave(PersonalDto personalDto);

    boolean educationValidate(EducationDto educationDto);
}
