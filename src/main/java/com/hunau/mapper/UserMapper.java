package com.hunau.mapper;

import com.hunau.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    /**
     * 添加用户
     */
//    @Insert("insert into user(name,age) values(#{name},#{age})")
    void insertUser(User user);

    /**
     * 查询所有用户
     */
    List<User> selectUserAll();

    User selectUserById(Integer id);

    void updateUser(User user);

    void deleteUserById(int id);

}
