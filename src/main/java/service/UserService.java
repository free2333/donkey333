package service;

import domain.TestUser;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/8.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public TestUser checkUser(TestUser user){
       return userMapper.checkUser(user.getId(),user.getPassword());
    }
}
