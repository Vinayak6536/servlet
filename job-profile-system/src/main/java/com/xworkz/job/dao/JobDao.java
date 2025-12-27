package com.xworkz.job.dao;

import com.xworkz.job.dto.EducationDto;
import com.xworkz.job.dto.PersonalDto;

public interface JobDao {
    boolean personalDataSave(PersonalDto personalDto);

    boolean educationDataSave(EducationDto educationDto);
}
