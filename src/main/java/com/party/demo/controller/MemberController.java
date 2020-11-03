package com.party.demo.controller;


import com.party.demo.domain.Person;
import com.party.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/partyMember")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/getPersonById", method = {RequestMethod.GET})
    public List<Person> getPerson() {
        return memberService.getPerson();
    }

    @RequestMapping(value = "/getPersonByEducation", method = {RequestMethod.GET})
    public Map<String, Object> getPersonByEducation(String levelEducation) {
        HashMap map = new HashMap();
        Integer i = 0;
        List<Person> personByEducation = memberService.getPersonByEducation(levelEducation);
        for (Person ignored : personByEducation) {
            i++;
        }
        map.put(levelEducation + "文化水平人数：", i);
        map.put("info", personByEducation);

        return map;
    }

}
