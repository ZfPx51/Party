package com.party.demo.controller;

import com.party.demo.domain.RentingInfo;
import com.party.demo.domain.StartInfo;
import com.party.demo.service.RentService;
import com.party.demo.service.StartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Rent")
public class RentController {
    @Autowired
    private RentService rentService;

    @RequestMapping(value = "/getRentingInfo", method = {RequestMethod.GET})
    public List<RentingInfo> getRentingInfo() {

        return rentService.getRentingInfo();

    }
}
