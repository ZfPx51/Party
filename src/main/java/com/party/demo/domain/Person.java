package com.party.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Person {
    private Integer id;

    private String name;

    private String gender;

    private Date birth;

    private String levelEducation;

    private Date inPartyDate;

    private String contactOne;

    private String contactTwo;

    private String society;

    private Integer age;

}