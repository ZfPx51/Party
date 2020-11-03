package com.party.demo.controller;

import com.party.demo.domain.RecruitInfo;
import com.party.demo.service.RecruitInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Recruit")
public class RecruitController {

    @Autowired
    private RecruitInfoService recruitInfoService;

    @RequestMapping(value = "/getRecruitInfo", method = {RequestMethod.GET})
    public List<RecruitInfo> getRecruitInfo() {

        return recruitInfoService.getRecruitInfo();

    }
}
