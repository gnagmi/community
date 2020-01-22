package top.nhmt.community.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.nhmt.community.dao.UserMapper;
import top.nhmt.community.entity.User;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectUserById(int id){
        return userMapper.selectById(id);
    }
}
