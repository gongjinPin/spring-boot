package com.pin.mongodb.service.impl;

import com.pin.mongodb.dao.UserRepository;
import com.pin.mongodb.entity.User;
import com.pin.mongodb.service.UserRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @create 2019-02-20 17:39
 **/
@Service
public class UserRepositoryServiceImpl implements UserRepositoryService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> findByUsernameLike(String username) {
        return userRepository.findByUsernameLike(username);
    }

    @Override
    public List<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findByAgeGreaterThan(int age) {
        return userRepository.findByAgeGreaterThan(age);
    }

    @Override
    public List<User> findByAgeLessThan(int age) {
        return userRepository.findByAgeLessThan(age);
    }

    @Override
    public List<User> findByAgeBetween(int from, int to) {
        return userRepository.findByAgeBetween( from,  to);
    }

    @Override
    public List<User> findByUsernameNotNull() {
        return userRepository.findByUsernameNotNull();
    }

    @Override
    public List<User> findByUsernameNull() {
        return userRepository.findByUsernameNull();
    }

    @Override
    public List<User> findByUsernameNot(String name) {
        return userRepository.findByUsernameNot(name);
    }

    @Override
    public Page<User> findByNameAndAgeRange(String name, int age, Pageable page) {
        return userRepository.findByNameAndAgeRange(name,age,page);
    }

    @Override
    public Page<User> findByNameAndAgeRange2(String name, int ageFrom, int ageTo, Pageable page) {
        return userRepository.findByNameAndAgeRange2(name,ageFrom,ageTo,page);
    }

    @Override
    public Page<User> findByNameAndAgeRange3(String name, int ageFrom, int ageTo, Pageable page) {
        return userRepository.findByNameAndAgeRange3(name,ageFrom,ageTo,page);
    }
}
