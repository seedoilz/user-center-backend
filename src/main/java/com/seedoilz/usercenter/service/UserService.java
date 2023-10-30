package com.seedoilz.usercenter.service;

import com.seedoilz.usercenter.model.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author seedoilz
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2023-09-08 13:39:39
*/
public interface UserService extends IService<User> {
    /**
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @return 返回脱敏的用户信息
     */
    User doLogin(String userAccount, String userPassword);
}
