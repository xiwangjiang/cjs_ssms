package com.chengjs.cjsssmsweb.pojo;

import java.util.Date;

public class SysPermission {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.per_id
     *
     * @mbggenerated
     */
    private String perId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.per_name
     *
     * @mbggenerated
     */
    private String perName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.createtime
     *
     * @mbggenerated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.modifytime
     *
     * @mbggenerated
     */
    private Date modifytime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.discard
     *
     * @mbggenerated
     */
    private String discard;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.per_id
     *
     * @return the value of sys_permission.per_id
     *
     * @mbggenerated
     */
    public String getPerId() {
        return perId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.per_id
     *
     * @param perId the value for sys_permission.per_id
     *
     * @mbggenerated
     */
    public void setPerId(String perId) {
        this.perId = perId == null ? null : perId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.per_name
     *
     * @return the value of sys_permission.per_name
     *
     * @mbggenerated
     */
    public String getPerName() {
        return perName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.per_name
     *
     * @param perName the value for sys_permission.per_name
     *
     * @mbggenerated
     */
    public void setPerName(String perName) {
        this.perName = perName == null ? null : perName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.description
     *
     * @return the value of sys_permission.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.description
     *
     * @param description the value for sys_permission.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.createtime
     *
     * @return the value of sys_permission.createtime
     *
     * @mbggenerated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.createtime
     *
     * @param createtime the value for sys_permission.createtime
     *
     * @mbggenerated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.modifytime
     *
     * @return the value of sys_permission.modifytime
     *
     * @mbggenerated
     */
    public Date getModifytime() {
        return modifytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.modifytime
     *
     * @param modifytime the value for sys_permission.modifytime
     *
     * @mbggenerated
     */
    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.discard
     *
     * @return the value of sys_permission.discard
     *
     * @mbggenerated
     */
    public String getDiscard() {
        return discard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.discard
     *
     * @param discard the value for sys_permission.discard
     *
     * @mbggenerated
     */
    public void setDiscard(String discard) {
        this.discard = discard == null ? null : discard.trim();
    }
}