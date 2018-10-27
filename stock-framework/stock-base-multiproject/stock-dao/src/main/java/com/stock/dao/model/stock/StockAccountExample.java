package com.stock.dao.model.stock;

import com.stock.dao.page.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockAccountExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stock_account
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stock_account
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stock_account
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stock_account
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_account
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public StockAccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_account
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_account
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_account
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_account
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_account
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_account
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_account
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
     * This method corresponds to the database table stock_account
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
     * This method corresponds to the database table stock_account
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_account
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
     * This method corresponds to the database table stock_account
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_account
     *
     * @mbggenerated Sat Oct 27 09:36:42 CST 2018
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table stock_account
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

        public Criteria andStockAccountIdIsNull() {
            addCriterion("stock_account_id is null");
            return (Criteria) this;
        }

        public Criteria andStockAccountIdIsNotNull() {
            addCriterion("stock_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockAccountIdEqualTo(Integer value) {
            addCriterion("stock_account_id =", value, "stockAccountId");
            return (Criteria) this;
        }

        public Criteria andStockAccountIdNotEqualTo(Integer value) {
            addCriterion("stock_account_id <>", value, "stockAccountId");
            return (Criteria) this;
        }

        public Criteria andStockAccountIdGreaterThan(Integer value) {
            addCriterion("stock_account_id >", value, "stockAccountId");
            return (Criteria) this;
        }

        public Criteria andStockAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_account_id >=", value, "stockAccountId");
            return (Criteria) this;
        }

        public Criteria andStockAccountIdLessThan(Integer value) {
            addCriterion("stock_account_id <", value, "stockAccountId");
            return (Criteria) this;
        }

        public Criteria andStockAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("stock_account_id <=", value, "stockAccountId");
            return (Criteria) this;
        }

        public Criteria andStockAccountIdIn(List<Integer> values) {
            addCriterion("stock_account_id in", values, "stockAccountId");
            return (Criteria) this;
        }

        public Criteria andStockAccountIdNotIn(List<Integer> values) {
            addCriterion("stock_account_id not in", values, "stockAccountId");
            return (Criteria) this;
        }

        public Criteria andStockAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("stock_account_id between", value1, value2, "stockAccountId");
            return (Criteria) this;
        }

        public Criteria andStockAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_account_id not between", value1, value2, "stockAccountId");
            return (Criteria) this;
        }

        public Criteria andTotalAssetIsNull() {
            addCriterion("total_asset is null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetIsNotNull() {
            addCriterion("total_asset is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetEqualTo(Double value) {
            addCriterion("total_asset =", value, "totalAsset");
            return (Criteria) this;
        }

        public Criteria andTotalAssetNotEqualTo(Double value) {
            addCriterion("total_asset <>", value, "totalAsset");
            return (Criteria) this;
        }

        public Criteria andTotalAssetGreaterThan(Double value) {
            addCriterion("total_asset >", value, "totalAsset");
            return (Criteria) this;
        }

        public Criteria andTotalAssetGreaterThanOrEqualTo(Double value) {
            addCriterion("total_asset >=", value, "totalAsset");
            return (Criteria) this;
        }

        public Criteria andTotalAssetLessThan(Double value) {
            addCriterion("total_asset <", value, "totalAsset");
            return (Criteria) this;
        }

        public Criteria andTotalAssetLessThanOrEqualTo(Double value) {
            addCriterion("total_asset <=", value, "totalAsset");
            return (Criteria) this;
        }

        public Criteria andTotalAssetIn(List<Double> values) {
            addCriterion("total_asset in", values, "totalAsset");
            return (Criteria) this;
        }

        public Criteria andTotalAssetNotIn(List<Double> values) {
            addCriterion("total_asset not in", values, "totalAsset");
            return (Criteria) this;
        }

        public Criteria andTotalAssetBetween(Double value1, Double value2) {
            addCriterion("total_asset between", value1, value2, "totalAsset");
            return (Criteria) this;
        }

        public Criteria andTotalAssetNotBetween(Double value1, Double value2) {
            addCriterion("total_asset not between", value1, value2, "totalAsset");
            return (Criteria) this;
        }

        public Criteria andStockAssetIsNull() {
            addCriterion("stock_asset is null");
            return (Criteria) this;
        }

        public Criteria andStockAssetIsNotNull() {
            addCriterion("stock_asset is not null");
            return (Criteria) this;
        }

        public Criteria andStockAssetEqualTo(Double value) {
            addCriterion("stock_asset =", value, "stockAsset");
            return (Criteria) this;
        }

        public Criteria andStockAssetNotEqualTo(Double value) {
            addCriterion("stock_asset <>", value, "stockAsset");
            return (Criteria) this;
        }

        public Criteria andStockAssetGreaterThan(Double value) {
            addCriterion("stock_asset >", value, "stockAsset");
            return (Criteria) this;
        }

        public Criteria andStockAssetGreaterThanOrEqualTo(Double value) {
            addCriterion("stock_asset >=", value, "stockAsset");
            return (Criteria) this;
        }

        public Criteria andStockAssetLessThan(Double value) {
            addCriterion("stock_asset <", value, "stockAsset");
            return (Criteria) this;
        }

        public Criteria andStockAssetLessThanOrEqualTo(Double value) {
            addCriterion("stock_asset <=", value, "stockAsset");
            return (Criteria) this;
        }

        public Criteria andStockAssetIn(List<Double> values) {
            addCriterion("stock_asset in", values, "stockAsset");
            return (Criteria) this;
        }

        public Criteria andStockAssetNotIn(List<Double> values) {
            addCriterion("stock_asset not in", values, "stockAsset");
            return (Criteria) this;
        }

        public Criteria andStockAssetBetween(Double value1, Double value2) {
            addCriterion("stock_asset between", value1, value2, "stockAsset");
            return (Criteria) this;
        }

        public Criteria andStockAssetNotBetween(Double value1, Double value2) {
            addCriterion("stock_asset not between", value1, value2, "stockAsset");
            return (Criteria) this;
        }

        public Criteria andRemainingFundIsNull() {
            addCriterion("remaining_fund is null");
            return (Criteria) this;
        }

        public Criteria andRemainingFundIsNotNull() {
            addCriterion("remaining_fund is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingFundEqualTo(Double value) {
            addCriterion("remaining_fund =", value, "remainingFund");
            return (Criteria) this;
        }

        public Criteria andRemainingFundNotEqualTo(Double value) {
            addCriterion("remaining_fund <>", value, "remainingFund");
            return (Criteria) this;
        }

        public Criteria andRemainingFundGreaterThan(Double value) {
            addCriterion("remaining_fund >", value, "remainingFund");
            return (Criteria) this;
        }

        public Criteria andRemainingFundGreaterThanOrEqualTo(Double value) {
            addCriterion("remaining_fund >=", value, "remainingFund");
            return (Criteria) this;
        }

        public Criteria andRemainingFundLessThan(Double value) {
            addCriterion("remaining_fund <", value, "remainingFund");
            return (Criteria) this;
        }

        public Criteria andRemainingFundLessThanOrEqualTo(Double value) {
            addCriterion("remaining_fund <=", value, "remainingFund");
            return (Criteria) this;
        }

        public Criteria andRemainingFundIn(List<Double> values) {
            addCriterion("remaining_fund in", values, "remainingFund");
            return (Criteria) this;
        }

        public Criteria andRemainingFundNotIn(List<Double> values) {
            addCriterion("remaining_fund not in", values, "remainingFund");
            return (Criteria) this;
        }

        public Criteria andRemainingFundBetween(Double value1, Double value2) {
            addCriterion("remaining_fund between", value1, value2, "remainingFund");
            return (Criteria) this;
        }

        public Criteria andRemainingFundNotBetween(Double value1, Double value2) {
            addCriterion("remaining_fund not between", value1, value2, "remainingFund");
            return (Criteria) this;
        }

        public Criteria andAdvisableFundIsNull() {
            addCriterion("advisable_fund is null");
            return (Criteria) this;
        }

        public Criteria andAdvisableFundIsNotNull() {
            addCriterion("advisable_fund is not null");
            return (Criteria) this;
        }

        public Criteria andAdvisableFundEqualTo(Double value) {
            addCriterion("advisable_fund =", value, "advisableFund");
            return (Criteria) this;
        }

        public Criteria andAdvisableFundNotEqualTo(Double value) {
            addCriterion("advisable_fund <>", value, "advisableFund");
            return (Criteria) this;
        }

        public Criteria andAdvisableFundGreaterThan(Double value) {
            addCriterion("advisable_fund >", value, "advisableFund");
            return (Criteria) this;
        }

        public Criteria andAdvisableFundGreaterThanOrEqualTo(Double value) {
            addCriterion("advisable_fund >=", value, "advisableFund");
            return (Criteria) this;
        }

        public Criteria andAdvisableFundLessThan(Double value) {
            addCriterion("advisable_fund <", value, "advisableFund");
            return (Criteria) this;
        }

        public Criteria andAdvisableFundLessThanOrEqualTo(Double value) {
            addCriterion("advisable_fund <=", value, "advisableFund");
            return (Criteria) this;
        }

        public Criteria andAdvisableFundIn(List<Double> values) {
            addCriterion("advisable_fund in", values, "advisableFund");
            return (Criteria) this;
        }

        public Criteria andAdvisableFundNotIn(List<Double> values) {
            addCriterion("advisable_fund not in", values, "advisableFund");
            return (Criteria) this;
        }

        public Criteria andAdvisableFundBetween(Double value1, Double value2) {
            addCriterion("advisable_fund between", value1, value2, "advisableFund");
            return (Criteria) this;
        }

        public Criteria andAdvisableFundNotBetween(Double value1, Double value2) {
            addCriterion("advisable_fund not between", value1, value2, "advisableFund");
            return (Criteria) this;
        }

        public Criteria andAvailableFundIsNull() {
            addCriterion("available_fund is null");
            return (Criteria) this;
        }

        public Criteria andAvailableFundIsNotNull() {
            addCriterion("available_fund is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableFundEqualTo(Double value) {
            addCriterion("available_fund =", value, "availableFund");
            return (Criteria) this;
        }

        public Criteria andAvailableFundNotEqualTo(Double value) {
            addCriterion("available_fund <>", value, "availableFund");
            return (Criteria) this;
        }

        public Criteria andAvailableFundGreaterThan(Double value) {
            addCriterion("available_fund >", value, "availableFund");
            return (Criteria) this;
        }

        public Criteria andAvailableFundGreaterThanOrEqualTo(Double value) {
            addCriterion("available_fund >=", value, "availableFund");
            return (Criteria) this;
        }

        public Criteria andAvailableFundLessThan(Double value) {
            addCriterion("available_fund <", value, "availableFund");
            return (Criteria) this;
        }

        public Criteria andAvailableFundLessThanOrEqualTo(Double value) {
            addCriterion("available_fund <=", value, "availableFund");
            return (Criteria) this;
        }

        public Criteria andAvailableFundIn(List<Double> values) {
            addCriterion("available_fund in", values, "availableFund");
            return (Criteria) this;
        }

        public Criteria andAvailableFundNotIn(List<Double> values) {
            addCriterion("available_fund not in", values, "availableFund");
            return (Criteria) this;
        }

        public Criteria andAvailableFundBetween(Double value1, Double value2) {
            addCriterion("available_fund between", value1, value2, "availableFund");
            return (Criteria) this;
        }

        public Criteria andAvailableFundNotBetween(Double value1, Double value2) {
            addCriterion("available_fund not between", value1, value2, "availableFund");
            return (Criteria) this;
        }

        public Criteria andFreezeFundIsNull() {
            addCriterion("freeze_fund is null");
            return (Criteria) this;
        }

        public Criteria andFreezeFundIsNotNull() {
            addCriterion("freeze_fund is not null");
            return (Criteria) this;
        }

        public Criteria andFreezeFundEqualTo(Double value) {
            addCriterion("freeze_fund =", value, "freezeFund");
            return (Criteria) this;
        }

        public Criteria andFreezeFundNotEqualTo(Double value) {
            addCriterion("freeze_fund <>", value, "freezeFund");
            return (Criteria) this;
        }

        public Criteria andFreezeFundGreaterThan(Double value) {
            addCriterion("freeze_fund >", value, "freezeFund");
            return (Criteria) this;
        }

        public Criteria andFreezeFundGreaterThanOrEqualTo(Double value) {
            addCriterion("freeze_fund >=", value, "freezeFund");
            return (Criteria) this;
        }

        public Criteria andFreezeFundLessThan(Double value) {
            addCriterion("freeze_fund <", value, "freezeFund");
            return (Criteria) this;
        }

        public Criteria andFreezeFundLessThanOrEqualTo(Double value) {
            addCriterion("freeze_fund <=", value, "freezeFund");
            return (Criteria) this;
        }

        public Criteria andFreezeFundIn(List<Double> values) {
            addCriterion("freeze_fund in", values, "freezeFund");
            return (Criteria) this;
        }

        public Criteria andFreezeFundNotIn(List<Double> values) {
            addCriterion("freeze_fund not in", values, "freezeFund");
            return (Criteria) this;
        }

        public Criteria andFreezeFundBetween(Double value1, Double value2) {
            addCriterion("freeze_fund between", value1, value2, "freezeFund");
            return (Criteria) this;
        }

        public Criteria andFreezeFundNotBetween(Double value1, Double value2) {
            addCriterion("freeze_fund not between", value1, value2, "freezeFund");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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
     * This class corresponds to the database table stock_account
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
     * This class corresponds to the database table stock_account
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