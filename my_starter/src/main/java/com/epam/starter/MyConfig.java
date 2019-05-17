package com.epam.starter;

import com.epam.annotations.ConditionOnProduction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    @ConditionOnProduction
    public VoronListener voronListener(){
        return new VoronListener();
    }
}
