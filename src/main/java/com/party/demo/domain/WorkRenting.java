package com.party.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class WorkRenting {
    private Integer id;

    private String buildNum;

    private String roomNum;

    private Integer area;

    private Integer status;

    private float rent;

    private String team;

    private String leader;

    private String leaderContact;

    private String workSum;
}
