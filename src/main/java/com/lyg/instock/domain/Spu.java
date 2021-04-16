package com.lyg.instock.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * null
 * @TableName spu
 */
@TableName(value ="spu")
@Data
public class Spu implements Serializable {
    /**
     * spu_id
     */
    @TableId
    private Integer spuId;

    /**
     * spu_name
     */
    private String spuName;

    /**
     * 品牌id
     */
    private Integer brandId;

    /**
     * 类别id
     */
    private Integer categoryId;

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
        Spu other = (Spu) that;
        return (this.getSpuId() == null ? other.getSpuId() == null : this.getSpuId().equals(other.getSpuId()))
            && (this.getSpuName() == null ? other.getSpuName() == null : this.getSpuName().equals(other.getSpuName()))
            && (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getGmtCreated() == null ? other.getGmtCreated() == null : this.getGmtCreated().equals(other.getGmtCreated()))
            && (this.getGmtModifed() == null ? other.getGmtModifed() == null : this.getGmtModifed().equals(other.getGmtModifed()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpuId() == null) ? 0 : getSpuId().hashCode());
        result = prime * result + ((getSpuName() == null) ? 0 : getSpuName().hashCode());
        result = prime * result + ((getBrandId() == null) ? 0 : getBrandId().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
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
        sb.append(", spuId=").append(spuId);
        sb.append(", spuName=").append(spuName);
        sb.append(", brandId=").append(brandId);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", gmtCreated=").append(gmtCreated);
        sb.append(", gmtModifed=").append(gmtModifed);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}