package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "th_coin_freeze")
public class ThCoinFreeze {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "trade_id")
    private Long tradeId;

    /**
     * 购买的资源包编号
     */
    @Column(name = "package_id")
    private Long packageId;

    /**
     * 品牌商
     */
    @Column(name = "brand_owner")
    private Long brandOwner;

    /**
     * 冻结金额
     */
    private Long money;

    /**
     * 同期类型表的主键id，0为非同期
     */
    @Column(name = "same_period_id")
    private Long samePeriodId;

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
     * @return trade_id
     */
    public Long getTradeId() {
        return tradeId;
    }

    /**
     * @param tradeId
     */
    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    /**
     * 获取购买的资源包编号
     *
     * @return package_id - 购买的资源包编号
     */
    public Long getPackageId() {
        return packageId;
    }

    /**
     * 设置购买的资源包编号
     *
     * @param packageId 购买的资源包编号
     */
    public void setPackageId(Long packageId) {
        this.packageId = packageId;
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
     * 获取冻结金额
     *
     * @return money - 冻结金额
     */
    public Long getMoney() {
        return money;
    }

    /**
     * 设置冻结金额
     *
     * @param money 冻结金额
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