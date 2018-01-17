package com.jwt.mybatis1.dao;

import com.jwt.mybatis1.bo.User;
import org.apache.ibatis.annotations.Param;

/**
 * ÓÃ»§mapper
 *
 * @author juwenting
 * @date 2018/1/17 ÏÂÎç1:52
 */
public interface UserMapper {

    int insertUser(User addUser);

    int deleteByName(@Param("name")String name);

    User selectUserById(@Param("idnumber")String idNo);

    int updateByAge(@Param("User")User updateUser, @Param("updateAge") int age);

}
