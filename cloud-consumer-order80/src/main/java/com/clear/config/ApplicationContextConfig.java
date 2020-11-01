package com.clear.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName ApplicationContextConfig
 *
 * @author qml
 * Date 2020/11/1 0001 18:36
 * Version 1.0
 **/
@Component
public class ApplicationContextConfig {

    @Bean
    private RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}