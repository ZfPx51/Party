package com.party.demo.controller;

import com.party.demo.domain.RubbishWorkers;
import com.party.demo.service.RubbishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Rubbish")
public class RubbishController {

    @Autowired
    private RubbishService rubbishService;

    @RequestMapping(value = "/getRubbish", method = {RequestMethod.GET})
    public List<RubbishWorkers> getRubbishWorkersData() {

        return rubbishService.getRubbishWorkersData();

    }

    @RequestMapping(value = "/getRubbishByCollectUser", method = {RequestMethod.GET})
    public List<RubbishWorkers> getRubbishByCollectUser(String collectUser) {

        return rubbishService.getRubbishByCollectUser(collectUser);

    }

}
