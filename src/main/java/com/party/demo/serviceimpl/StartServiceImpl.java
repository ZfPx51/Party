package com.party.demo.serviceimpl;

import com.party.demo.domain.StartInfo;
import com.party.demo.mapper.StartMapper;
import com.party.demo.service.StartService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StartServiceImpl implements StartService {
    @Autowired
    private StartMapper startMapper;

    @Override
    public List<StartInfo> getStartInfo() {
        return startMapper.getStartInfo();
    }
}
