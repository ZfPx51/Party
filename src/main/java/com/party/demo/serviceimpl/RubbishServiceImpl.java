package com.party.demo.serviceimpl;

import com.party.demo.domain.RubbishWorkers;
import com.party.demo.mapper.RubbishCollectMapper;
import com.party.demo.service.RubbishService;
import com.party.demo.util.ApacheHttpUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class RubbishServiceImpl implements RubbishService {

    @Autowired
    private ApacheHttpUtil apacheHttpUtil;

    @Autowired
    private RubbishCollectMapper rubbishCollectMapper;

    @Value("${rubbish.url}")
    private String url;
    @Value("${rubbish.appid}")
    private String appid;
    @Value("${rubbish.secret}")
    private String secret;

    private String param;
    List<NameValuePair> params = new ArrayList<NameValuePair>();

    @Override
    public String getRubbishData(String checkData) {


        String l = String.valueOf(System.currentTimeMillis());
        if (StringUtils.isEmpty(checkData)) {
            System.out.println("本地表为空正在插入");
            param = "appId=" + appid + "&pageSize=5&time=" + l + "&key=" + secret;
            String sign = DigestUtils.md5Hex(param).toUpperCase();

            params.add(new BasicNameValuePair("appId", appid));
            params.add(new BasicNameValuePair("time", l));
            params.add(new BasicNameValuePair("sign", sign));
            params.add(new BasicNameValuePair("pageSize", "5"));
        } else {
            param = "appId=" + appid + "&pageSize=5"+"&startTime=" + checkData+"&time=" + l + "&key=" + secret;
            String sign = DigestUtils.md5Hex(param).toUpperCase();

            params.add(new BasicNameValuePair("appId", appid));
            params.add(new BasicNameValuePair("startTime", checkData));
            params.add(new BasicNameValuePair("time", l));
            params.add(new BasicNameValuePair("sign", sign));
            params.add(new BasicNameValuePair("pageSize", "5"));
        }



        String response = null;
        try {
            response = apacheHttpUtil.httpPost(url + "/cooPaPi/getRubbishList", params);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    @Override
    public void InsertInfo(List<Map<String, Object>> list) {
        rubbishCollectMapper.InsertInfo(list);
    }

    @Override
    public String checkCreateDate() {

        String data = rubbishCollectMapper.checkCreateDate();
        if (StringUtils.isEmpty(data))
            return null;
        else
            return data;
    }

    @Override
    public List<RubbishWorkers> getRubbishWorkersData() {
        return rubbishCollectMapper.getRubbishWorkersData();
    }

    @Override
    public List<RubbishWorkers> getRubbishByCollectUser(String collectUser) {
        return rubbishCollectMapper.getRubbishByCollectUser(collectUser);
    }


}
