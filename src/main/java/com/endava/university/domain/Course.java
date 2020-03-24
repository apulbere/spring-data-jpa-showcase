package com.endava.university.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@ToString(exclude = "prerequisites")
@Entity
@Table(name="COURSE")
public class Course {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer credits;

    @OneToOne
    private Staff instructor;

    @ManyToMany(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private List<Course> prerequisites = new ArrayList<>();

    @ManyToOne
    private Department department;
}
