package com.party.demo.serviceimpl;

import com.party.demo.domain.StartInfo;
import com.party.demo.mapper.StartMapper;
import com.party.demo.service.StartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StartServiceImpl implements StartService {
    @Autowired
    private StartMapper startMapper;

    @Override
    public List<StartInfo> getStartInfo() {
        return startMapper.getStartInfo();
    }
}
