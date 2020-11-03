package com.party.demo.serviceimpl;

import com.party.demo.domain.WorkRenting;
import com.party.demo.mapper.WorkRentMapper;
import com.party.demo.service.WorkRentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class WorkRentServiceImpl implements WorkRentService {
    @Autowired
    private WorkRentMapper workRentMapper;

    @Override
    public List<WorkRenting> getWorkRentingInfo() {
        return workRentMapper.getWorkRentingInfo();
    }
}
