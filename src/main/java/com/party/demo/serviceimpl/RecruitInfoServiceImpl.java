package com.party.demo.serviceimpl;

import com.party.demo.domain.RecruitInfo;
import com.party.demo.mapper.RecruitMapper;
import com.party.demo.service.RecruitInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecruitInfoServiceImpl implements RecruitInfoService {

    @Autowired
    private RecruitMapper recruitMapper;

    @Override
    public List<RecruitInfo> getRecruitInfo() {
        return recruitMapper.getRecruitInfo();
    }
}
