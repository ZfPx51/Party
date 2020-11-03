package com.party.demo.controller;

import com.party.demo.domain.ParkLot;
import com.party.demo.service.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( value = "/ParkLot")
public class LotController {

    @Autowired
    private LotService lotService;

    @RequestMapping(value = "/SearchParkLot", method = {RequestMethod.GET})
    public List<ParkLot> SearchParkLot(String status) {
        return lotService.SearchParkLot(status);
    }

    @RequestMapping(value = "/CountLotTrue", method = {RequestMethod.GET})
    public Integer CountLotTrue() {
        return lotService.CountLotTrue();
    }

    @RequestMapping(value = "/CountLotFalse", method = {RequestMethod.GET})
    public Integer CountLotFalse() {
        return lotService.CountLotFalse();
    }
}
