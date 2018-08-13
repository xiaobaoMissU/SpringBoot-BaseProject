package com.zhengbiao.springbootlearner.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.zhengbiao.springbootlearner.mapper")
public class MybatisConfig {

}
