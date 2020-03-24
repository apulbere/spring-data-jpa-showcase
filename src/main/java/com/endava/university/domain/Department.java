package com.endava.university.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@ToString(exclude = "courses")
@Entity
@Table(name="Department")
public class Department {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @OneToOne
    private Staff chair;

    @OneToMany(fetch = FetchType.EAGER,mappedBy="department",
            cascade = CascadeType.ALL)
    private List<Course> courses = new ArrayList<>();
}
