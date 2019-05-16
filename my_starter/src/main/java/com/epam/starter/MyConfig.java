package com.epam.starter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public VoronListener voronListener(){
        return new VoronListener();
    }
}
