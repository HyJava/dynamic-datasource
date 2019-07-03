package com.hy.dynamicdatasource;

import com.hy.dynamicdatasource.config.DataSourceSwitch;
import com.hy.dynamicdatasource.dao.domain.CaAppInfoExtend;
import com.hy.dynamicdatasource.dao.domain.CaAppInfoExtendExample;
import com.hy.dynamicdatasource.dao.mapper.CaAppInfoExtendMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DynamicDatasourceApplicationTests {

    @Autowired
    private CaAppInfoExtendMapper caAppInfoExtendMapper;

    @Test
    public void contextLoads() {

        CaAppInfoExtendExample caAppInfoExtendExample = new CaAppInfoExtendExample();
       // caAppInfoExtendExample.createCriteria().andAppCodeEqualTo("F1901141000100180500");
        caAppInfoExtendExample.createCriteria().andAppCodeEqualTo("F1804241007000102001");
        //DataSourceSwitch.setDataSourceKey("masterDataSource");
        DataSourceSwitch.setDataSourceKey("slaveDataSource");
        List<CaAppInfoExtend> caAppInfoExtends = caAppInfoExtendMapper.selectByExample(caAppInfoExtendExample);
        System.out.println(caAppInfoExtends.get(0).getAppCode());
    }

}
