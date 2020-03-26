package com.endava.university.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@ToString(exclude = "courses")
@Entity
@Table(name="STUDENT")
public class Student {
    @Id
    @GeneratedValue
    private Integer studentId;

    @Embedded
    private Person attendee;

    @Column
    private boolean fullTime;

    @Column
    private LocalDate birthDate;

    @OneToMany
    private List<Course> courses = new ArrayList<>();
}
