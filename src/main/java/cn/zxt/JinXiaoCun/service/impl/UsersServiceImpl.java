package cn.zxt.JinXiaoCun.service.impl;

import cn.zxt.JinXiaoCun.dao.UsersDao;
import cn.zxt.JinXiaoCun.pojo.Users;
import cn.zxt.JinXiaoCun.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Override
    public Users login(Users users) {
        users = usersDao.findByUser(users.getUserName(),users.getPassword());
        return users;
    }
}
