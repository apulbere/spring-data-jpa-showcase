package com.endava.university.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Staff_member")
public class Staff {
    @Id
    @GeneratedValue
    private Integer id;

    @Embedded
    private Person member;
}
