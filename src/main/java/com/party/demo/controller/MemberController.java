package com.party.demo.controller;


import com.party.demo.domain.Person;
import com.party.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( value = "/partyMember")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/getPersonById", method = {RequestMethod.GET})
    public List<Person> getPerson() {
        return memberService.getPerson();
    }
}
