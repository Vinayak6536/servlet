package com.xworkz.course.service;

import com.xworkz.course.dto.CourseRegDTO;

public class CourseRegValidateImpl implements CourseRegValidate{
    @Override
    public boolean validate(CourseRegDTO courseRegDTO) {
        System.out.println("Validation page");
        boolean invalid= false;
        if (courseRegDTO != null){
            if (courseRegDTO.getName() == null || courseRegDTO.getName().length() <= 2){
                System.out.println("Name is Invalid...");
                invalid=true;
            } else if (courseRegDTO.getDob() == null || courseRegDTO.getDob().length() < 2) {
                System.out.println("Date Of birth is Invalid...");
                invalid=true;
            } else if (courseRegDTO.getAddress() == null || courseRegDTO.getAddress().length() < 5) {
                System.out.println("Address is Invalid...");
                invalid=true;
            } else if (courseRegDTO.getGender() == null ) {
                System.out.println("Gender is Invalid...");
                invalid=true;

            } else if (courseRegDTO.getCourse() == null || courseRegDTO.getCourse().length() < 2) {
                System.out.println("Course is Invalid...");
                invalid=true;

            }
            else {
                System.out.println("Successfully Validated");
                invalid=true;
            }

        }
        return invalid;
    }
}
