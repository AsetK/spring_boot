package com.epam.starter;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class VoronListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("\n================== Отправляем ворона ==========================\n");

    }
}
