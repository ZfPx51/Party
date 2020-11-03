package com.party.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
public class StartInfo {
    private Integer id;

    private String team;

    private Integer sumPerson;

    private String remarks;

    private Integer startFunt;

    private String industry;

    private String leader;

    private Date applyDate;
}
