package com.endava.university.view;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CourseView {
    private String name;
    private String instructorLastName;
    private String deptName;
}
