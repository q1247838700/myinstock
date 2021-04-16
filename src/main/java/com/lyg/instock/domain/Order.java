package com.lyg.instock.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 订单表
 * @TableName order
 */
@TableName(value ="order")
@Data
public class Order implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 价格
     */
    private Long price;

    /**
     * 订单状态 0未发货 1完全发货 2 部分发货 3 退单
     */
    private Integer state;

    /**
     * 购买公司
     */
    private String buyCompanyId;

    /**
     * 返利公司
     */
    private Integer rebateCompanyId;

    /**
     * 返利id
     */
    private Integer rebateId;

    /**
     * 返利百分比
     */
    private Integer rebatePercent;

    /**
     * 返利金额
     */
    private Integer rebatePrice;

    /**
     * 备注
     */
    private String desc;

    /**
     * 
     */
    private Date gmtCreated;

    /**
     * 
     */
    private Date gmtModifed;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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
        Order other = (Order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getBuyCompanyId() == null ? other.getBuyCompanyId() == null : this.getBuyCompanyId().equals(other.getBuyCompanyId()))
            && (this.getRebateCompanyId() == null ? other.getRebateCompanyId() == null : this.getRebateCompanyId().equals(other.getRebateCompanyId()))
            && (this.getRebateId() == null ? other.getRebateId() == null : this.getRebateId().equals(other.getRebateId()))
            && (this.getRebatePercent() == null ? other.getRebatePercent() == null : this.getRebatePercent().equals(other.getRebatePercent()))
            && (this.getRebatePrice() == null ? other.getRebatePrice() == null : this.getRebatePrice().equals(other.getRebatePrice()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getGmtCreated() == null ? other.getGmtCreated() == null : this.getGmtCreated().equals(other.getGmtCreated()))
            && (this.getGmtModifed() == null ? other.getGmtModifed() == null : this.getGmtModifed().equals(other.getGmtModifed()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getBuyCompanyId() == null) ? 0 : getBuyCompanyId().hashCode());
        result = prime * result + ((getRebateCompanyId() == null) ? 0 : getRebateCompanyId().hashCode());
        result = prime * result + ((getRebateId() == null) ? 0 : getRebateId().hashCode());
        result = prime * result + ((getRebatePercent() == null) ? 0 : getRebatePercent().hashCode());
        result = prime * result + ((getRebatePrice() == null) ? 0 : getRebatePrice().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getGmtCreated() == null) ? 0 : getGmtCreated().hashCode());
        result = prime * result + ((getGmtModifed() == null) ? 0 : getGmtModifed().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", price=").append(price);
        sb.append(", state=").append(state);
        sb.append(", buyCompanyId=").append(buyCompanyId);
        sb.append(", rebateCompanyId=").append(rebateCompanyId);
        sb.append(", rebateId=").append(rebateId);
        sb.append(", rebatePercent=").append(rebatePercent);
        sb.append(", rebatePrice=").append(rebatePrice);
        sb.append(", desc=").append(desc);
        sb.append(", gmtCreated=").append(gmtCreated);
        sb.append(", gmtModifed=").append(gmtModifed);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}