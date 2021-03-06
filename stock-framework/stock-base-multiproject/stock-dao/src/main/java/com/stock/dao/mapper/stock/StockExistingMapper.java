package com.stock.dao.mapper.stock;

import com.stock.dao.model.stock.StockExisting;
import com.stock.dao.model.stock.StockExistingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockExistingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_existing
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    int countByExample(StockExistingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_existing
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    int deleteByExample(StockExistingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_existing
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    int deleteByPrimaryKey(Integer existingId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_existing
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    int insert(StockExisting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_existing
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    int insertSelective(StockExisting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_existing
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    List<StockExisting> selectByExample(StockExistingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_existing
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    StockExisting selectByPrimaryKey(Integer existingId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_existing
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    int updateByExampleSelective(@Param("record") StockExisting record, @Param("example") StockExistingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_existing
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    int updateByExample(@Param("record") StockExisting record, @Param("example") StockExistingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_existing
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    int updateByPrimaryKeySelective(StockExisting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_existing
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    int updateByPrimaryKey(StockExisting record);
}