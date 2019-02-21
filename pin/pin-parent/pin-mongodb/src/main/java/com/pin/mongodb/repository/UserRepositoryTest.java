package com.pin.mongodb.repository;

import com.pin.mongodb.PinMongodbApplication;
import com.pin.mongodb.dao.UserRepository;
import com.pin.mongodb.entity.User;
import com.pin.mongodb.service.UserRepositoryService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author
 * @create 2019-02-20 17:34
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = PinMongodbApplication.class)
public class UserRepositoryTest {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserRepositoryService userRepositoryService;

    @Before
    public void setUp() {
        //userRepositoryService.deleteAll();
    }


    @Test
    public void test() throws Exception {

        // 创建10个User，并验证User总数
        userRepository.save(new User(1L, "didi", 30));
        userRepository.save(new User(2L, "mama", 40));
        userRepository.save(new User(3L, "kaka", 50));
        userRepository.save(new User(4L, "didi2", 30));
        userRepository.save(new User(5L, "mama", 40));
        userRepository.save(new User(6L, "kaka2", 50));
        userRepository.save(new User(7L, "kaka", 50));
        userRepository.save(new User(8L, "kao", 50));
        userRepository.save(new User(9L, "ekakae", 50));
        userRepository.save(new User(10L, "kaka5", 50));
        userRepository.save(new User(11L, "", 50));
        userRepository.save(new User(12L, null, 50));
        this.logger.info(String.valueOf(userRepository.findAll().size()));

        // 删除一个User，再验证User总数
        /*User u = userRepositoryService.findOne(1L);
        this.logger.info(u.toString());
        userRepositoryService.delete(u);
        this.logger.info(String.valueOf(userRepositoryService.findAll().size()));

        // 删除一个User，再验证User总数
        u = userRepositoryService.findByUsername("mama").get(0);
        this.logger.info(u.toString());
        userRepositoryService.delete(u);
        this.logger.info(String.valueOf(userRepositoryService.findAll().size()));*/

    }

    @Test
    public void test2() throws Exception {

        // 删除一个User，再验证User总数
        List<User> u1 = userRepositoryService.findByUsernameLike("kaka");
        this.logger.info(u1.toString());
        List<User> u2 = userRepositoryService.findByUsername("mama");
        this.logger.info(u2.toString());
        List<User> u3 = userRepositoryService.findByAgeGreaterThan(40);
        this.logger.info(u3.toString());
        List<User> u4 = userRepositoryService.findByAgeLessThan(40);
        this.logger.info(u4.toString());
        List<User> u5 = userRepositoryService.findByAgeBetween(30,45);
        this.logger.info(u5.toString());
        List<User> u6 = userRepositoryService.findByUsernameNotNull();
        this.logger.info(u6.toString());
        List<User> u7 = userRepositoryService.findByUsernameNull();
        this.logger.info(u7.toString());
        List<User> u8 = userRepositoryService.findByUsernameNot("kaka");
        this.logger.info(u8.toString());




    }

    @Test
    public void test3() throws Exception {

        Pageable pageable = new PageRequest(0,10);
        Page<User> u1 = userRepositoryService.findByNameAndAgeRange("kaka",50,pageable);
        this.logger.info(u1.toString());
        Page<User> u2 = userRepositoryService.findByNameAndAgeRange2("kaka",0,50,pageable);
        this.logger.info(u2.toString());
        Page<User> u3 = userRepositoryService.findByNameAndAgeRange3("kaka",0,50,pageable);
        this.logger.info(u3.toString());

    }
}
