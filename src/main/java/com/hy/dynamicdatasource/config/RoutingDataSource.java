package com.hy.dynamicdatasource.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * User: HY
 * Date: 2019/7/2
 * Time: 15:44
 * Description:
 */
public class RoutingDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceSwitch.getDataSourceKey();
    }
}
