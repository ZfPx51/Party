package com.party.demo.mapper;

import com.party.demo.domain.StartInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StartMapper {

    List<StartInfo> getStartInfo();
}
