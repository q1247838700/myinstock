package com.lyg.instock.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * null
 * @TableName track
 */
@TableName(value ="track")
@Data
public class Track implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 快递单号
     */
    private String trackId;

    /**
     * 快递公司id
     */
    private String trackCompanyId;

    /**
     * 快递公司名字
     */
    private String trackCompanyName;

    /**
     * 货物描述
     */
    private String describtion;

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 转运公司id
     */
    private String transferId;

    /**
     * 转运公司名字
     */
    private String transferName;

    /**
     * 国家
     */
    private String state;

    /**
     * 状态
     */
    private String status;

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
        Track other = (Track) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTrackId() == null ? other.getTrackId() == null : this.getTrackId().equals(other.getTrackId()))
            && (this.getTrackCompanyId() == null ? other.getTrackCompanyId() == null : this.getTrackCompanyId().equals(other.getTrackCompanyId()))
            && (this.getTrackCompanyName() == null ? other.getTrackCompanyName() == null : this.getTrackCompanyName().equals(other.getTrackCompanyName()))
            && (this.getDescribtion() == null ? other.getDescribtion() == null : this.getDescribtion().equals(other.getDescribtion()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getTransferId() == null ? other.getTransferId() == null : this.getTransferId().equals(other.getTransferId()))
            && (this.getTransferName() == null ? other.getTransferName() == null : this.getTransferName().equals(other.getTransferName()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getGmtCreated() == null ? other.getGmtCreated() == null : this.getGmtCreated().equals(other.getGmtCreated()))
            && (this.getGmtModifed() == null ? other.getGmtModifed() == null : this.getGmtModifed().equals(other.getGmtModifed()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTrackId() == null) ? 0 : getTrackId().hashCode());
        result = prime * result + ((getTrackCompanyId() == null) ? 0 : getTrackCompanyId().hashCode());
        result = prime * result + ((getTrackCompanyName() == null) ? 0 : getTrackCompanyName().hashCode());
        result = prime * result + ((getDescribtion() == null) ? 0 : getDescribtion().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getTransferId() == null) ? 0 : getTransferId().hashCode());
        result = prime * result + ((getTransferName() == null) ? 0 : getTransferName().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        sb.append(", trackId=").append(trackId);
        sb.append(", trackCompanyId=").append(trackCompanyId);
        sb.append(", trackCompanyName=").append(trackCompanyName);
        sb.append(", describtion=").append(describtion);
        sb.append(", orderId=").append(orderId);
        sb.append(", transferId=").append(transferId);
        sb.append(", transferName=").append(transferName);
        sb.append(", state=").append(state);
        sb.append(", status=").append(status);
        sb.append(", gmtCreated=").append(gmtCreated);
        sb.append(", gmtModifed=").append(gmtModifed);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}