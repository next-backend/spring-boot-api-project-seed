package com.company.project.model;

import lombok.Builder;
import tk.mybatis.mapper.annotation.Version;

import java.util.Date;
import javax.persistence.*;

@Table(name = "th_coin_item")
public class ThCoinItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "brand_owner")
    private Long brandOwner;

    private Long amount;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    private Integer yn;

    /**
     * 记录用户当前可用余额的明细，不同的过期时间各一条记录
     */
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
     * @return brand_owner
     */
    public Long getBrandOwner() {
        return brandOwner;
    }

    /**
     * @param brandOwner
     */
    public void setBrandOwner(Long brandOwner) {
        this.brandOwner = brandOwner;
    }

    /**
     * @return amount
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(Long amount) {
        this.amount = amount;
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
     * @return end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
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
     * 获取记录用户当前可用余额的明细，不同的过期时间各一条记录
     *
     * @return ts - 记录用户当前可用余额的明细，不同的过期时间各一条记录
     */
    public Date getTs() {
        return ts;
    }

    /**
     * 设置记录用户当前可用余额的明细，不同的过期时间各一条记录
     *
     * @param ts 记录用户当前可用余额的明细，不同的过期时间各一条记录
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