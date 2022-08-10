package com.bill.config;

import com.bill.service.H2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class H2Config {
    @Autowired
    private H2Service h2Service;

    @Bean
    public void updateCache() {
        h2Service.updateCache();
    }
}
