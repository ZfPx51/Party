package com.party.demo.task;


import com.alibaba.fastjson.JSON;
import com.party.demo.service.RubbishService;
import com.party.demo.serviceimpl.RubbishServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;
import java.util.Map;


@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling
public class MainTask {


    /**
     * 定期清理temp目录下的文件
     * （每天2点触发一次）
     */
    @Autowired
    private RubbishService rubbishService;

    @Scheduled(cron = "0 0 9,21 * * ? ")
    public void InsertTable() {
        System.out.println(111);
        String checkData = rubbishService.checkCreateDate();
        String data= rubbishService.getRubbishData(checkData);
        Object succesResponse = JSON.parse(data);    //先转换成Object
        Map map = (Map) succesResponse;
        //System.out.println(map);//Object强转换为Map
        System.out.println(map.get("data"));
        rubbishService.InsertInfo((List<Map<String, Object>>) map.get("data"));
    }

}
