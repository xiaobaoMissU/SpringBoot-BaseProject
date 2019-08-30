package com.zhengbiao.springbootlearner.service;

import com.zhengbiao.springbootlearner.mapper.BasePlatformUserMapper;
import com.zhengbiao.springbootlearner.model.BasePlatformUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: zhengbiao
 * @Date: 2019/8/30 09:07
 * @Description:
 */
@Service
public class TestService {

  @Autowired
  private BasePlatformUserMapper basePlatformUserMapper;

  public void test1(){

    BasePlatformUser basePlatformUser = new BasePlatformUser();
    basePlatformUser.setId("1");
    BasePlatformUser basePlatformUser1 = basePlatformUserMapper.selectOne(basePlatformUser);

  }
}
