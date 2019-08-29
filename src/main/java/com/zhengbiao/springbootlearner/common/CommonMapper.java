package com.zhengbiao.springbootlearner.common;

import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Auther: zhengbiao
 * @Date: 2019/7/16 16:11
 * @Description:通用mapper接口
 */
public interface CommonMapper<T> extends tk.mybatis.mapper.common.BaseMapper<T>,MySqlMapper<T>, IdsMapper<T> {

    //自定义通用方法
}
