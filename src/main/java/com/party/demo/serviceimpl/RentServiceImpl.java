package com.party.demo.serviceimpl;

import com.party.demo.domain.RentingInfo;
import com.party.demo.mapper.RentMapper;
import com.party.demo.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentServiceImpl implements RentService {
    @Autowired
    private RentMapper rentMapper;

    @Override
    public List<RentingInfo> getRentingInfo() {
        return rentMapper.getRentingInfo();
    }
}
