package com.java110.dto.fee;

import com.java110.dto.PageDto;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName FloorDto
 * @Description 费用配置数据层封装
 * @Author wuxw
 * @Date 2019/4/24 8:52
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/
public class FeeConfigDto extends PageDto implements Serializable {

    private String feeTypeCd;
    private String computingFormula;
    private String additionalAmount;
    private String squarePrice;
    private String isDefault;
    private String configId;
    private String feeFlag;
    private String feeName;
    private String startTime;
    private String endTime;
    private String communityId;
    private String feeTypeCdName;
    private String feeFlagName;

    private String billType;

    private String billTypeName;

    private String paymentCd;

    private String paymentCycle;


    private Date createTime;

    private String statusCd = "0";


    public String getFeeTypeCd() {
        return feeTypeCd;
    }

    public void setFeeTypeCd(String feeTypeCd) {
        this.feeTypeCd = feeTypeCd;
    }

    public String getComputingFormula() {
        return computingFormula;
    }

    public void setComputingFormula(String computingFormula) {
        this.computingFormula = computingFormula;
    }

    public String getAdditionalAmount() {
        return additionalAmount;
    }

    public void setAdditionalAmount(String additionalAmount) {
        this.additionalAmount = additionalAmount;
    }

    public String getSquarePrice() {
        return squarePrice;
    }

    public void setSquarePrice(String squarePrice) {
        this.squarePrice = squarePrice;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public String getFeeFlag() {
        return feeFlag;
    }

    public void setFeeFlag(String feeFlag) {
        this.feeFlag = feeFlag;
    }

    public String getFeeName() {
        return feeName;
    }

    public void setFeeName(String feeName) {
        this.feeName = feeName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }

    public String getFeeTypeCdName() {
        return feeTypeCdName;
    }

    public void setFeeTypeCdName(String feeTypeCdName) {
        this.feeTypeCdName = feeTypeCdName;
    }

    public String getFeeFlagName() {
        return feeFlagName;
    }

    public void setFeeFlagName(String feeFlagName) {
        this.feeFlagName = feeFlagName;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getBillTypeName() {
        return billTypeName;
    }

    public void setBillTypeName(String billTypeName) {
        this.billTypeName = billTypeName;
    }


    public String getPaymentCd() {
        return paymentCd;
    }

    public void setPaymentCd(String paymentCd) {
        this.paymentCd = paymentCd;
    }

    public String getPaymentCycle() {
        return paymentCycle;
    }

    public void setPaymentCycle(String paymentCycle) {
        this.paymentCycle = paymentCycle;
    }
}