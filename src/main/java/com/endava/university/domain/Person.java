package com.endava.university.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class Person {
    @Column
    private String firstName;

    @Column
    private String lastName;
}
