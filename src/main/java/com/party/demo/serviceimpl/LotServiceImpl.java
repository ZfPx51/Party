package com.party.demo.serviceimpl;

import com.party.demo.domain.ParkLot;
import com.party.demo.mapper.LotMapper;
import com.party.demo.mapper.MemberMapper;
import com.party.demo.service.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LotServiceImpl implements LotService {
    @Autowired
    private LotMapper lotMapper;


    @Override
    public List<ParkLot> SearchParkLot(String status) {
        return lotMapper.SearchParkLot(status);
    }

    @Override
    public Integer CountLotTrue() {
        return lotMapper.CountLotTrue();
    }

    @Override
    public Integer CountLotFalse() {
        return lotMapper.CountLotFalse();
    }
}
