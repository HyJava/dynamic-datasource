package com.hy.dynamicdatasource.dao;

import java.util.List;

/**
 * Created by xiaoxian on 2018/6/6.
 */
public interface BaseMapper<M extends BaseModel,EX> {

    int insertSelective(M record);

    int updateByPrimaryKey(M record);

    int updateByPrimaryKeySelective(M record);

    M selectByPrimaryKey(Object id);

    List<M> selectByExample(EX e);

    Integer countByExample(EX e);

    int deleteByPrimaryKey(Object id);
}
