package com.party.demo.mapper;

import com.party.demo.domain.RubbishWorkers;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface RubbishCollectMapper {

    void InsertInfo(List<Map<String,Object>> list);

    String checkCreateDate();

    List<RubbishWorkers> getRubbishWorkersData();
}
