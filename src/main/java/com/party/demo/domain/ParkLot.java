package com.party.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ParkLot {
    private String ParkNum;

    private String CarNum;

    private String status;
}
