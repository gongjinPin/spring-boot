package com.pin.mongodb.service;

import com.pin.mongodb.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author
 * @create 2019-02-20 17:39
 **/
public interface UserRepositoryService {

    /**
     * Like（模糊查询）
     * {"username" : name} ( name as regex)
     * */
    List<User> findByUsernameLike(String username);

    /**
     * Like（模糊查询）
     * {"username" : name}
     * */
    List<User> findByUsername(String username);

    /**
     * GreaterThan(大于)
     * {"age" : {"$gt" : age}}
     * */
    List<User> findByAgeGreaterThan(int age);
    /**
     * LessThan（小于）
     * {"age" : {"$lt" : age}}
     * */
    List<User> findByAgeLessThan(int age);
    /**
     * Between（在...之间）
     * {{"age" : {"$gt" : from, "$lt" : to}}
     * */
    List<User> findByAgeBetween(int from, int to);

    /**
     * IsNotNull, NotNull（是否非空）
     *  {"username" : {"$ne" : null}}
     * */
    List<User> findByUsernameNotNull();

    /**
     * IsNull, Null（是否为空）
     *   {"username" : null}
     * */
    List<User> findByUsernameNull();


    /**
     * Not（不包含）
     *    {"username" : {"$ne" : name}}
     * */
    List<User> findByUsernameNot(String name);



    /**
     *  Near（查询地理位置相近的）
     *  {"location" : {"$near" : [x,y]}}
     * */
    // findByLocationNear(Point point)


    /**
     * Within（在地理位置范围内的）
     *   {"location" : {"$within" : {"$center" : [ [x, y], distance]}}}
     * */
    //findByLocationWithin(Circle circle)


    /**
     *   Within（在地理位置范围内的）
     *     {"location" : {"$within" : {"$box" : [ [x1, y1], x2, y2]}}}
     * */
    // findByLocationWithin(Box box)


    Page<User> findByNameAndAgeRange(String name, int age, Pageable page);


    Page<User> findByNameAndAgeRange2(String name,int ageFrom,int ageTo,Pageable page);


    Page<User> findByNameAndAgeRange3(String name,int ageFrom,int ageTo,Pageable page);
}
