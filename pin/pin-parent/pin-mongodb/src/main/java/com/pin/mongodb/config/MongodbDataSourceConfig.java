package com.pin.mongodb.config;

import com.mongodb.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;


/**
 * 手动配置mongoDB
 * @author
 * @create 2019-02-21 10:53
 **/
@Configuration
public class MongodbDataSourceConfig{

    @Autowired
    Environment environment;

    @Primary
    @Bean(name="mongoProperties")
    public MongoProperties mongoProperties() {
        MongoProperties mongoProperties=new MongoProperties();
        mongoProperties.setUri(environment.getProperty("spring.data.mongodb.uri"));
        return mongoProperties;
    }

    @Bean
    @Primary
    public MongoDbFactory factory() throws Exception {
        //如果你的 配置文件中 使用的是 uri 这里就配置 uri 网上很多这里配置错了，导致无法正常运行。
        return new SimpleMongoDbFactory(new MongoClientURI(mongoProperties().getUri()));
    }

    @Primary
    @Bean(name = "mongoTemplate")
    public MongoTemplate mongoTemplate() throws Exception {
        MongoDbFactory mongoDbFactory = factory();
        return new MongoTemplate(mongoDbFactory);
    }
}
