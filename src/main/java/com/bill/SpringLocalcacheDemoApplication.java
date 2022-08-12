package com.bill;

import com.bill.service.observe.ConcurrentMapService;
import com.bill.service.observe.EhCacheService;
import com.bill.service.observe.RedisService;
import com.bill.service.subject.H2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class SpringLocalcacheDemoApplication {

	public static void main(String[] args) {
			SpringApplication.run(SpringLocalcacheDemoApplication.class, args);
	}
}
