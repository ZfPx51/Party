package com.party.demo.service;

import com.party.demo.domain.ParkLot;

import java.util.List;

public interface LotService {

    List<ParkLot> SearchParkLot(String status);

    Integer CountLotTrue();

    Integer CountLotFalse();
}
