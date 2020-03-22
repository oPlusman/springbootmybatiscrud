package com.hunau.service;

import com.hunau.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {
    /**
     * 添加用户
     */
    void addUser(User user);

    /**
     * 查询所有用户
     * @return
     */
    List <User> findUserAll();
    /**
     * 通过id查询用户
     */
    User findUserById(int id);
    /**
     * 更新
     */
    void updateUser(User user);

    /**
     * 删除
     * @param id
     */
    void deleteUserById(int id);
}
