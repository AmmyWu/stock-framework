package com.stock.dao.mapper.sys;

import com.stock.dao.model.sys.SysAuthentication;
import com.stock.dao.model.sys.SysAuthenticationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAuthenticationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authentication
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int countByExample(SysAuthenticationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authentication
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int deleteByExample(SysAuthenticationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authentication
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int deleteByPrimaryKey(Integer authenticationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authentication
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int insert(SysAuthentication record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authentication
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int insertSelective(SysAuthentication record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authentication
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    List<SysAuthentication> selectByExample(SysAuthenticationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authentication
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    SysAuthentication selectByPrimaryKey(Integer authenticationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authentication
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") SysAuthentication record, @Param("example") SysAuthenticationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authentication
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int updateByExample(@Param("record") SysAuthentication record, @Param("example") SysAuthenticationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authentication
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int updateByPrimaryKeySelective(SysAuthentication record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authentication
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int updateByPrimaryKey(SysAuthentication record);
}