package com.endava.university.domain;

import lombok.Data;

import javax.persistence.*;

@Data
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

    @ManyToOne
    private Department department;
}
