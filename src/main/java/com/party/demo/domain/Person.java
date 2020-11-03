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

    public Person() {
    }

    public Person(Integer id, String name, String gender, Date birth, String levelEducation, Date inPartyDate, String contactOne, String contactTwo, String society, Integer age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.levelEducation = levelEducation;
        this.inPartyDate = inPartyDate;
        this.contactOne = contactOne;
        this.contactTwo = contactTwo;
        this.society = society;
        this.age = age;
    }
}
