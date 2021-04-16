package com.lyg.instock.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * null
 * @TableName track_company_name
 */
@TableName(value ="track_company_name")
@Data
public class TrackCompanyName implements Serializable {
    /**
     * 快递公司id
     */
    @TableId
    private Integer trackCompanyId;

    /**
     * 快递公司名字
     */
    private String trackCompanyName;

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
        TrackCompanyName other = (TrackCompanyName) that;
        return (this.getTrackCompanyId() == null ? other.getTrackCompanyId() == null : this.getTrackCompanyId().equals(other.getTrackCompanyId()))
            && (this.getTrackCompanyName() == null ? other.getTrackCompanyName() == null : this.getTrackCompanyName().equals(other.getTrackCompanyName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTrackCompanyId() == null) ? 0 : getTrackCompanyId().hashCode());
        result = prime * result + ((getTrackCompanyName() == null) ? 0 : getTrackCompanyName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", trackCompanyId=").append(trackCompanyId);
        sb.append(", trackCompanyName=").append(trackCompanyName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}