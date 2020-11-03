package com.party.demo.mapper;

import com.party.demo.domain.RentingInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentMapper {

    List<RentingInfo> getRentingInfo();

}
