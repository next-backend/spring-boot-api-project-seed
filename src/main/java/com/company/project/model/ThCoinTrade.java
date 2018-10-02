package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "th_coin_trade")
public class ThCoinTrade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 品牌商
     */
    @Column(name = "brand_owner")
    private Long brandOwner;

    /**
     * 投放产品所属部门
     */
    private Long department;

    /**
     * 操作类型：方法、扣除、冻结、清零
     */
    @Column(name = "operate_type")
    private Boolean operateType;

    /**
     * 同期类型表的主键id，0为非同期
     */
    @Column(name = "same_period_id")
    private Long samePeriodId;

    /**
     * 金额
     */
    private Long money;

    /**
     * 金额状态，1、进行中 2、完成
     */
    private Boolean state;

    /**
     * 明细
     */
    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    private Integer yn;

    private Date ts;

    private Integer type;

    /**
     * erp账号
     */
    private String erpname;

    /**
     * 附件URL
     */
    @Column(name = "att_url")
    private String attUrl;

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
     * 获取品牌商
     *
     * @return brand_owner - 品牌商
     */
    public Long getBrandOwner() {
        return brandOwner;
    }

    /**
     * 设置品牌商
     *
     * @param brandOwner 品牌商
     */
    public void setBrandOwner(Long brandOwner) {
        this.brandOwner = brandOwner;
    }

    /**
     * 获取投放产品所属部门
     *
     * @return department - 投放产品所属部门
     */
    public Long getDepartment() {
        return department;
    }

    /**
     * 设置投放产品所属部门
     *
     * @param department 投放产品所属部门
     */
    public void setDepartment(Long department) {
        this.department = department;
    }

    /**
     * 获取操作类型：方法、扣除、冻结、清零
     *
     * @return operate_type - 操作类型：方法、扣除、冻结、清零
     */
    public Boolean getOperateType() {
        return operateType;
    }

    /**
     * 设置操作类型：方法、扣除、冻结、清零
     *
     * @param operateType 操作类型：方法、扣除、冻结、清零
     */
    public void setOperateType(Boolean operateType) {
        this.operateType = operateType;
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

    /**
     * 获取金额
     *
     * @return money - 金额
     */
    public Long getMoney() {
        return money;
    }

    /**
     * 设置金额
     *
     * @param money 金额
     */
    public void setMoney(Long money) {
        this.money = money;
    }

    /**
     * 获取金额状态，1、进行中 2、完成
     *
     * @return state - 金额状态，1、进行中 2、完成
     */
    public Boolean getState() {
        return state;
    }

    /**
     * 设置金额状态，1、进行中 2、完成
     *
     * @param state 金额状态，1、进行中 2、完成
     */
    public void setState(Boolean state) {
        this.state = state;
    }

    /**
     * 获取明细
     *
     * @return remark - 明细
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置明细
     *
     * @param remark 明细
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
     * 获取erp账号
     *
     * @return erpname - erp账号
     */
    public String getErpname() {
        return erpname;
    }

    /**
     * 设置erp账号
     *
     * @param erpname erp账号
     */
    public void setErpname(String erpname) {
        this.erpname = erpname;
    }

    /**
     * 获取附件URL
     *
     * @return att_url - 附件URL
     */
    public String getAttUrl() {
        return attUrl;
    }

    /**
     * 设置附件URL
     *
     * @param attUrl 附件URL
     */
    public void setAttUrl(String attUrl) {
        this.attUrl = attUrl;
    }
}