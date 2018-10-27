package com.stock.dao.mapper.sys;

import com.stock.dao.model.sys.SysLog;
import com.stock.dao.model.sys.SysLogExample;
import com.stock.dao.model.sys.SysLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int countByExample(SysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int deleteByExample(SysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int deleteByPrimaryKey(Integer logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int insert(SysLogWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int insertSelective(SysLogWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    List<SysLogWithBLOBs> selectByExampleWithBLOBs(SysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    List<SysLog> selectByExample(SysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    SysLogWithBLOBs selectByPrimaryKey(Integer logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") SysLogWithBLOBs record, @Param("example") SysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") SysLogWithBLOBs record, @Param("example") SysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int updateByExample(@Param("record") SysLog record, @Param("example") SysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int updateByPrimaryKeySelective(SysLogWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(SysLogWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int updateByPrimaryKey(SysLog record);
}