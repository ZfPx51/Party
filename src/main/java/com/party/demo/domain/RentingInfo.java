package com.party.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class RentingInfo {
    private Integer id;

    private String buildNum;

    private String roomNum;

    private Integer roomArea;

    private String decorate;

    private float rent;

    private String liveTeam;

    private Integer sumPerson;

    private String status;

    private Date liveDate;
}
