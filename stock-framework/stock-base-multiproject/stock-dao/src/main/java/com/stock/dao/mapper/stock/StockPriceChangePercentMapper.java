package com.stock.dao.mapper.stock;

import com.stock.dao.model.stock.StockPriceChangePercent;
import com.stock.dao.model.stock.StockPriceChangePercentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockPriceChangePercentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_price_change_percent
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    int countByExample(StockPriceChangePercentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_price_change_percent
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    int deleteByExample(StockPriceChangePercentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_price_change_percent
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    int deleteByPrimaryKey(Integer stockPriceChangePercentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_price_change_percent
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    int insert(StockPriceChangePercent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_price_change_percent
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    int insertSelective(StockPriceChangePercent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_price_change_percent
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    List<StockPriceChangePercent> selectByExample(StockPriceChangePercentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_price_change_percent
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    StockPriceChangePercent selectByPrimaryKey(Integer stockPriceChangePercentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_price_change_percent
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    int updateByExampleSelective(@Param("record") StockPriceChangePercent record, @Param("example") StockPriceChangePercentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_price_change_percent
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    int updateByExample(@Param("record") StockPriceChangePercent record, @Param("example") StockPriceChangePercentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_price_change_percent
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    int updateByPrimaryKeySelective(StockPriceChangePercent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_price_change_percent
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    int updateByPrimaryKey(StockPriceChangePercent record);
}