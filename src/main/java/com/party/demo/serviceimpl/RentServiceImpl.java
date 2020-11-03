package com.party.demo.serviceimpl;

import com.party.demo.domain.RentingInfo;
import com.party.demo.mapper.RentMapper;
import com.party.demo.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RentServiceImpl implements RentService {
    @Autowired
    private RentMapper rentMapper;

    @Override
    public List<RentingInfo> getRentingInfo() {
        return rentMapper.getRentingInfo();
    }
}
