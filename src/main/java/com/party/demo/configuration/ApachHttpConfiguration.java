package com.party.demo.configuration;

import com.party.demo.util.ApacheHttpUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApachHttpConfiguration {

    @Bean
    public ApacheHttpUtil getUtil(){
        return new ApacheHttpUtil();
    }
}
