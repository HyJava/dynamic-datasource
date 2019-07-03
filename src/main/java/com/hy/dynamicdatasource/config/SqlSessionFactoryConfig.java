package com.hy.dynamicdatasource.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * User: HY
 * Date: 2019/7/2
 * Time: 15:46
 * Description:
 */
@Configuration
public class SqlSessionFactoryConfig {

    @Resource
    DataSource masterDataSource;
    @Resource
    DataSource slaveDataSource;

    @Bean("routingDataSource")
    public DataSource getRoutingDataSource(){
        RoutingDataSource routingDataSource = new RoutingDataSource();
        Map<Object, Object> map = new HashMap<>();
        map.put("masterDataSource",masterDataSource);
        map.put("slaveDataSource",slaveDataSource);
        routingDataSource.setTargetDataSources(map);
        return routingDataSource;
    }


    @Bean("sqlSessionFactory")
    public SqlSessionFactory getSqlSessionFactory() throws Exception {

        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(getRoutingDataSource());
        //添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        factoryBean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));

        return factoryBean.getObject();
    }
}
