package com.company.project.model;

import tk.mybatis.mapper.annotation.Version;

import java.util.Date;
import javax.persistence.*;

@Table(name = "th_coin_account")
public class ThCoinAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 品牌商账号ID
     */
    @Column(name = "brand_owner")
    private Long brandOwner;

    /**
     * 可用余额
     */
    private Long balance;

    /**
     * 冻结金额
     */
    private Long freeze;

    /**
     * 标注
     */
    private String remark;

    /**
     * 账户创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最后一次修改时间
     */
    @Column(name = "last_update_time")
    private Date lastUpdateTime;

    @Column(name = "create_user")
    private Long createUser;

    @Column(name = "last_update_user")
    private Long lastUpdateUser;

    private Integer yn;

    private Date ts;

    private Integer type;

    /**
     * 同期类型表的主键id，0为非同期
     */
    @Column(name = "same_period_id")
    private Long samePeriodId;

    @Version
    private Integer version ;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取品牌商账号ID
     *
     * @return brand_owner - 品牌商账号ID
     */
    public Long getBrandOwner() {
        return brandOwner;
    }

    /**
     * 设置品牌商账号ID
     *
     * @param brandOwner 品牌商账号ID
     */
    public void setBrandOwner(Long brandOwner) {
        this.brandOwner = brandOwner;
    }

    /**
     * 获取可用余额
     *
     * @return balance - 可用余额
     */
    public Long getBalance() {
        return balance;
    }

    /**
     * 设置可用余额
     *
     * @param balance 可用余额
     */
    public void setBalance(Long balance) {
        this.balance = balance;
    }

    /**
     * 获取冻结金额
     *
     * @return freeze - 冻结金额
     */
    public Long getFreeze() {
        return freeze;
    }

    /**
     * 设置冻结金额
     *
     * @param freeze 冻结金额
     */
    public void setFreeze(Long freeze) {
        this.freeze = freeze;
    }

    /**
     * 获取标注
     *
     * @return remark - 标注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置标注
     *
     * @param remark 标注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取账户创建时间
     *
     * @return create_time - 账户创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置账户创建时间
     *
     * @param createTime 账户创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取最后一次修改时间
     *
     * @return last_update_time - 最后一次修改时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 设置最后一次修改时间
     *
     * @param lastUpdateTime 最后一次修改时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * @return create_user
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * @param createUser
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * @return last_update_user
     */
    public Long getLastUpdateUser() {
        return lastUpdateUser;
    }

    /**
     * @param lastUpdateUser
     */
    public void setLastUpdateUser(Long lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    /**
     * @return yn
     */
    public Integer getYn() {
        return yn;
    }

    /**
     * @param yn
     */
    public void setYn(Integer yn) {
        this.yn = yn;
    }

    /**
     * @return ts
     */
    public Date getTs() {
        return ts;
    }

    /**
     * @param ts
     */
    public void setTs(Date ts) {
        this.ts = ts;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取同期类型表的主键id，0为非同期
     *
     * @return same_period_id - 同期类型表的主键id，0为非同期
     */
    public Long getSamePeriodId() {
        return samePeriodId;
    }

    /**
     * 设置同期类型表的主键id，0为非同期
     *
     * @param samePeriodId 同期类型表的主键id，0为非同期
     */
    public void setSamePeriodId(Long samePeriodId) {
        this.samePeriodId = samePeriodId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}