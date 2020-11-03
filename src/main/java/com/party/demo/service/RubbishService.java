package com.party.demo.service;

import com.party.demo.domain.RubbishWorkers;

import java.util.List;
import java.util.Map;

public interface RubbishService {
    String getRubbishData(String checkData) ;

    void InsertInfo(List<Map<String,Object>> list);

    String checkCreateDate();

    List<RubbishWorkers> getRubbishWorkersData();

    List<RubbishWorkers> getRubbishByCollectUser(String collectUser);
}
