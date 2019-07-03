package com.hy.dynamicdatasource.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.HashMap;
import java.util.Map;

/**
 * User: HY
 * Date: 2019/7/2
 * Time: 15:35
 * Description:
 */
@Configuration
public class DataSourceConfig {

    @Bean("masterDataSource")
    public DataSource getMasterDataSource(
            @Value("${spring.master.datasource.driverClassName}") String driver,
            @Value("${spring.master.datasource.url}") String url,
            @Value("${spring.master.datasource.username}") String username,
            @Value("${spring.master.datasource.password}") String password
    ) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driver); //loads the jdbc driver
        dataSource.setJdbcUrl(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean("slaveDataSource")
    public DataSource getSlaveDataSource(
            @Value("${spring.slave.datasource.driverClassName}") String driver,
            @Value("${spring.slave.datasource.url}") String url,
            @Value("${spring.slave.datasource.username}") String username,
            @Value("${spring.slave.datasource.password}") String password
    ) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driver); //loads the jdbc driver
        dataSource.setJdbcUrl(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
