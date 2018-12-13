package cn.zxt.JinXiaoCun.dao;

import cn.zxt.JinXiaoCun.pojo.Users;
import org.apache.ibatis.annotations.Param;

public interface UsersDao {
    Users findByUser(@Param("userName") String userName, @Param("password") String password);
}
