package com.party.demo.mapper;

import com.party.demo.domain.RecruitInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecruitMapper {

    List<RecruitInfo> getRecruitInfo();
}
