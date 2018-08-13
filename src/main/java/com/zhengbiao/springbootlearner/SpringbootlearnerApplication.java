package com.zhengbiao.springbootlearner;

import java.util.List;

import net.minidev.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhengbiao.springbootlearner.mapper.UserMapper;
import com.zhengbiao.springbootlearner.model.User;
import com.zhengbiao.springbootlearner.model.UserPropertiesModel;
import com.zhengbiao.springbootlearner.rabbit.RabbitProducer;

@RestController
@SpringBootApplication
public class SpringbootlearnerApplication {
	
	@Value("${server.port}")
	private String port;
	
	@Autowired
	private UserPropertiesModel userConfig;
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Autowired
	private RabbitProducer rabbitProducer;
	
	@Autowired
	private UserMapper userMapper;
	
	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(SpringbootlearnerApplication.class);
		app.setBannerMode(Mode.OFF); //关闭显示banners
		app.run(args);
	}
	
	@RequestMapping("/test")
	public String requestTest() throws InterruptedException{
		
		System.out.println(userConfig.getName() + ":" +userConfig.getAge());
		
		HashOperations opsForHash = redisTemplate.opsForHash();
		opsForHash.put("zhengbiao", "aaa", "111");
		
		System.out.println(opsForHash.get("zhengbiao", "aaa"));
		
		//发送消息
		rabbitProducer.sendMsg("rabbit-queue", "一个来自rabbit的消息");
		
		//查询数据
		List<User> users = userMapper.findAll();
		System.out.println(JSONArray.toJSONString(users));
		
		
		return "hello spring boot";
	}
}
