package com.xworkz.course.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseRegDTO implements Comparable{
    private String name;
    private String dob;
    private String phoneNo;
    private String address;
    private String gender;
    private String course;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
