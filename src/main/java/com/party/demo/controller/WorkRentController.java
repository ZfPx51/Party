package com.party.demo.controller;

import com.party.demo.domain.WorkRenting;
import com.party.demo.service.WorkRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/WorkRent")
public class WorkRentController {
    @Autowired
    private WorkRentService workRentService;

    @RequestMapping(value = "/getWorkRentingInfo", method = {RequestMethod.GET})
    public List<WorkRenting> getStartInfo() {

        return workRentService.getWorkRentingInfo();

    }
}
