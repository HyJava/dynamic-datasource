package com.mljr.yulv.dao.mapper;

import com.mljr.yulv.dao.BaseMapper;
import com.mljr.yulv.dao.domain.CaAppInfoExtend;
import com.mljr.yulv.dao.domain.CaAppInfoExtendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaAppInfoExtendMapper extends BaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_app_info_extend
     *
     * @mbg.generated
     */
    long countByExample(CaAppInfoExtendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_app_info_extend
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_app_info_extend
     *
     * @mbg.generated
     */
    int insert(CaAppInfoExtend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_app_info_extend
     *
     * @mbg.generated
     */
    int insertSelective(CaAppInfoExtend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_app_info_extend
     *
     * @mbg.generated
     */
    List<CaAppInfoExtend> selectByExampleWithBLOBs(CaAppInfoExtendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_app_info_extend
     *
     * @mbg.generated
     */
    List<CaAppInfoExtend> selectByExample(CaAppInfoExtendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_app_info_extend
     *
     * @mbg.generated
     */
    CaAppInfoExtend selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_app_info_extend
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CaAppInfoExtend record, @Param("example") CaAppInfoExtendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_app_info_extend
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") CaAppInfoExtend record, @Param("example") CaAppInfoExtendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_app_info_extend
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CaAppInfoExtend record, @Param("example") CaAppInfoExtendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_app_info_extend
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CaAppInfoExtend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_app_info_extend
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(CaAppInfoExtend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ca_app_info_extend
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CaAppInfoExtend record);
}