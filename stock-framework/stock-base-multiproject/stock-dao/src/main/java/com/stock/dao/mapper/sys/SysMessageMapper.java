package com.stock.dao.mapper.sys;

import com.stock.dao.model.sys.SysMessage;
import com.stock.dao.model.sys.SysMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_message
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int countByExample(SysMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_message
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int deleteByExample(SysMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_message
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int deleteByPrimaryKey(Integer messageId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_message
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int insert(SysMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_message
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int insertSelective(SysMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_message
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    List<SysMessage> selectByExample(SysMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_message
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    SysMessage selectByPrimaryKey(Integer messageId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_message
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") SysMessage record, @Param("example") SysMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_message
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int updateByExample(@Param("record") SysMessage record, @Param("example") SysMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_message
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int updateByPrimaryKeySelective(SysMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_message
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    int updateByPrimaryKey(SysMessage record);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_message
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    List<SysMessage> selectByExampleWithBLOBs(SysMessageExample example);
}