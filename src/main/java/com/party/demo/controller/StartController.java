package com.party.demo.controller;

import com.party.demo.domain.RubbishWorkers;
import com.party.demo.domain.StartInfo;
import com.party.demo.service.RubbishService;
import com.party.demo.service.StartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Start")
public class StartController {
    @Autowired
    private StartService startService;

    @RequestMapping(value = "/getStartInfo", method = {RequestMethod.GET})
    public List<StartInfo> getStartInfo() {

        return startService.getStartInfo();

    }
}
