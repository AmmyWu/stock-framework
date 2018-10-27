package com.stock.dao.model.stock;

import com.stock.dao.page.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockTradeNumExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stock_trade_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stock_trade_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stock_trade_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stock_trade_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_trade_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public StockTradeNumExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_trade_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_trade_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_trade_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_trade_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_trade_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_trade_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_trade_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_trade_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_trade_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_trade_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_trade_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_trade_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table stock_trade_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andStockTradeNumIdIsNull() {
            addCriterion("stock_trade_num_id is null");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumIdIsNotNull() {
            addCriterion("stock_trade_num_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumIdEqualTo(Integer value) {
            addCriterion("stock_trade_num_id =", value, "stockTradeNumId");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumIdNotEqualTo(Integer value) {
            addCriterion("stock_trade_num_id <>", value, "stockTradeNumId");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumIdGreaterThan(Integer value) {
            addCriterion("stock_trade_num_id >", value, "stockTradeNumId");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_trade_num_id >=", value, "stockTradeNumId");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumIdLessThan(Integer value) {
            addCriterion("stock_trade_num_id <", value, "stockTradeNumId");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumIdLessThanOrEqualTo(Integer value) {
            addCriterion("stock_trade_num_id <=", value, "stockTradeNumId");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumIdIn(List<Integer> values) {
            addCriterion("stock_trade_num_id in", values, "stockTradeNumId");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumIdNotIn(List<Integer> values) {
            addCriterion("stock_trade_num_id not in", values, "stockTradeNumId");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumIdBetween(Integer value1, Integer value2) {
            addCriterion("stock_trade_num_id between", value1, value2, "stockTradeNumId");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_trade_num_id not between", value1, value2, "stockTradeNumId");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNull() {
            addCriterion("stock_id is null");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNotNull() {
            addCriterion("stock_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockIdEqualTo(Integer value) {
            addCriterion("stock_id =", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotEqualTo(Integer value) {
            addCriterion("stock_id <>", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThan(Integer value) {
            addCriterion("stock_id >", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_id >=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThan(Integer value) {
            addCriterion("stock_id <", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThanOrEqualTo(Integer value) {
            addCriterion("stock_id <=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdIn(List<Integer> values) {
            addCriterion("stock_id in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotIn(List<Integer> values) {
            addCriterion("stock_id not in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdBetween(Integer value1, Integer value2) {
            addCriterion("stock_id between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_id not between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumIsNull() {
            addCriterion("stock_trade_num is null");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumIsNotNull() {
            addCriterion("stock_trade_num is not null");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumEqualTo(Integer value) {
            addCriterion("stock_trade_num =", value, "stockTradeNum");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumNotEqualTo(Integer value) {
            addCriterion("stock_trade_num <>", value, "stockTradeNum");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumGreaterThan(Integer value) {
            addCriterion("stock_trade_num >", value, "stockTradeNum");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_trade_num >=", value, "stockTradeNum");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumLessThan(Integer value) {
            addCriterion("stock_trade_num <", value, "stockTradeNum");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumLessThanOrEqualTo(Integer value) {
            addCriterion("stock_trade_num <=", value, "stockTradeNum");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumIn(List<Integer> values) {
            addCriterion("stock_trade_num in", values, "stockTradeNum");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumNotIn(List<Integer> values) {
            addCriterion("stock_trade_num not in", values, "stockTradeNum");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumBetween(Integer value1, Integer value2) {
            addCriterion("stock_trade_num between", value1, value2, "stockTradeNum");
            return (Criteria) this;
        }

        public Criteria andStockTradeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_trade_num not between", value1, value2, "stockTradeNum");
            return (Criteria) this;
        }

        public Criteria andStockTradeDateIsNull() {
            addCriterion("stock_trade_date is null");
            return (Criteria) this;
        }

        public Criteria andStockTradeDateIsNotNull() {
            addCriterion("stock_trade_date is not null");
            return (Criteria) this;
        }

        public Criteria andStockTradeDateEqualTo(Date value) {
            addCriterion("stock_trade_date =", value, "stockTradeDate");
            return (Criteria) this;
        }

        public Criteria andStockTradeDateNotEqualTo(Date value) {
            addCriterion("stock_trade_date <>", value, "stockTradeDate");
            return (Criteria) this;
        }

        public Criteria andStockTradeDateGreaterThan(Date value) {
            addCriterion("stock_trade_date >", value, "stockTradeDate");
            return (Criteria) this;
        }

        public Criteria andStockTradeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("stock_trade_date >=", value, "stockTradeDate");
            return (Criteria) this;
        }

        public Criteria andStockTradeDateLessThan(Date value) {
            addCriterion("stock_trade_date <", value, "stockTradeDate");
            return (Criteria) this;
        }

        public Criteria andStockTradeDateLessThanOrEqualTo(Date value) {
            addCriterion("stock_trade_date <=", value, "stockTradeDate");
            return (Criteria) this;
        }

        public Criteria andStockTradeDateIn(List<Date> values) {
            addCriterion("stock_trade_date in", values, "stockTradeDate");
            return (Criteria) this;
        }

        public Criteria andStockTradeDateNotIn(List<Date> values) {
            addCriterion("stock_trade_date not in", values, "stockTradeDate");
            return (Criteria) this;
        }

        public Criteria andStockTradeDateBetween(Date value1, Date value2) {
            addCriterion("stock_trade_date between", value1, value2, "stockTradeDate");
            return (Criteria) this;
        }

        public Criteria andStockTradeDateNotBetween(Date value1, Date value2) {
            addCriterion("stock_trade_date not between", value1, value2, "stockTradeDate");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Integer value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Integer value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Integer value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Integer value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Integer value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Integer> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Integer> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Integer value1, Integer value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Integer value1, Integer value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andAmenderIsNull() {
            addCriterion("amender is null");
            return (Criteria) this;
        }

        public Criteria andAmenderIsNotNull() {
            addCriterion("amender is not null");
            return (Criteria) this;
        }

        public Criteria andAmenderEqualTo(Integer value) {
            addCriterion("amender =", value, "amender");
            return (Criteria) this;
        }

        public Criteria andAmenderNotEqualTo(Integer value) {
            addCriterion("amender <>", value, "amender");
            return (Criteria) this;
        }

        public Criteria andAmenderGreaterThan(Integer value) {
            addCriterion("amender >", value, "amender");
            return (Criteria) this;
        }

        public Criteria andAmenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("amender >=", value, "amender");
            return (Criteria) this;
        }

        public Criteria andAmenderLessThan(Integer value) {
            addCriterion("amender <", value, "amender");
            return (Criteria) this;
        }

        public Criteria andAmenderLessThanOrEqualTo(Integer value) {
            addCriterion("amender <=", value, "amender");
            return (Criteria) this;
        }

        public Criteria andAmenderIn(List<Integer> values) {
            addCriterion("amender in", values, "amender");
            return (Criteria) this;
        }

        public Criteria andAmenderNotIn(List<Integer> values) {
            addCriterion("amender not in", values, "amender");
            return (Criteria) this;
        }

        public Criteria andAmenderBetween(Integer value1, Integer value2) {
            addCriterion("amender between", value1, value2, "amender");
            return (Criteria) this;
        }

        public Criteria andAmenderNotBetween(Integer value1, Integer value2) {
            addCriterion("amender not between", value1, value2, "amender");
            return (Criteria) this;
        }

        public Criteria andAmendTimeIsNull() {
            addCriterion("amend_time is null");
            return (Criteria) this;
        }

        public Criteria andAmendTimeIsNotNull() {
            addCriterion("amend_time is not null");
            return (Criteria) this;
        }

        public Criteria andAmendTimeEqualTo(Date value) {
            addCriterion("amend_time =", value, "amendTime");
            return (Criteria) this;
        }

        public Criteria andAmendTimeNotEqualTo(Date value) {
            addCriterion("amend_time <>", value, "amendTime");
            return (Criteria) this;
        }

        public Criteria andAmendTimeGreaterThan(Date value) {
            addCriterion("amend_time >", value, "amendTime");
            return (Criteria) this;
        }

        public Criteria andAmendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("amend_time >=", value, "amendTime");
            return (Criteria) this;
        }

        public Criteria andAmendTimeLessThan(Date value) {
            addCriterion("amend_time <", value, "amendTime");
            return (Criteria) this;
        }

        public Criteria andAmendTimeLessThanOrEqualTo(Date value) {
            addCriterion("amend_time <=", value, "amendTime");
            return (Criteria) this;
        }

        public Criteria andAmendTimeIn(List<Date> values) {
            addCriterion("amend_time in", values, "amendTime");
            return (Criteria) this;
        }

        public Criteria andAmendTimeNotIn(List<Date> values) {
            addCriterion("amend_time not in", values, "amendTime");
            return (Criteria) this;
        }

        public Criteria andAmendTimeBetween(Date value1, Date value2) {
            addCriterion("amend_time between", value1, value2, "amendTime");
            return (Criteria) this;
        }

        public Criteria andAmendTimeNotBetween(Date value1, Date value2) {
            addCriterion("amend_time not between", value1, value2, "amendTime");
            return (Criteria) this;
        }

        public Criteria andAccessGroupIsNull() {
            addCriterion("access_group is null");
            return (Criteria) this;
        }

        public Criteria andAccessGroupIsNotNull() {
            addCriterion("access_group is not null");
            return (Criteria) this;
        }

        public Criteria andAccessGroupEqualTo(Integer value) {
            addCriterion("access_group =", value, "accessGroup");
            return (Criteria) this;
        }

        public Criteria andAccessGroupNotEqualTo(Integer value) {
            addCriterion("access_group <>", value, "accessGroup");
            return (Criteria) this;
        }

        public Criteria andAccessGroupGreaterThan(Integer value) {
            addCriterion("access_group >", value, "accessGroup");
            return (Criteria) this;
        }

        public Criteria andAccessGroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("access_group >=", value, "accessGroup");
            return (Criteria) this;
        }

        public Criteria andAccessGroupLessThan(Integer value) {
            addCriterion("access_group <", value, "accessGroup");
            return (Criteria) this;
        }

        public Criteria andAccessGroupLessThanOrEqualTo(Integer value) {
            addCriterion("access_group <=", value, "accessGroup");
            return (Criteria) this;
        }

        public Criteria andAccessGroupIn(List<Integer> values) {
            addCriterion("access_group in", values, "accessGroup");
            return (Criteria) this;
        }

        public Criteria andAccessGroupNotIn(List<Integer> values) {
            addCriterion("access_group not in", values, "accessGroup");
            return (Criteria) this;
        }

        public Criteria andAccessGroupBetween(Integer value1, Integer value2) {
            addCriterion("access_group between", value1, value2, "accessGroup");
            return (Criteria) this;
        }

        public Criteria andAccessGroupNotBetween(Integer value1, Integer value2) {
            addCriterion("access_group not between", value1, value2, "accessGroup");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table stock_trade_num
     *
     * @mbggenerated do_not_delete_during_merge Sat Oct 27 09:36:42 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table stock_trade_num
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}