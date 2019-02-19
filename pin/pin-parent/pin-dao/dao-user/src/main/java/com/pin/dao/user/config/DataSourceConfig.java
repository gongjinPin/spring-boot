package com.pin.dao.user.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * 数据库连接配置
 * @author
 * @create 2019-02-19 12:02
 **/
@Configuration
@MapperScan(basePackages = "com.pin.dao.user.*",
        sqlSessionTemplateRef = "sqlSessionTemplate")
public class DataSourceConfig {

    @Autowired
    Environment environment;


    private HikariDataSource getHikariDataSource(Environment environment) {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl(environment.getProperty("spring.datasource.hikari.pin.jdbc-url"));
        dataSource.setUsername(environment.getProperty("spring.datasource.hikari.pin.password"));// 用户名
        dataSource.setPassword(environment.getProperty("spring.datasource.hikari.pin.username"));// 密码
        dataSource.setDriverClassName(environment.getProperty("spring.datasource.hikari.driver-class-name"));
        dataSource.setMaxLifetime(Long.valueOf(environment.getProperty("spring.datasource.hikari.max-lifetime")));
        dataSource.setMaximumPoolSize(Integer.valueOf(environment.getProperty("spring.datasource.hikari.maximum-pool-size")));
        dataSource.setMinimumIdle(Integer.valueOf(environment.getProperty("spring.datasource.hikari.minimum-idle")));
        dataSource.setAutoCommit(Boolean.valueOf(environment.getProperty("spring.datasource.hikari.auto-commit")));
        dataSource.setIdleTimeout(Long.valueOf(environment.getProperty("spring.datasource.hikari.idle-timeout")));
        dataSource.setPoolName(environment.getProperty("spring.datasource.hikari.pool-name"));
        dataSource.setConnectionTimeout(Long.valueOf(environment.getProperty("spring.datasource.hikari.connection-timeout")));
        dataSource.setConnectionTestQuery(environment.getProperty("spring.datasource.hikari.connection-test-query"));
//        dataSource.setDataSourceClassName(environment.getProperty("spring.datasource.hikari.data-source-class-name"));
        return dataSource;
    }


    @Primary
    @Bean(name = "dataSource")
//    @ConfigurationProperties(prefix = "mysql")
    public DataSource getDataSource() {
//        //通过DataSourceBuilder构建数据源
//        return DataSourceBuilder.create().type(HikariDataSource.class).build();
        return this.getHikariDataSource(environment);
    }

    @Primary
    @Bean(name = "sqlSessionTemplate")
    public SqlSessionTemplate jdbcTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Primary
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
        bean.setTypeAliasesPackage("com.pin.model");
        return bean.getObject();
    }

    @Primary
    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager(@Qualifier("dataSource") DataSource prodDataSource) {
        return new DataSourceTransactionManager(prodDataSource);
    }
}
