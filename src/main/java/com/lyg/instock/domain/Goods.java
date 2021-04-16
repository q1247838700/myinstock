package com.lyg.instock.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 物品表
 * @TableName goods
 */
@TableName(value ="goods")
@Data
public class Goods implements Serializable {
    /**
     * id
     */
    @TableId
    private Integer id;

    /**
     * 商品编号
     */
    private Integer skuId;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 快递单号
     */
    private String trackId;

    /**
     * 创建时间
     */
    private Date gmtCreated;

    /**
     * 修改时间
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
        Goods other = (Goods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSkuId() == null ? other.getSkuId() == null : this.getSkuId().equals(other.getSkuId()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getTrackId() == null ? other.getTrackId() == null : this.getTrackId().equals(other.getTrackId()))
            && (this.getGmtCreated() == null ? other.getGmtCreated() == null : this.getGmtCreated().equals(other.getGmtCreated()))
            && (this.getGmtModifed() == null ? other.getGmtModifed() == null : this.getGmtModifed().equals(other.getGmtModifed()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSkuId() == null) ? 0 : getSkuId().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getTrackId() == null) ? 0 : getTrackId().hashCode());
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
        sb.append(", skuId=").append(skuId);
        sb.append(", price=").append(price);
        sb.append(", num=").append(num);
        sb.append(", orderId=").append(orderId);
        sb.append(", trackId=").append(trackId);
        sb.append(", gmtCreated=").append(gmtCreated);
        sb.append(", gmtModifed=").append(gmtModifed);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}