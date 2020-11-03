package com.party.demo.mapper;

import com.party.demo.domain.WorkRenting;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkRentMapper {

    List<WorkRenting> getWorkRentingInfo();

}
