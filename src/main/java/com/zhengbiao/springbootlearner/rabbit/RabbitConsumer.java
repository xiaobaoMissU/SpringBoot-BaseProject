package com.zhengbiao.springbootlearner.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitConsumer {

	@RabbitListener(queues = {"rabbit-queue"})
	public void consumeMsg(String msg){
		System.out.println(msg);
	}
}
