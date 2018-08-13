package com.zhengbiao.springbootlearner.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public Queue rabbitQueue(){
		return new Queue("rabbit-queue");
	}
	
	
}
