package com.xworkz.course.dao;

import com.xworkz.course.dto.CourseRegDTO;

public class CourseRegDAOImpl implements CourseReg{
    @Override
    public void savezCourseReg(CourseRegDTO courseRegDTO) {
        System.out.println("Started Save Mathod");

        System.out.println("Course Registration successfully......");
    }
}
