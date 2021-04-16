package com.lyg.instock.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * null
 * @TableName sku
 */
@TableName(value ="sku")
@Data
public class Sku implements Serializable {
    /**
     * 商品id
     */
    @TableId
    private Integer skuId;

    /**
     * 商品名字
     */
    private String skuName;

    /**
     * 
     */
    private Integer weight;

    /**
     * 单位
     */
    private String unit;

    /**
     * 是否小样
     */
    private Integer isTiny;

    /**
     * 商品
     */
    private String spuId;

    /**
     * 
     */
    private Integer brandId;

    /**
     * 图片路径
     */
    private String skuPic;

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
        Sku other = (Sku) that;
        return (this.getSkuId() == null ? other.getSkuId() == null : this.getSkuId().equals(other.getSkuId()))
            && (this.getSkuName() == null ? other.getSkuName() == null : this.getSkuName().equals(other.getSkuName()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getIsTiny() == null ? other.getIsTiny() == null : this.getIsTiny().equals(other.getIsTiny()))
            && (this.getSpuId() == null ? other.getSpuId() == null : this.getSpuId().equals(other.getSpuId()))
            && (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getSkuPic() == null ? other.getSkuPic() == null : this.getSkuPic().equals(other.getSkuPic()))
            && (this.getGmtCreated() == null ? other.getGmtCreated() == null : this.getGmtCreated().equals(other.getGmtCreated()))
            && (this.getGmtModifed() == null ? other.getGmtModifed() == null : this.getGmtModifed().equals(other.getGmtModifed()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSkuId() == null) ? 0 : getSkuId().hashCode());
        result = prime * result + ((getSkuName() == null) ? 0 : getSkuName().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getIsTiny() == null) ? 0 : getIsTiny().hashCode());
        result = prime * result + ((getSpuId() == null) ? 0 : getSpuId().hashCode());
        result = prime * result + ((getBrandId() == null) ? 0 : getBrandId().hashCode());
        result = prime * result + ((getSkuPic() == null) ? 0 : getSkuPic().hashCode());
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
        sb.append(", skuId=").append(skuId);
        sb.append(", skuName=").append(skuName);
        sb.append(", weight=").append(weight);
        sb.append(", unit=").append(unit);
        sb.append(", isTiny=").append(isTiny);
        sb.append(", spuId=").append(spuId);
        sb.append(", brandId=").append(brandId);
        sb.append(", skuPic=").append(skuPic);
        sb.append(", gmtCreated=").append(gmtCreated);
        sb.append(", gmtModifed=").append(gmtModifed);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}