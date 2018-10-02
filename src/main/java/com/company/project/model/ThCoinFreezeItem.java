package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "th_coin_freeze_item")
public class ThCoinFreezeItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "freeze_id")
    private Long freezeId;

    /**
     * 资源包编号
     */
    @Column(name = "package_id")
    private Long packageId;

    /**
     * 资源包金额
     */
    private Long money;

    /**
     * 同期类型表的主键id，0为非同期
     */
    @Column(name = "same_period_id")
    private Long samePeriodId;

    @Column(name = "start_time")
    private Date startTime;

    /**
     * 金额的有效结束日期
     */
    @Column(name = "end_time")
    private Date endTime;

    private Integer yn;

    private Date ts;

    private Integer type;

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
     * @return freeze_id
     */
    public Long getFreezeId() {
        return freezeId;
    }

    /**
     * @param freezeId
     */
    public void setFreezeId(Long freezeId) {
        this.freezeId = freezeId;
    }

    /**
     * 获取资源包编号
     *
     * @return package_id - 资源包编号
     */
    public Long getPackageId() {
        return packageId;
    }

    /**
     * 设置资源包编号
     *
     * @param packageId 资源包编号
     */
    public void setPackageId(Long packageId) {
        this.packageId = packageId;
    }

    /**
     * 获取资源包金额
     *
     * @return money - 资源包金额
     */
    public Long getMoney() {
        return money;
    }

    /**
     * 设置资源包金额
     *
     * @param money 资源包金额
     */
    public void setMoney(Long money) {
        this.money = money;
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
     * @return start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取金额的有效结束日期
     *
     * @return end_time - 金额的有效结束日期
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置金额的有效结束日期
     *
     * @param endTime 金额的有效结束日期
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
}