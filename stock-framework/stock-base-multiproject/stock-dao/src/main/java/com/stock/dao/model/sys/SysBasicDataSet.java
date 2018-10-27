package com.stock.dao.model.sys;

import java.io.Serializable;
import java.util.Date;

public class SysBasicDataSet implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_basic_data_set.basic_data_set_id
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private Integer basicDataSetId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_basic_data_set.superior_id
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private Integer superiorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_basic_data_set.code
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_basic_data_set.code3
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private String code3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_basic_data_set.cn_name
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private String cnName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_basic_data_set.en_name
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private String enName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_basic_data_set.description_chinese
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private String descriptionChinese;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_basic_data_set.description
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_basic_data_set.creator
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private Integer creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_basic_data_set.create_time
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_basic_data_set.amender
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private Integer amender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_basic_data_set.amend_time
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private Date amendTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_basic_data_set.access_group
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private Integer accessGroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_basic_data_set.record_version
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private Integer recordVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_basic_data_set.is_deleted
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private Integer isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_basic_data_set
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_basic_data_set.basic_data_set_id
     *
     * @return the value of sys_basic_data_set.basic_data_set_id
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public Integer getBasicDataSetId() {
        return basicDataSetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_basic_data_set.basic_data_set_id
     *
     * @param basicDataSetId the value for sys_basic_data_set.basic_data_set_id
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setBasicDataSetId(Integer basicDataSetId) {
        this.basicDataSetId = basicDataSetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_basic_data_set.superior_id
     *
     * @return the value of sys_basic_data_set.superior_id
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public Integer getSuperiorId() {
        return superiorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_basic_data_set.superior_id
     *
     * @param superiorId the value for sys_basic_data_set.superior_id
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setSuperiorId(Integer superiorId) {
        this.superiorId = superiorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_basic_data_set.code
     *
     * @return the value of sys_basic_data_set.code
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_basic_data_set.code
     *
     * @param code the value for sys_basic_data_set.code
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_basic_data_set.code3
     *
     * @return the value of sys_basic_data_set.code3
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public String getCode3() {
        return code3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_basic_data_set.code3
     *
     * @param code3 the value for sys_basic_data_set.code3
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setCode3(String code3) {
        this.code3 = code3 == null ? null : code3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_basic_data_set.cn_name
     *
     * @return the value of sys_basic_data_set.cn_name
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public String getCnName() {
        return cnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_basic_data_set.cn_name
     *
     * @param cnName the value for sys_basic_data_set.cn_name
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setCnName(String cnName) {
        this.cnName = cnName == null ? null : cnName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_basic_data_set.en_name
     *
     * @return the value of sys_basic_data_set.en_name
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public String getEnName() {
        return enName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_basic_data_set.en_name
     *
     * @param enName the value for sys_basic_data_set.en_name
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_basic_data_set.description_chinese
     *
     * @return the value of sys_basic_data_set.description_chinese
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public String getDescriptionChinese() {
        return descriptionChinese;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_basic_data_set.description_chinese
     *
     * @param descriptionChinese the value for sys_basic_data_set.description_chinese
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setDescriptionChinese(String descriptionChinese) {
        this.descriptionChinese = descriptionChinese == null ? null : descriptionChinese.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_basic_data_set.description
     *
     * @return the value of sys_basic_data_set.description
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_basic_data_set.description
     *
     * @param description the value for sys_basic_data_set.description
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_basic_data_set.creator
     *
     * @return the value of sys_basic_data_set.creator
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_basic_data_set.creator
     *
     * @param creator the value for sys_basic_data_set.creator
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_basic_data_set.create_time
     *
     * @return the value of sys_basic_data_set.create_time
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_basic_data_set.create_time
     *
     * @param createTime the value for sys_basic_data_set.create_time
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_basic_data_set.amender
     *
     * @return the value of sys_basic_data_set.amender
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public Integer getAmender() {
        return amender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_basic_data_set.amender
     *
     * @param amender the value for sys_basic_data_set.amender
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setAmender(Integer amender) {
        this.amender = amender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_basic_data_set.amend_time
     *
     * @return the value of sys_basic_data_set.amend_time
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public Date getAmendTime() {
        return amendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_basic_data_set.amend_time
     *
     * @param amendTime the value for sys_basic_data_set.amend_time
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setAmendTime(Date amendTime) {
        this.amendTime = amendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_basic_data_set.access_group
     *
     * @return the value of sys_basic_data_set.access_group
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public Integer getAccessGroup() {
        return accessGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_basic_data_set.access_group
     *
     * @param accessGroup the value for sys_basic_data_set.access_group
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setAccessGroup(Integer accessGroup) {
        this.accessGroup = accessGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_basic_data_set.record_version
     *
     * @return the value of sys_basic_data_set.record_version
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public Integer getRecordVersion() {
        return recordVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_basic_data_set.record_version
     *
     * @param recordVersion the value for sys_basic_data_set.record_version
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setRecordVersion(Integer recordVersion) {
        this.recordVersion = recordVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_basic_data_set.is_deleted
     *
     * @return the value of sys_basic_data_set.is_deleted
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_basic_data_set.is_deleted
     *
     * @param isDeleted the value for sys_basic_data_set.is_deleted
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_basic_data_set
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysBasicDataSet other = (SysBasicDataSet) that;
        return (this.getBasicDataSetId() == null ? other.getBasicDataSetId() == null : this.getBasicDataSetId().equals(other.getBasicDataSetId()))
            && (this.getSuperiorId() == null ? other.getSuperiorId() == null : this.getSuperiorId().equals(other.getSuperiorId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getCode3() == null ? other.getCode3() == null : this.getCode3().equals(other.getCode3()))
            && (this.getCnName() == null ? other.getCnName() == null : this.getCnName().equals(other.getCnName()))
            && (this.getEnName() == null ? other.getEnName() == null : this.getEnName().equals(other.getEnName()))
            && (this.getDescriptionChinese() == null ? other.getDescriptionChinese() == null : this.getDescriptionChinese().equals(other.getDescriptionChinese()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getAmender() == null ? other.getAmender() == null : this.getAmender().equals(other.getAmender()))
            && (this.getAmendTime() == null ? other.getAmendTime() == null : this.getAmendTime().equals(other.getAmendTime()))
            && (this.getAccessGroup() == null ? other.getAccessGroup() == null : this.getAccessGroup().equals(other.getAccessGroup()))
            && (this.getRecordVersion() == null ? other.getRecordVersion() == null : this.getRecordVersion().equals(other.getRecordVersion()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_basic_data_set
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBasicDataSetId() == null) ? 0 : getBasicDataSetId().hashCode());
        result = prime * result + ((getSuperiorId() == null) ? 0 : getSuperiorId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getCode3() == null) ? 0 : getCode3().hashCode());
        result = prime * result + ((getCnName() == null) ? 0 : getCnName().hashCode());
        result = prime * result + ((getEnName() == null) ? 0 : getEnName().hashCode());
        result = prime * result + ((getDescriptionChinese() == null) ? 0 : getDescriptionChinese().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getAmender() == null) ? 0 : getAmender().hashCode());
        result = prime * result + ((getAmendTime() == null) ? 0 : getAmendTime().hashCode());
        result = prime * result + ((getAccessGroup() == null) ? 0 : getAccessGroup().hashCode());
        result = prime * result + ((getRecordVersion() == null) ? 0 : getRecordVersion().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_basic_data_set
     *
     * @mbggenerated Sat Oct 27 09:26:51 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", basicDataSetId=").append(basicDataSetId);
        sb.append(", superiorId=").append(superiorId);
        sb.append(", code=").append(code);
        sb.append(", code3=").append(code3);
        sb.append(", cnName=").append(cnName);
        sb.append(", enName=").append(enName);
        sb.append(", descriptionChinese=").append(descriptionChinese);
        sb.append(", description=").append(description);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", amender=").append(amender);
        sb.append(", amendTime=").append(amendTime);
        sb.append(", accessGroup=").append(accessGroup);
        sb.append(", recordVersion=").append(recordVersion);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}