package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "th_coin_transfer")
public class ThCoinTransfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "trade_id")
    private Long tradeId;

    @Column(name = "trade_in_id")
    private Long tradeInId;

    @Column(name = "out_account")
    private Long outAccount;

    @Column(name = "in_account")
    private Long inAccount;

    private Long money;

    /**
     * 同期类型表的主键id，0为非同期
     */
    @Column(name = "same_period_id")
    private Long samePeriodId;

    private Boolean state;

    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    private Long operator;

    private String erp;

    @Column(name = "erp_name")
    private String erpName;

    @Column(name = "auditor_erp")
    private String auditorErp;

    @Column(name = "auditor_erp_name")
    private String auditorErpName;

    @Column(name = "process_instance_id")
    private String processInstanceId;

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
     * @return trade_in_id
     */
    public Long getTradeInId() {
        return tradeInId;
    }

    /**
     * @param tradeInId
     */
    public void setTradeInId(Long tradeInId) {
        this.tradeInId = tradeInId;
    }

    /**
     * @return out_account
     */
    public Long getOutAccount() {
        return outAccount;
    }

    /**
     * @param outAccount
     */
    public void setOutAccount(Long outAccount) {
        this.outAccount = outAccount;
    }

    /**
     * @return in_account
     */
    public Long getInAccount() {
        return inAccount;
    }

    /**
     * @param inAccount
     */
    public void setInAccount(Long inAccount) {
        this.inAccount = inAccount;
    }

    /**
     * @return money
     */
    public Long getMoney() {
        return money;
    }

    /**
     * @param money
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
     * @return state
     */
    public Boolean getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Boolean state) {
        this.state = state;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
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
     * @return operator
     */
    public Long getOperator() {
        return operator;
    }

    /**
     * @param operator
     */
    public void setOperator(Long operator) {
        this.operator = operator;
    }

    /**
     * @return erp
     */
    public String getErp() {
        return erp;
    }

    /**
     * @param erp
     */
    public void setErp(String erp) {
        this.erp = erp;
    }

    /**
     * @return erp_name
     */
    public String getErpName() {
        return erpName;
    }

    /**
     * @param erpName
     */
    public void setErpName(String erpName) {
        this.erpName = erpName;
    }

    /**
     * @return auditor_erp
     */
    public String getAuditorErp() {
        return auditorErp;
    }

    /**
     * @param auditorErp
     */
    public void setAuditorErp(String auditorErp) {
        this.auditorErp = auditorErp;
    }

    /**
     * @return auditor_erp_name
     */
    public String getAuditorErpName() {
        return auditorErpName;
    }

    /**
     * @param auditorErpName
     */
    public void setAuditorErpName(String auditorErpName) {
        this.auditorErpName = auditorErpName;
    }

    /**
     * @return process_instance_id
     */
    public String getProcessInstanceId() {
        return processInstanceId;
    }

    /**
     * @param processInstanceId
     */
    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
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