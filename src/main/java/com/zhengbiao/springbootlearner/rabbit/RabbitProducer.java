package com.zhengbiao.springbootlearner.rabbit;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitProducer {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public void sendMsg(String keyRoute,Object msg){
		rabbitTemplate.convertAndSend(keyRoute,msg);
		System.out.println("消息已发送");
	}
}
