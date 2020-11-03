package com.party.demo.mapper;


import com.party.demo.domain.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberMapper {

    List<Person> getPerson();

    List<Person> getPersonByEducation(String levelEducation);

}
