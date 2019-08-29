package com.zhengbiao.springbootlearner.model;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Table(name = "base_platform_user")
@Data
public class BasePlatformUser {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 用户编号
     */
    @Column(name = "user_no")
    private String userNo;

    /**
     * 用户名称
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 姓名
     */
    private String name;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 添加人id
     */
    @Column(name = "creater_id")
    private String createrId;

    /**
     * 头像地址
     */
    @Column(name = "head_url")
    private String headUrl;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 是否展示：0-展示，1-不展示
     */
    @Column(name = "is_show")
    private Byte isShow;

    /**
     * 状态：0-禁用，1-启用
     */
    private Byte status;

    /**
     * 是否删除：0-未删除，1-已删除
     */
    private Byte dr;

}