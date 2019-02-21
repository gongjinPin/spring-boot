package com.pin.controller.user.log;

import com.pin.common.result.Result;
import com.pin.mongodb.dao.UserRepository;
import com.pin.mongodb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author
 * @create 2019-02-21 9:11
 **/
@Service
public class UserRepositoryLog {

    @Autowired
    UserRepository userRepository;

    public String saveUserRepositoryLog(){
        userRepository.save(new User(15L, "赵婧文", 30));
        return Result.success().toJSON();
    }
}
