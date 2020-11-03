package com.party.demo.mapper;

import com.party.demo.domain.ParkLot;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LotMapper {

    List<ParkLot> SearchParkLot(String status);

    Integer CountLotTrue();

    Integer CountLotFalse();

}
