package com.party.demo.serviceimpl;


import com.party.demo.domain.Person;
import com.party.demo.mapper.MemberMapper;
import com.party.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public List<Person> getPerson() {

        return memberMapper.getPerson();
    }

    @Override
    public List<Person> getPersonByEducation(String levelEducation) {
        return memberMapper.getPersonByEducation(levelEducation);
    }
}
